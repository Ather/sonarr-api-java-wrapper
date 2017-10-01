package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import java.util.Date;
import java.util.List;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class Series extends GenericJson {
	/**
	 * Title/name of the series
	 */
	private String title;

	/**
	 * List of alternate titles of a series Typically relates to other languages or
	 * name changes
	 */
	private List<AlternateTitle> alternateTitles;

	/**
	 * Sort title is the regular title in lower case with symbols removed, and
	 * common words like "the" removed.
	 */
	private String sortTitle;

	/**
	 * Number of seasons in the show
	 */
	private Integer seasonCount;

	/**
	 * Total number of episodes for the show
	 */
	private Integer totalEpisodeCount;

	/**
	 * Number of episodes on the disk for the show
	 */
	private Integer episodeCount;

	/**
	 * Number of episode files on the disk for the show
	 */
	private Integer episodeFileCount;

	/**
	 * Size in bytes of the series on the disk
	 */
	private Long sizeOnDisk;

	/**
	 * Status of the show Either "continuing" or "ended"
	 */
	private SeriesStatus status;

	/**
	 * Description of the show
	 */
	private String overview;

	/**
	 * Airtime of the next episode
	 */
	private Date nextAiring;

	/**
	 * Airtime of the previous episode
	 */
	private Date previousAiring;

	/**
	 * Network the show is produced by
	 */
	private String network;

	/**
	 * Time of day the show airs
	 */
	private String airTime;

	/**
	 * List of images for the show, typically fanart, banner, and poster
	 */
	private List<Image> images;

	/**
	 * Link to remote poster (typically on {@link http://www.thetvdb.com})
	 */
	private String remotePoster;

	/**
	 * List of seasons with statistics and info
	 */
	private List<Season> seasons;

	/**
	 * Year the show released
	 */
	private Long year;

	/**
	 * Path to the series on the disk
	 */
	private String path;

	/**
	 * Profile ID of the series (related to accepted qualities)
	 */
	private Integer profileId;

	/**
	 * Whether to use season folders
	 */
	private Boolean seasonFolder;

	/**
	 * Whether the show is monitored
	 */
	private Boolean monitored;

	/**
	 * Whether to use scene numbering
	 */
	private Boolean useSceneNumbering;

	/**
	 * Standard runtime of each episode in the show
	 */
	private Integer runtime;

	/**
	 * ID of the show at {@link http://www.thetvdb.com/}
	 */
	private Long tvdbId;

	/**
	 * ID of the show at {@link http://www.tvrage.com/}
	 */
	@Deprecated
	private Long tvRageId;

	/**
	 * ID of the show at {@link http://www.tvmaze.com/}
	 */
	private Long tvMazeId;

	/**
	 * Date of the premiere of the first episode
	 */
	private Date firstAired;

	/**
	 * Date Sonarr last did a sync of info for the series
	 */
	private Date lastInfoSync;

	/**
	 * The type of series. "standard", "daily", or "anime"
	 */
	private String seriesType;

	/**
	 * Similar to the {@code #sortTitle}, this have spaces removed
	 */
	private String cleanTitle;

	/**
	 * ID of the show at {@link http://www.imdb.com/}
	 */
	private String imdbId;

	/**
	 * Similar to the {@code #sortTitle}, this has spaces replaced with '-'
	 */
	private String titleSlug;

	/**
	 * Age rating/restriction of the show
	 */
	private String certification;

	/**
	 * List of genres the show belongs to
	 */
	private List<String> genres;

	/**
	 * List of tags the show has
	 */
	private List<String> tags;

	/**
	 * Date the show was added to Sonarr
	 */
	private Date added;

	/**
	 * @see {@link #profileId}
	 */
	private Integer qualityProfileId;

	/**
	 * Ratings for the series
	 */
	private Rating ratings;
	
	/**
	 * Options to be used when adding the series (with post)
	 */
	private AddOptions addOptions;

	/**
	 * Sonarr ID for the series
	 */
	private Integer id;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 *            the title to set
	 * @return updated Series object
	 */
	public Series setTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * @return the alternateTitles
	 */
	public List<AlternateTitle> getAlternateTitles() {
		return alternateTitles;
	}

	/**
	 * @param alternateTitles
	 *            the alternateTitles to set
	 * @return updated Series object
	 */
	public Series setAlternateTitles(List<AlternateTitle> alternateTitles) {
		this.alternateTitles = alternateTitles;
		return this;
	}

	/**
	 * @return the sortTitle
	 */
	public String getSortTitle() {
		return sortTitle;
	}

	/**
	 * @param sortTitle
	 *            the sortTitle to set
	 * @return updated Series object
	 */
	public Series setSortTitle(String sortTitle) {
		this.sortTitle = sortTitle;
		return this;
	}

	/**
	 * @return the seasonCount
	 */
	public Integer getSeasonCount() {
		return seasonCount;
	}

	/**
	 * @param seasonCount
	 *            the seasonCount to set
	 * @return updated Series object
	 */
	public Series setSeasonCount(Integer seasonCount) {
		this.seasonCount = seasonCount;
		return this;
	}

	/**
	 * @return the totalEpisodeCount
	 */
	public Integer getTotalEpisodeCount() {
		return totalEpisodeCount;
	}

	/**
	 * @param totalEpisodeCount
	 *            the totalEpisodeCount to set
	 * @return updated Series object
	 */
	public Series setTotalEpisodeCount(Integer totalEpisodeCount) {
		this.totalEpisodeCount = totalEpisodeCount;
		return this;
	}

	/**
	 * @return the episodeCount
	 */
	public Integer getEpisodeCount() {
		return episodeCount;
	}

	/**
	 * @param episodeCount
	 *            the episodeCount to set
	 * @return updated Series object
	 */
	public Series setEpisodeCount(Integer episodeCount) {
		this.episodeCount = episodeCount;
		return this;
	}

	/**
	 * @return the episodeFileCount
	 */
	public Integer getEpisodeFileCount() {
		return episodeFileCount;
	}

	/**
	 * @param episodeFileCount
	 *            the episodeFileCount to set
	 * @return updated Series object
	 */
	public Series setEpisodeFileCount(Integer episodeFileCount) {
		this.episodeFileCount = episodeFileCount;
		return this;
	}

	/**
	 * @return the sizeOnDisk
	 */
	public Long getSizeOnDisk() {
		return sizeOnDisk;
	}

	/**
	 * @param sizeOnDisk
	 *            the sizeOnDisk to set
	 * @return updated Series object
	 */
	public Series setSizeOnDisk(Long sizeOnDisk) {
		this.sizeOnDisk = sizeOnDisk;
		return this;
	}

	/**
	 * @return the status
	 */
	public SeriesStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 * @return updated Series object
	 */
	public Series setStatus(SeriesStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * @return the overview
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * @param overview
	 *            the overview to set
	 * @return updated Series object
	 */
	public Series setOverview(String overview) {
		this.overview = overview;
		return this;
	}

	/**
	 * @return the nextAiring
	 */
	public Date getNextAiring() {
		return nextAiring;
	}

	/**
	 * @param nextAiring
	 *            the nextAiring to set
	 * @return updated Series object
	 */
	public Series setNextAiring(Date nextAiring) {
		this.nextAiring = nextAiring;
		return this;
	}

	/**
	 * @return the previousAiring
	 */
	public Date getPreviousAiring() {
		return previousAiring;
	}

	/**
	 * @param previousAiring
	 *            the previousAiring to set
	 * @return updated Series object
	 */
	public Series setPreviousAiring(Date previousAiring) {
		this.previousAiring = previousAiring;
		return this;
	}

	/**
	 * @return the network
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * @param network
	 *            the network to set
	 * @return updated Series object
	 */
	public Series setNetwork(String network) {
		this.network = network;
		return this;
	}

	/**
	 * @return the airTime
	 */
	public String getAirTime() {
		return airTime;
	}

	/**
	 * @param airTime
	 *            the airTime to set
	 * @return updated Series object
	 */
	public Series setAirTime(String airTime) {
		this.airTime = airTime;
		return this;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 * @return updated Series object
	 */
	public Series setImages(List<Image> images) {
		this.images = images;
		return this;
	}

	/**
	 * @return the remotePoster
	 */
	public String getRemotePoster() {
		return remotePoster;
	}

	/**
	 * @param remotePoster
	 *            the remotePoster to set
	 * @return updated Series object
	 */
	public Series setRemotePoster(String remotePoster) {
		this.remotePoster = remotePoster;
		return this;
	}

	/**
	 * @return the seasons
	 */
	public List<Season> getSeasons() {
		return seasons;
	}

	/**
	 * @param seasons
	 *            the seasons to set
	 * @return updated Series object
	 */
	public Series setSeasons(List<Season> seasons) {
		this.seasons = seasons;
		return this;
	}

	/**
	 * @return the year
	 */
	public Long getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 * @return updated Series object
	 */
	public Series setYear(Long year) {
		this.year = year;
		return this;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 * @return updated Series object
	 */
	public Series setPath(String path) {
		this.path = path;
		return this;
	}

	/**
	 * @return the profileId
	 */
	public Integer getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId
	 *            the profileId to set
	 * @return updated Series object
	 */
	public Series setProfileId(Integer profileId) {
		this.profileId = profileId;
		return this;
	}

	/**
	 * @return the seasonFolder
	 */
	public Boolean isSeasonFolder() {
		return seasonFolder;
	}

	/**
	 * @param seasonFolder
	 *            the seasonFolder to set
	 * @return updated Series object
	 */
	public Series setSeasonFolder(Boolean seasonFolder) {
		this.seasonFolder = seasonFolder;
		return this;
	}

	/**
	 * @return the monitored
	 */
	public Boolean isMonitored() {
		return monitored;
	}

	/**
	 * @param monitored
	 *            the monitored to set
	 * @return updated Series object
	 */
	public Series setMonitored(Boolean monitored) {
		this.monitored = monitored;
		return this;
	}

	/**
	 * @return the useSceneNumbering
	 */
	public Boolean isUseSceneNumbering() {
		return useSceneNumbering;
	}

	/**
	 * @param useSceneNumbering
	 *            the useSceneNumbering to set
	 * @return updated Series object
	 */
	public Series setUseSceneNumbering(Boolean useSceneNumbering) {
		this.useSceneNumbering = useSceneNumbering;
		return this;
	}

	/**
	 * @return the runtime
	 */
	public Integer getRuntime() {
		return runtime;
	}

	/**
	 * @param runtime
	 *            the runtime to set
	 * @return updated Series object
	 */
	public Series setRuntime(Integer runtime) {
		this.runtime = runtime;
		return this;
	}

	/**
	 * @return the tvdbId
	 */
	public Long getTvdbId() {
		return tvdbId;
	}

	/**
	 * @param tvdbId
	 *            the tvdbId to set
	 * @return updated Series object
	 */
	public Series setTvdbId(Long tvdbId) {
		this.tvdbId = tvdbId;
		return this;
	}

	/**
	 * @return the tvRageId
	 */
	public Long getTvRageId() {
		return tvRageId;
	}

	/**
	 * @param tvRageId
	 *            the tvRageId to set
	 * @return updated Series object
	 */
	public Series setTvRageId(Long tvRageId) {
		this.tvRageId = tvRageId;
		return this;
	}

	/**
	 * @return the tvMazeId
	 */
	public Long getTvMazeId() {
		return tvMazeId;
	}

	/**
	 * @param tvMazeId
	 *            the tvMazeId to set
	 * @return updated Series object
	 */
	public Series setTvMazeId(Long tvMazeId) {
		this.tvMazeId = tvMazeId;
		return this;
	}

	/**
	 * @return the firstAired
	 */
	public Date getFirstAired() {
		return firstAired;
	}

	/**
	 * @param firstAired
	 *            the firstAired to set
	 * @return updated Series object
	 */
	public Series setFirstAired(Date firstAired) {
		this.firstAired = firstAired;
		return this;
	}

	/**
	 * @return the lastInfoSync
	 */
	public Date getLastInfoSync() {
		return lastInfoSync;
	}

	/**
	 * @param lastInfoSync
	 *            the lastInfoSync to set
	 * @return updated Series object
	 */
	public Series setLastInfoSync(Date lastInfoSync) {
		this.lastInfoSync = lastInfoSync;
		return this;
	}

	/**
	 * @return the seriesType
	 */
	public String getSeriesType() {
		return seriesType;
	}

	/**
	 * @param seriesType
	 *            the seriesType to set
	 * @return updated Series object
	 */
	public Series setSeriesType(String seriesType) {
		this.seriesType = seriesType;
		return this;
	}

	/**
	 * @return the cleanTitle
	 */
	public String getCleanTitle() {
		return cleanTitle;
	}

	/**
	 * @param cleanTitle
	 *            the cleanTitle to set
	 * @return updated Series object
	 */
	public Series setCleanTitle(String cleanTitle) {
		this.cleanTitle = cleanTitle;
		return this;
	}

	/**
	 * @return the imdbId
	 */
	public String getImdbId() {
		return imdbId;
	}

	/**
	 * @param imdbId
	 *            the imdbId to set
	 * @return updated Series object
	 */
	public Series setImdbId(String imdbId) {
		this.imdbId = imdbId;
		return this;
	}

	/**
	 * @return the titleSlug
	 */
	public String getTitleSlug() {
		return titleSlug;
	}

	/**
	 * @param titleSlug
	 *            the titleSlug to set
	 * @return updated Series object
	 */
	public Series setTitleSlug(String titleSlug) {
		this.titleSlug = titleSlug;
		return this;
	}

	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * @param certification
	 *            the certification to set
	 * @return updated Series object
	 */
	public Series setCertification(String certification) {
		this.certification = certification;
		return this;
	}

	/**
	 * @return the genres
	 */
	public List<String> getGenres() {
		return genres;
	}

	/**
	 * @param genres
	 *            the genres to set
	 * @return updated Series object
	 */
	public Series setGenres(List<String> genres) {
		this.genres = genres;
		return this;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 * @return updated Series object
	 */
	public Series setTags(List<String> tags) {
		this.tags = tags;
		return this;
	}

	/**
	 * @return the added
	 */
	public Date getAdded() {
		return added;
	}

	/**
	 * @param added
	 *            the added to set
	 * @return updated Series object
	 */
	public Series setAdded(Date added) {
		this.added = added;
		return this;
	}

	/**
	 * @return the qualityProfileId
	 */
	public Integer getQualityProfileId() {
		return qualityProfileId;
	}

	/**
	 * @param qualityProfileId
	 *            the qualityProfileId to set
	 * @return updated Series object
	 */
	public Series setQualityProfileId(Integer qualityProfileId) {
		this.qualityProfileId = qualityProfileId;
		return this;
	}

	/**
	 * @return the ratings
	 */
	public Rating getRatings() {
		return ratings;
	}

	/**
	 * @param ratings
	 *            the ratings to set
	 * @return updated Series object
	 */
	public Series setRatings(Rating ratings) {
		this.ratings = ratings;
		return this;
	}

	/**
	 * Contains properties for the addition of a series via POST
	 * @return the AddOptions object (if there is any)
	 */
	public AddOptions getAddOptions() {
		return addOptions;
	}

	/**
	 * 
	 * @param addOptions the addOptions to set
	 * @return updated Series object
	 */
	public Series setAddOptions(AddOptions addOptions) {
		this.addOptions = addOptions;
		return this;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 * @return updated Series object
	 */
	public Series setId(Integer id) {
		this.id = id;
		return this;
	}
}
