package media.thehoard.thirdparty.api.sonarr.endpoints.episode;

import media.thehoard.thirdparty.api.sonarr.endpoints.common.QualityProfile;

import java.util.HashMap;
import java.util.Map;

public class EpisodeQuality {
	private QualityProfile quality;
	private Boolean proper;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public QualityProfile getQuality() {
		return quality;
	}

	public void setQuality(QualityProfile quality) {
		this.quality = quality;
	}

	public Boolean getProper() {
		return proper;
	}

	public void setProper(Boolean proper) {
		this.proper = proper;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}