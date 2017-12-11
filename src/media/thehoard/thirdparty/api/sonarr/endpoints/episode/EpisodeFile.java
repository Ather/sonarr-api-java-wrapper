
package media.thehoard.thirdparty.api.sonarr.endpoints.episode;

import java.util.HashMap;
import java.util.Map;

public class EpisodeFile {
	private Integer seriesId;
	private Integer seasonNumber;
	private String path;
	private Long size;
	private String dateAdded;
	private String sceneName;
	private EpisodeQuality quality;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getSceneName() {
		return sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public EpisodeQuality getQuality() {
		return quality;
	}

	public void setQuality(EpisodeQuality quality) {
		this.quality = quality;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}