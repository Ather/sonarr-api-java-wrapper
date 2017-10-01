package media.thehoard.thirdparty.api.sonarr.endpoints.calendar;

import java.util.Date;

import media.thehoard.thirdparty.api.sonarr.endpoints.series.Series;
import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class Calendar extends GenericJson {
	/**
	 * ID of the series
	 */
	private Integer seriesId;
	
	/**
	 * ID of the episode's file ID
	 */
	private Integer episodeFileId;
	
	/**
	 * Season number
	 */
	private Integer seasonNumber;
	
	/**
	 * Episode number within the season
	 */
	private Integer episodeNumber;
	
	/**
	 * Episode title
	 */
	private String title;
	
	/**
	 * Date of the episode airing (in YYYY-MM-DD)
	 */
	private Date airDate;
	
	/**
	 * Date of the episode airing (ISO 8601)
	 */
	private Date airDateUtc;
	
	/**
	 * Episode description
	 */
	private String overview;
	
	/**
	 * Whether the server has already downloaded the episode
	 */
	private Boolean hasFile;
	
	/**
	 * Whether the episode is monitored
	 */
	private Boolean monitored;
	
	/**
	 * The scene episode number
	 */
	private Integer sceneEpisodeNumber;
	
	/**
	 * The scene season number
	 */
	private Integer sceneSeasonNumber;
	
	/**
	 * The Episode ID on TheTVDB
	 */
	private Integer tvDbEpisodeId;
	
	/**
	 * The series object
	 */
	private Series series;
	
	/**
	 * Whether the episode is currently downloading
	 */
	private Boolean downloading;
	
	/**
	 * The ID of the episode file
	 */
	private Integer id;

	/**
	 * @return the seriesId
	 */
	public Integer getSeriesId() {
		return seriesId;
	}

	/**
	 * @param seriesId the seriesId to set
	 * @return updated CalendarItem object
	 */
	public Calendar setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
		return this;
	}

	/**
	 * @return the episodeFileId
	 */
	public Integer getEpisodeFileId() {
		return episodeFileId;
	}

	/**
	 * @param episodeFileId the episodeFileId to set
	 * @return updated CalendarItem object
	 */
	public Calendar setEpisodeFileId(Integer episodeFileId) {
		this.episodeFileId = episodeFileId;
		return this;
	}

	/**
	 * @return the seasonNumber
	 */
	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	/**
	 * @param seasonNumber the seasonNumber to set
	 * @return updated CalendarItem object
	 */
	public Calendar setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}

	/**
	 * @return the episodeNumber
	 */
	public Integer getEpisodeNumber() {
		return episodeNumber;
	}

	/**
	 * @param episodeNumber the episodeNumber to set
	 * @return updated CalendarItem object
	 */
	public Calendar setEpisodeNumber(Integer episodeNumber) {
		this.episodeNumber = episodeNumber;
		return this;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 * @return updated CalendarItem object
	 */
	public Calendar setTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * @return the airDate
	 */
	public Date getAirDate() {
		return airDate;
	}

	/**
	 * @param airDate the airDate to set
	 * @return updated CalendarItem object
	 */
	public Calendar setAirDate(Date airDate) {
		this.airDate = airDate;
		return this;
	}

	/**
	 * @return the airDateUtc
	 */
	public Date getAirDateUtc() {
		return airDateUtc;
	}

	/**
	 * @param airDateUtc the airDateUtc to set
	 * @return updated CalendarItem object
	 */
	public Calendar setAirDateUtc(Date airDateUtc) {
		this.airDateUtc = airDateUtc;
		return this;
	}

	/**
	 * @return the overview
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * @param overview the overview to set
	 * @return updated CalendarItem object
	 */
	public Calendar setOverview(String overview) {
		this.overview = overview;
		return this;
	}

	/**
	 * @return the hasFile
	 */
	public Boolean getHasFile() {
		return hasFile;
	}

	/**
	 * @param hasFile the hasFile to set
	 * @return updated CalendarItem object
	 */
	public Calendar setHasFile(Boolean hasFile) {
		this.hasFile = hasFile;
		return this;
	}

	/**
	 * @return the monitored
	 */
	public Boolean getMonitored() {
		return monitored;
	}

	/**
	 * @param monitored the monitored to set
	 * @return updated CalendarItem object
	 */
	public Calendar setMonitored(Boolean monitored) {
		this.monitored = monitored;
		return this;
	}

	/**
	 * @return the sceneEpisodeNumber
	 */
	public Integer getSceneEpisodeNumber() {
		return sceneEpisodeNumber;
	}

	/**
	 * @param sceneEpisodeNumber the sceneEpisodeNumber to set
	 * @return updated CalendarItem object
	 */
	public Calendar setSceneEpisodeNumber(Integer sceneEpisodeNumber) {
		this.sceneEpisodeNumber = sceneEpisodeNumber;
		return this;
	}

	/**
	 * @return the sceneSeasonNumber
	 */
	public Integer getSceneSeasonNumber() {
		return sceneSeasonNumber;
	}

	/**
	 * @param sceneSeasonNumber the sceneSeasonNumber to set
	 * @return updated CalendarItem object
	 */
	public Calendar setSceneSeasonNumber(Integer sceneSeasonNumber) {
		this.sceneSeasonNumber = sceneSeasonNumber;
		return this;
	}

	/**
	 * @return the tvDbEpisodeId
	 */
	public Integer getTvDbEpisodeId() {
		return tvDbEpisodeId;
	}

	/**
	 * @param tvDbEpisodeId the tvDbEpisodeId to set
	 * @return updated CalendarItem object
	 */
	public Calendar setTvDbEpisodeId(Integer tvDbEpisodeId) {
		this.tvDbEpisodeId = tvDbEpisodeId;
		return this;
	}

	/**
	 * @return the series
	 */
	public Series getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 * @return updated CalendarItem object
	 */
	public Calendar setSeries(Series series) {
		this.series = series;
		return this;
	}

	/**
	 * @return the downloading
	 */
	public Boolean getDownloading() {
		return downloading;
	}

	/**
	 * @param downloading the downloading to set
	 * @return updated CalendarItem object
	 */
	public Calendar setDownloading(Boolean downloading) {
		this.downloading = downloading;
		return this;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 * @return updated CalendarItem object
	 */
	public Calendar setId(Integer id) {
		this.id = id;
		return this;
	}
}
