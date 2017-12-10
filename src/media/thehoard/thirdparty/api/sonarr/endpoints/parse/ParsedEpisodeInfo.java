package media.thehoard.thirdparty.api.sonarr.endpoints.parse;

import media.thehoard.thirdparty.api.sonarr.endpoints.common.Quality;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParsedEpisodeInfo {

	private String releaseTitle;
	private String seriesTitle;
	private SeriesTitleInfo seriesTitleInfo;
	private Quality quality;
	private Integer seasonNumber;
	private List<Integer> episodeNumbers = null;
	private List<Object> absoluteEpisodeNumbers = null;
	private String language;
	private Boolean fullSeason;
	private Boolean special;
	private String releaseGroup;
	private String releaseHash;
	private Boolean isDaily;
	private Boolean isAbsoluteNumbering;
	private Boolean isPossibleSpecialEpisode;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getReleaseTitle() {
		return releaseTitle;
	}

	public void setReleaseTitle(String releaseTitle) {
		this.releaseTitle = releaseTitle;
	}

	public String getSeriesTitle() {
		return seriesTitle;
	}

	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}

	public SeriesTitleInfo getSeriesTitleInfo() {
		return seriesTitleInfo;
	}

	public void setSeriesTitleInfo(SeriesTitleInfo seriesTitleInfo) {
		this.seriesTitleInfo = seriesTitleInfo;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public List<Integer> getEpisodeNumbers() {
		return episodeNumbers;
	}

	public void setEpisodeNumbers(List<Integer> episodeNumbers) {
		this.episodeNumbers = episodeNumbers;
	}

	public List<Object> getAbsoluteEpisodeNumbers() {
		return absoluteEpisodeNumbers;
	}

	public void setAbsoluteEpisodeNumbers(List<Object> absoluteEpisodeNumbers) {
		this.absoluteEpisodeNumbers = absoluteEpisodeNumbers;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getFullSeason() {
		return fullSeason;
	}

	public void setFullSeason(Boolean fullSeason) {
		this.fullSeason = fullSeason;
	}

	public Boolean getSpecial() {
		return special;
	}

	public void setSpecial(Boolean special) {
		this.special = special;
	}

	public String getReleaseGroup() {
		return releaseGroup;
	}

	public void setReleaseGroup(String releaseGroup) {
		this.releaseGroup = releaseGroup;
	}

	public String getReleaseHash() {
		return releaseHash;
	}

	public void setReleaseHash(String releaseHash) {
		this.releaseHash = releaseHash;
	}

	public Boolean getIsDaily() {
		return isDaily;
	}

	public void setIsDaily(Boolean isDaily) {
		this.isDaily = isDaily;
	}

	public Boolean getIsAbsoluteNumbering() {
		return isAbsoluteNumbering;
	}

	public void setIsAbsoluteNumbering(Boolean isAbsoluteNumbering) {
		this.isAbsoluteNumbering = isAbsoluteNumbering;
	}

	public Boolean getIsPossibleSpecialEpisode() {
		return isPossibleSpecialEpisode;
	}

	public void setIsPossibleSpecialEpisode(Boolean isPossibleSpecialEpisode) {
		this.isPossibleSpecialEpisode = isPossibleSpecialEpisode;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
