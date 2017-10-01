package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class Season extends GenericJson {
	/**
	 * Season number
	 */
	private Integer seasonNumber;
	
	/**
	 * Whether the season is monitored
	 */
	private Boolean monitored;
	
	/**
	 * Statistics about the current season
	 */
	private SeasonStatistics statistics;

	/**
	 * @return the seasonNumber
	 */
	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	/**
	 * @param seasonNumber the seasonNumber to set
	 * @return updated Season object
	 */
	public Season setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}

	/**
	 * @return the monitored
	 */
	public Boolean isMonitored() {
		return monitored;
	}

	/**
	 * @param monitored the monitored to set
	 * @return updated Season object
	 */
	public Season setMonitored(Boolean monitored) {
		this.monitored = monitored;
		return this;
	}

	/**
	 * @return the statistics
	 */
	public SeasonStatistics getStatistics() {
		return statistics;
	}

	/**
	 * @param statistics the statistics to set
	 * @return updated Season object
	 */
	public Season setStatistics(SeasonStatistics statistics) {
		this.statistics = statistics;
		return this;
	}
}
