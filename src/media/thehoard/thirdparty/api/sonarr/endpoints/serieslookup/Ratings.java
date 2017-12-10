package media.thehoard.thirdparty.api.sonarr.endpoints.serieslookup;

import java.util.HashMap;
import java.util.Map;

public class Ratings {

	private Integer votes;
	private Double value;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Ratings withVotes(Integer votes) {
		this.votes = votes;
		return this;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Ratings withValue(Double value) {
		this.value = value;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Ratings withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
