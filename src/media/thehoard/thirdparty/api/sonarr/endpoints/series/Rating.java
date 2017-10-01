package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class Rating extends GenericJson {
	/**
	 * Number of votes for rating
	 */
	private Integer votes;
	
	/**
	 * Rating value
	 */
	private Double value;

	/**
	 * @return the votes
	 */
	public Integer getVotes() {
		return votes;
	}

	/**
	 * @param votes the votes to set
	 * @return updated Rating object
	 */
	public Rating setVotes(Integer votes) {
		this.votes = votes;
		return this;
	}

	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 * @return updated Rating object
	 */
	public Rating setValue(Double value) {
		this.value = value;
		return this;
	}
}
