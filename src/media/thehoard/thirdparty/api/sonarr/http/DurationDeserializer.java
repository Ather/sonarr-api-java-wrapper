package media.thehoard.thirdparty.api.sonarr.http;

import java.lang.reflect.Type;
import java.time.Duration;

import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DurationDeserializer implements JsonDeserializer<Duration> {
	private static final PeriodFormatter formatter = new PeriodFormatterBuilder().appendHours().appendSuffix(":").appendMinutes().appendSuffix(":").appendSeconds().appendSuffix(".").appendMillis().toFormatter();

	@Override
	public Duration deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {		
		return Duration.parse(formatter.parsePeriod(json.getAsString()).toStandardDuration().toString());
	}
}
