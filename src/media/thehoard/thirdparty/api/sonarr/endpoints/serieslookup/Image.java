package media.thehoard.thirdparty.api.sonarr.endpoints.serieslookup;

import java.util.HashMap;
import java.util.Map;

public class Image {

	private String coverType;
	private String url;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	public Image withCoverType(String coverType) {
		this.coverType = coverType;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Image withUrl(String url) {
		this.url = url;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Image withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
