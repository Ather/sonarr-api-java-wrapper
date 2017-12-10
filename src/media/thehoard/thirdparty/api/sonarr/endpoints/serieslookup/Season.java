package media.thehoard.thirdparty.api.sonarr.endpoints.serieslookup;

import java.util.HashMap;
import java.util.Map;

public class Season {

	private Integer seasonNumber;
	private Boolean monitored;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public Season withSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean monitored) {
		this.monitored = monitored;
	}

	public Season withMonitored(Boolean monitored) {
		this.monitored = monitored;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Season withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
