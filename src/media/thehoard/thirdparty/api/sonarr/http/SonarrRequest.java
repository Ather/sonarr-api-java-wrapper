package media.thehoard.thirdparty.api.sonarr.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.Future;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import media.thehoard.thirdparty.api.sonarr.SonarrClient;

import static media.thehoard.thirdparty.api.sonarr.SonarrClient.CLIENT_THREADPOOL;

public class SonarrRequest<ContentType, ResponseType> {
	private SonarrClient SONARR_CLIENT;

	private RequestMethod requestMethod;

	private static HttpClient httpClient = HttpClientBuilder.create().build();

	private RequestBuilder requestBuilder;

	private String requestUrl;

	protected ContentType content;

	private Type responseType;

	protected SonarrRequest(SonarrClient sonarrClient, RequestMethod requestMethod, String endpoint, ContentType content, Type responseType) {
		this.SONARR_CLIENT = sonarrClient;
		this.requestMethod = requestMethod;
		this.requestUrl = SONARR_CLIENT.getApiUrl() + endpoint;

		this.content = content;

		this.responseType = responseType;

		switch (this.requestMethod) {
		case POST:
			requestBuilder = RequestBuilder.post();
			break;
		case PUT:
			requestBuilder = RequestBuilder.put();
			break;
		case DELETE:
			requestBuilder = RequestBuilder.delete();
			break;
		case GET:
		default:
			requestBuilder = RequestBuilder.get();
			break;
		}

		requestBuilder.setUri(requestUrl);

		requestBuilder.addParameter("apikey", SONARR_CLIENT.getApiKey());
	}

	protected SonarrRequest(SonarrClient sonarrClient, RequestMethod requestMethod, String endpoint, Type responseType) {
		this(sonarrClient, requestMethod, endpoint, null, responseType);
	}

	public RequestBuilder getRequestBuilder() {
		return this.requestBuilder;
	}

	public ContentType getContent() {
		return this.content;
	}

	public void addParameter(String parameterName, String parameterValue) {
		requestBuilder.addParameter(parameterName, parameterValue);
	}
	
	public void addGsonTypeAdapter(RuntimeTypeAdapterFactory<?> adapter) {
		gsonBuilder.registerTypeAdapterFactory(adapter);
	}

	protected ResponseType execute(Type responseType) throws IOException {
		Gson gson = getGson();

		if (this.requestMethod == RequestMethod.POST || this.requestMethod == RequestMethod.PUT) {
			try {
				requestBuilder.setEntity(new StringEntity(gson.toJson(content)));
			} catch (UnsupportedEncodingException e) {
				// TODO logging
				// This shouldn't happen
				e.printStackTrace();
			}
		}

		HttpResponse response = httpClient.execute(requestBuilder.build());

		try {
			String json = EntityUtils.toString(response.getEntity());
			ResponseType jsonResp = gson.fromJson(json, responseType);
			return jsonResp;
		} catch (JsonSyntaxException | ParseException e) {
			// TODO Logging
			System.out.println("Failed to prepare return response");
			e.printStackTrace();

			return null;
		}
	}

	public Future<ResponseType> executeAsync(Type responseType) {
		return CLIENT_THREADPOOL.submit(() -> execute(responseType));
	}
	
	public ResponseType execute() throws IOException {
		return execute(responseType);
	}

	public Future<ResponseType> executeAsync() {
		return executeAsync(responseType);
	}

	private GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).registerTypeAdapter(Duration.class, new DurationDeserializer());

	public Gson getGson() {
		return gsonBuilder.create();
	}
}
