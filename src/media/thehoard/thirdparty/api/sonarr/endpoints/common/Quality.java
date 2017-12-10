package media.thehoard.thirdparty.api.sonarr.endpoints.common;

import media.thehoard.thirdparty.api.sonarr.endpoints.history.Revision;

import java.util.HashMap;
import java.util.Map;

public class Quality {
	private QualityProfile quality;
	private Revision revision;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public QualityProfile getQuality() {
		return quality;
	}

	public void setQuality(QualityProfile quality) {
		this.quality = quality;
	}

	public Revision getRevision() {
		return revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}