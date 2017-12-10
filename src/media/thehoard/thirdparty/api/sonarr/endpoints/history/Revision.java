package media.thehoard.thirdparty.api.sonarr.endpoints.history;

import java.util.HashMap;
import java.util.Map;

public class Revision {
	private Integer version;
	private Integer real;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getReal() {
		return real;
	}

	public void setReal(Integer real) {
		this.real = real;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
