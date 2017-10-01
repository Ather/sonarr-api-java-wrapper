package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class AlternateTitle extends GenericJson {
	/**
	 * Alternate title
	 */
	private String title;
	
	/**
	 * Season the title applies to (-1 for all)
	 */
	private Integer seasonNumber;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 * @return updated AlternateTitle object
	 */
	public AlternateTitle setTitle(String title) {
		this.title = title;
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
	 * @return updated AlternateTitle object
	 */
	public AlternateTitle setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}
}
