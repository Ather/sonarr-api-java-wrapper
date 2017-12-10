package media.thehoard.thirdparty.api.sonarr.endpoints.profile;

import java.util.HashMap;
import java.util.Map;

public class Item {
	private Quality quality;
	private Boolean allowed;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public Item withQuality(Quality quality) {
		this.quality = quality;
		return this;
	}

	public Boolean getAllowed() {
		return allowed;
	}

	public void setAllowed(Boolean allowed) {
		this.allowed = allowed;
	}

	public Item withAllowed(Boolean allowed) {
		this.allowed = allowed;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Item withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}