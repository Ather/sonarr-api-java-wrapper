package media.thehoard.thirdparty.api.sonarr.endpoints.history;

import media.thehoard.thirdparty.api.sonarr.endpoints.Episode;
import media.thehoard.thirdparty.api.sonarr.endpoints.common.Quality;
import media.thehoard.thirdparty.api.sonarr.endpoints.series.Series;

import java.util.HashMap;
import java.util.Map;

public class HistoryRecord {

	private Integer episodeId;
	private Integer seriesId;
	private String sourceTitle;
	private Quality quality;
	private Boolean qualityCutoffNotMet;
	private String date;
	private String downloadId;
	private String eventType;
	private HistoryData data;
	private Episode episode;
	private Series series;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public String getSourceTitle() {
		return sourceTitle;
	}

	public void setSourceTitle(String sourceTitle) {
		this.sourceTitle = sourceTitle;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public Boolean getQualityCutoffNotMet() {
		return qualityCutoffNotMet;
	}

	public void setQualityCutoffNotMet(Boolean qualityCutoffNotMet) {
		this.qualityCutoffNotMet = qualityCutoffNotMet;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDownloadId() {
		return downloadId;
	}

	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public HistoryData getData() {
		return data;
	}

	public void setData(HistoryData data) {
		this.data = data;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
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