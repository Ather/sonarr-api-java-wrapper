package media.thehoard.thirdparty.api.sonarr.endpoints;

import media.thehoard.thirdparty.api.sonarr.endpoints.common.Quality;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Release {
	private String guid;
	private Quality quality;
	private Integer age;
	private Integer size;
	private String indexer;
	private String releaseGroup;
	private String title;
	private Boolean fullSeason;
	private Boolean sceneSource;
	private Integer seasonNumber;
	private String language;
	private String seriesTitle;
	private List<Integer> episodeNumbers = null;
	private Boolean approved;
	private Integer tvRageId;
	private List<String> rejections = null;
	private String publishDate;
	private String downloadUrl;
	private Boolean downloadAllowed;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Release withGuid(String guid) {
		this.guid = guid;
		return this;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public Release withQuality(Quality quality) {
		this.quality = quality;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Release withAge(Integer age) {
		this.age = age;
		return this;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Release withSize(Integer size) {
		this.size = size;
		return this;
	}

	public String getIndexer() {
		return indexer;
	}

	public void setIndexer(String indexer) {
		this.indexer = indexer;
	}

	public Release withIndexer(String indexer) {
		this.indexer = indexer;
		return this;
	}

	public String getReleaseGroup() {
		return releaseGroup;
	}

	public void setReleaseGroup(String releaseGroup) {
		this.releaseGroup = releaseGroup;
	}

	public Release withReleaseGroup(String releaseGroup) {
		this.releaseGroup = releaseGroup;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Release withTitle(String title) {
		this.title = title;
		return this;
	}

	public Boolean getFullSeason() {
		return fullSeason;
	}

	public void setFullSeason(Boolean fullSeason) {
		this.fullSeason = fullSeason;
	}

	public Release withFullSeason(Boolean fullSeason) {
		this.fullSeason = fullSeason;
		return this;
	}

	public Boolean getSceneSource() {
		return sceneSource;
	}

	public void setSceneSource(Boolean sceneSource) {
		this.sceneSource = sceneSource;
	}

	public Release withSceneSource(Boolean sceneSource) {
		this.sceneSource = sceneSource;
		return this;
	}

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public Release withSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Release withLanguage(String language) {
		this.language = language;
		return this;
	}

	public String getSeriesTitle() {
		return seriesTitle;
	}

	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}

	public Release withSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
		return this;
	}

	public List<Integer> getEpisodeNumbers() {
		return episodeNumbers;
	}

	public void setEpisodeNumbers(List<Integer> episodeNumbers) {
		this.episodeNumbers = episodeNumbers;
	}

	public Release withEpisodeNumbers(List<Integer> episodeNumbers) {
		this.episodeNumbers = episodeNumbers;
		return this;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public Release withApproved(Boolean approved) {
		this.approved = approved;
		return this;
	}

	public Integer getTvRageId() {
		return tvRageId;
	}

	public void setTvRageId(Integer tvRageId) {
		this.tvRageId = tvRageId;
	}

	public Release withTvRageId(Integer tvRageId) {
		this.tvRageId = tvRageId;
		return this;
	}

	public List<String> getRejections() {
		return rejections;
	}

	public void setRejections(List<String> rejections) {
		this.rejections = rejections;
	}

	public Release withRejections(List<String> rejections) {
		this.rejections = rejections;
		return this;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public Release withPublishDate(String publishDate) {
		this.publishDate = publishDate;
		return this;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Release withDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
		return this;
	}

	public Boolean getDownloadAllowed() {
		return downloadAllowed;
	}

	public void setDownloadAllowed(Boolean downloadAllowed) {
		this.downloadAllowed = downloadAllowed;
	}

	public Release withDownloadAllowed(Boolean downloadAllowed) {
		this.downloadAllowed = downloadAllowed;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Release withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
