package media.thehoard.thirdparty.api.sonarr.endpoints.profile;

import java.util.HashMap;
import java.util.Map;

public class Quality {

	private Integer id;
	private String name;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Quality withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Quality withName(String name) {
		this.name = name;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Quality withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
