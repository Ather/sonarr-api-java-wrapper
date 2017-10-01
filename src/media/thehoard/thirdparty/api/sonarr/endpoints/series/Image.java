package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class Image extends GenericJson {
	/**
	 * Type of image
	 */
	private String coverType;
	
	/**
	 * URL to image
	 */
	private String url;

	/**
	 * @return the coverType
	 */
	public String getCoverType() {
		return coverType;
	}

	/**
	 * @param coverType the coverType to set
	 * @return updated Image object
	 */
	public Image setCoverType(String coverType) {
		this.coverType = coverType;
		return this;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 * @return updated Image object
	 */
	public Image setUrl(String url) {
		this.url = url;
		return this;
	}
}
