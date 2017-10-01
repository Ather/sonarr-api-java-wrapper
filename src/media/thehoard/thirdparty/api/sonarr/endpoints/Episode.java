package media.thehoard.thirdparty.api.sonarr.endpoints;

import java.util.Date;

public class Episode {
	/*
	 * Series id the episode belongs to
	 */
	private Integer seriesId;
	
	/*
	 * id of the correlating episode file
	 */
	private Integer episodeFileId;
	
	/*
	 * Season number of the episode
	 */
	private Integer seasonNumber;
	
	/*
	 * Episode number within the season
	 */
	private Integer episodeNumber;

	/*
	 * Title of the episode
	 */
	private String title;
	
	/*
	 * Air date (day) of the episode
	 */
	private Date airDate;
	
	/*
	 * Time-based air date of the episode
	 */
	private Date airDateUtc;
	
	/*
	 * Description of the episode
	 */
	private String overview;
	
	/*
	 * Whether the file has been downloaded
	 */
	private Boolean hasFile;
	
	/*
	 * Whether the episode is monitored
	 */
	private Boolean monitored;
	
	/*
	 * Scene episode number
	 */
	private Integer sceneEpisodeNumber;
	
	/*
	 * Scene season number
	 */
	private Integer sceneSeasonNumber;
	
	/*
	 * ID of the episode on TheTVDB
	 */
	private Integer tvDbEpisodeId;
	
	/*
	 * Episode number within the series
	 */
	private Integer absoluteEpisodeNumber;
	
	/*
	 * Whether the episode is currently downloading
	 */
	private Boolean downloading;
	
	/*
	 * Episode id
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
	 */
	public Episode setSeriesId(Integer seriesId) {
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
	 */
	public Episode setEpisodeFileId(Integer episodeFileId) {
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
	 */
	public Episode setSeasonNumber(Integer seasonNumber) {
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
	 */
	public Episode setEpisodeNumber(Integer episodeNumber) {
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
	 */
	public Episode setTitle(String title) {
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
	 */
	public Episode setAirDate(Date airDate) {
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
	 */
	public Episode setAirDateUtc(Date airDateUtc) {
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
	 */
	public Episode setOverview(String overview) {
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
	 */
	public Episode setHasFile(Boolean hasFile) {
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
	 */
	public Episode setMonitored(Boolean monitored) {
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
	 */
	public Episode setSceneEpisodeNumber(Integer sceneEpisodeNumber) {
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
	 */
	public Episode setSceneSeasonNumber(Integer sceneSeasonNumber) {
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
	 */
	public Episode setTvDbEpisodeId(Integer tvDbEpisodeId) {
		this.tvDbEpisodeId = tvDbEpisodeId;
		return this;
	}

	/**
	 * @return the absoluteEpisodeNumber
	 */
	public Integer getAbsoluteEpisodeNumber() {
		return absoluteEpisodeNumber;
	}

	/**
	 * @param absoluteEpisodeNumber the absoluteEpisodeNumber to set
	 */
	public Episode setAbsoluteEpisodeNumber(Integer absoluteEpisodeNumber) {
		this.absoluteEpisodeNumber = absoluteEpisodeNumber;
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
	 */
	public Episode setDownloading(Boolean downloading) {
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
	 */
	public Episode setId(Integer id) {
		this.id = id;
		return this;
	}
}
