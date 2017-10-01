package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class SeasonStatistics extends GenericJson {
	/**
	 * Number of episode files on the disk for the season
	 */
	private Integer episodeFileCount;
	
	/**
	 * Number of episodes on the disk for the season
	 */
	private Integer episodeCount;
	
	/**
	 * Total number of episodes for the season
	 */
	private Integer totalEpisodeCount;
	
	/**
	 * Size in bytes on the disk
	 */
	private Long sizeOnDisk;
	
	/**
	 * Percentage of episodes on the disk
	 */
	private Integer percentOfEpisodes;

	/**
	 * @return the episodeFileCount
	 */
	public Integer getEpisodeFileCount() {
		return episodeFileCount;
	}

	/**
	 * @param episodeFileCount the episodeFileCount to set
	 * @return updated SeasonStatistics object
	 */
	public SeasonStatistics setEpisodeFileCount(Integer episodeFileCount) {
		this.episodeFileCount = episodeFileCount;
		return this;
	}

	/**
	 * @return the episodeCount
	 */
	public Integer getEpisodeCount() {
		return episodeCount;
	}

	/**
	 * @param episodeCount the episodeCount to set
	 * @return updated SeasonStatistics object
	 */
	public SeasonStatistics setEpisodeCount(Integer episodeCount) {
		this.episodeCount = episodeCount;
		return this;
	}

	/**
	 * @return the totalEpisodeCount
	 */
	public Integer getTotalEpisodeCount() {
		return totalEpisodeCount;
	}

	/**
	 * @param totalEpisodeCount the totalEpisodeCount to set
	 * @return updated SeasonStatistics object
	 */
	public SeasonStatistics setTotalEpisodeCount(Integer totalEpisodeCount) {
		this.totalEpisodeCount = totalEpisodeCount;
		return this;
	}

	/**
	 * @return the sizeOnDisk
	 */
	public Long getSizeOnDisk() {
		return sizeOnDisk;
	}

	/**
	 * @param sizeOnDisk the sizeOnDisk to set
	 * @return updated SeasonStatistics object
	 */
	public SeasonStatistics setSizeOnDisk(Long sizeOnDisk) {
		this.sizeOnDisk = sizeOnDisk;
		return this;
	}

	/**
	 * @return the percentOfEpisodes
	 */
	public Integer getPercentOfEpisodes() {
		return percentOfEpisodes;
	}

	/**
	 * @param percentOfEpisodes the percentOfEpisodes to set
	 * @return updated SeasonStatistics object
	 */
	public SeasonStatistics setPercentOfEpisodes(Integer percentOfEpisodes) {
		this.percentOfEpisodes = percentOfEpisodes;
		return this;
	}
}
