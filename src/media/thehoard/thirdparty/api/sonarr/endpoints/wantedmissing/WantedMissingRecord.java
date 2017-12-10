package media.thehoard.thirdparty.api.sonarr.endpoints.wantedmissing;

import media.thehoard.thirdparty.api.sonarr.endpoints.series.Series;

import java.util.HashMap;
import java.util.Map;

public class WantedMissingRecord {

	private Integer seriesId;
	private Integer episodeFileId;
	private Integer seasonNumber;
	private Integer episodeNumber;
	private String title;
	private String airDate;
	private String airDateUtc;
	private String overview;
	private Boolean hasFile;
	private Boolean monitored;
	private Integer sceneEpisodeNumber;
	private Integer sceneSeasonNumber;
	private Integer tvDbEpisodeId;
	private Integer absoluteEpisodeNumber;
	private Series series;
	private Boolean downloading;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public WantedMissingRecord withSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
		return this;
	}

	public Integer getEpisodeFileId() {
		return episodeFileId;
	}

	public void setEpisodeFileId(Integer episodeFileId) {
		this.episodeFileId = episodeFileId;
	}

	public WantedMissingRecord withEpisodeFileId(Integer episodeFileId) {
		this.episodeFileId = episodeFileId;
		return this;
	}

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public WantedMissingRecord withSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}

	public Integer getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(Integer episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public WantedMissingRecord withEpisodeNumber(Integer episodeNumber) {
		this.episodeNumber = episodeNumber;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public WantedMissingRecord withTitle(String title) {
		this.title = title;
		return this;
	}

	public String getAirDate() {
		return airDate;
	}

	public void setAirDate(String airDate) {
		this.airDate = airDate;
	}

	public WantedMissingRecord withAirDate(String airDate) {
		this.airDate = airDate;
		return this;
	}

	public String getAirDateUtc() {
		return airDateUtc;
	}

	public void setAirDateUtc(String airDateUtc) {
		this.airDateUtc = airDateUtc;
	}

	public WantedMissingRecord withAirDateUtc(String airDateUtc) {
		this.airDateUtc = airDateUtc;
		return this;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public WantedMissingRecord withOverview(String overview) {
		this.overview = overview;
		return this;
	}

	public Boolean getHasFile() {
		return hasFile;
	}

	public void setHasFile(Boolean hasFile) {
		this.hasFile = hasFile;
	}

	public WantedMissingRecord withHasFile(Boolean hasFile) {
		this.hasFile = hasFile;
		return this;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean monitored) {
		this.monitored = monitored;
	}

	public WantedMissingRecord withMonitored(Boolean monitored) {
		this.monitored = monitored;
		return this;
	}

	public Integer getSceneEpisodeNumber() {
		return sceneEpisodeNumber;
	}

	public void setSceneEpisodeNumber(Integer sceneEpisodeNumber) {
		this.sceneEpisodeNumber = sceneEpisodeNumber;
	}

	public WantedMissingRecord withSceneEpisodeNumber(Integer sceneEpisodeNumber) {
		this.sceneEpisodeNumber = sceneEpisodeNumber;
		return this;
	}

	public Integer getSceneSeasonNumber() {
		return sceneSeasonNumber;
	}

	public void setSceneSeasonNumber(Integer sceneSeasonNumber) {
		this.sceneSeasonNumber = sceneSeasonNumber;
	}

	public WantedMissingRecord withSceneSeasonNumber(Integer sceneSeasonNumber) {
		this.sceneSeasonNumber = sceneSeasonNumber;
		return this;
	}

	public Integer getTvDbEpisodeId() {
		return tvDbEpisodeId;
	}

	public void setTvDbEpisodeId(Integer tvDbEpisodeId) {
		this.tvDbEpisodeId = tvDbEpisodeId;
	}

	public WantedMissingRecord withTvDbEpisodeId(Integer tvDbEpisodeId) {
		this.tvDbEpisodeId = tvDbEpisodeId;
		return this;
	}

	public Integer getAbsoluteEpisodeNumber() {
		return absoluteEpisodeNumber;
	}

	public void setAbsoluteEpisodeNumber(Integer absoluteEpisodeNumber) {
		this.absoluteEpisodeNumber = absoluteEpisodeNumber;
	}

	public WantedMissingRecord withAbsoluteEpisodeNumber(Integer absoluteEpisodeNumber) {
		this.absoluteEpisodeNumber = absoluteEpisodeNumber;
		return this;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public WantedMissingRecord withSeries(Series series) {
		this.series = series;
		return this;
	}

	public Boolean getDownloading() {
		return downloading;
	}

	public void setDownloading(Boolean downloading) {
		this.downloading = downloading;
	}

	public WantedMissingRecord withDownloading(Boolean downloading) {
		this.downloading = downloading;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public WantedMissingRecord withId(Integer id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public WantedMissingRecord withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}