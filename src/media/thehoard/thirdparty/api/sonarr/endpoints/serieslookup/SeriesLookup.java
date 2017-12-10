package media.thehoard.thirdparty.api.sonarr.endpoints.serieslookup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeriesLookup {

	private String title;
	private String sortTitle;
	private Integer seasonCount;
	private String status;
	private String overview;
	private String network;
	private String airTime;
	private List<Image> images = null;
	private String remotePoster;
	private List<Season> seasons = null;
	private Integer year;
	private Integer profileId;
	private Boolean seasonFolder;
	private Boolean monitored;
	private Boolean useSceneNumbering;
	private Integer runtime;
	private Integer tvdbId;
	private Integer tvRageId;
	private Integer tvMazeId;
	private String firstAired;
	private String seriesType;
	private String cleanTitle;
	private String imdbId;
	private String titleSlug;
	private String certification;
	private List<String> genres = null;
	private List<Object> tags = null;
	private String added;
	private Ratings ratings;
	private Integer qualityProfileId;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SeriesLookup withTitle(String title) {
		this.title = title;
		return this;
	}

	public String getSortTitle() {
		return sortTitle;
	}

	public void setSortTitle(String sortTitle) {
		this.sortTitle = sortTitle;
	}

	public SeriesLookup withSortTitle(String sortTitle) {
		this.sortTitle = sortTitle;
		return this;
	}

	public Integer getSeasonCount() {
		return seasonCount;
	}

	public void setSeasonCount(Integer seasonCount) {
		this.seasonCount = seasonCount;
	}

	public SeriesLookup withSeasonCount(Integer seasonCount) {
		this.seasonCount = seasonCount;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SeriesLookup withStatus(String status) {
		this.status = status;
		return this;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public SeriesLookup withOverview(String overview) {
		this.overview = overview;
		return this;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public SeriesLookup withNetwork(String network) {
		this.network = network;
		return this;
	}

	public String getAirTime() {
		return airTime;
	}

	public void setAirTime(String airTime) {
		this.airTime = airTime;
	}

	public SeriesLookup withAirTime(String airTime) {
		this.airTime = airTime;
		return this;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public SeriesLookup withImages(List<Image> images) {
		this.images = images;
		return this;
	}

	public String getRemotePoster() {
		return remotePoster;
	}

	public void setRemotePoster(String remotePoster) {
		this.remotePoster = remotePoster;
	}

	public SeriesLookup withRemotePoster(String remotePoster) {
		this.remotePoster = remotePoster;
		return this;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public SeriesLookup withSeasons(List<Season> seasons) {
		this.seasons = seasons;
		return this;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public SeriesLookup withYear(Integer year) {
		this.year = year;
		return this;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public SeriesLookup withProfileId(Integer profileId) {
		this.profileId = profileId;
		return this;
	}

	public Boolean getSeasonFolder() {
		return seasonFolder;
	}

	public void setSeasonFolder(Boolean seasonFolder) {
		this.seasonFolder = seasonFolder;
	}

	public SeriesLookup withSeasonFolder(Boolean seasonFolder) {
		this.seasonFolder = seasonFolder;
		return this;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean monitored) {
		this.monitored = monitored;
	}

	public SeriesLookup withMonitored(Boolean monitored) {
		this.monitored = monitored;
		return this;
	}

	public Boolean getUseSceneNumbering() {
		return useSceneNumbering;
	}

	public void setUseSceneNumbering(Boolean useSceneNumbering) {
		this.useSceneNumbering = useSceneNumbering;
	}

	public SeriesLookup withUseSceneNumbering(Boolean useSceneNumbering) {
		this.useSceneNumbering = useSceneNumbering;
		return this;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public SeriesLookup withRuntime(Integer runtime) {
		this.runtime = runtime;
		return this;
	}

	public Integer getTvdbId() {
		return tvdbId;
	}

	public void setTvdbId(Integer tvdbId) {
		this.tvdbId = tvdbId;
	}

	public SeriesLookup withTvdbId(Integer tvdbId) {
		this.tvdbId = tvdbId;
		return this;
	}

	public Integer getTvRageId() {
		return tvRageId;
	}

	public void setTvRageId(Integer tvRageId) {
		this.tvRageId = tvRageId;
	}

	public SeriesLookup withTvRageId(Integer tvRageId) {
		this.tvRageId = tvRageId;
		return this;
	}

	public Integer getTvMazeId() {
		return tvMazeId;
	}

	public void setTvMazeId(Integer tvMazeId) {
		this.tvMazeId = tvMazeId;
	}

	public SeriesLookup withTvMazeId(Integer tvMazeId) {
		this.tvMazeId = tvMazeId;
		return this;
	}

	public String getFirstAired() {
		return firstAired;
	}

	public void setFirstAired(String firstAired) {
		this.firstAired = firstAired;
	}

	public SeriesLookup withFirstAired(String firstAired) {
		this.firstAired = firstAired;
		return this;
	}

	public String getSeriesType() {
		return seriesType;
	}

	public void setSeriesType(String seriesType) {
		this.seriesType = seriesType;
	}

	public SeriesLookup withSeriesType(String seriesType) {
		this.seriesType = seriesType;
		return this;
	}

	public String getCleanTitle() {
		return cleanTitle;
	}

	public void setCleanTitle(String cleanTitle) {
		this.cleanTitle = cleanTitle;
	}

	public SeriesLookup withCleanTitle(String cleanTitle) {
		this.cleanTitle = cleanTitle;
		return this;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public SeriesLookup withImdbId(String imdbId) {
		this.imdbId = imdbId;
		return this;
	}

	public String getTitleSlug() {
		return titleSlug;
	}

	public void setTitleSlug(String titleSlug) {
		this.titleSlug = titleSlug;
	}

	public SeriesLookup withTitleSlug(String titleSlug) {
		this.titleSlug = titleSlug;
		return this;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public SeriesLookup withCertification(String certification) {
		this.certification = certification;
		return this;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public SeriesLookup withGenres(List<String> genres) {
		this.genres = genres;
		return this;
	}

	public List<Object> getTags() {
		return tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;
	}

	public SeriesLookup withTags(List<Object> tags) {
		this.tags = tags;
		return this;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public SeriesLookup withAdded(String added) {
		this.added = added;
		return this;
	}

	public Ratings getRatings() {
		return ratings;
	}

	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}

	public SeriesLookup withRatings(Ratings ratings) {
		this.ratings = ratings;
		return this;
	}

	public Integer getQualityProfileId() {
		return qualityProfileId;
	}

	public void setQualityProfileId(Integer qualityProfileId) {
		this.qualityProfileId = qualityProfileId;
	}

	public SeriesLookup withQualityProfileId(Integer qualityProfileId) {
		this.qualityProfileId = qualityProfileId;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public SeriesLookup withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
