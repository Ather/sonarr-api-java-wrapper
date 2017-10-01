package media.thehoard.thirdparty.api.sonarr.http;

import media.thehoard.thirdparty.api.sonarr.SonarrClient;

public class GenericJson {
	/*
	 * Error string, typically relates to invalid requests, or lack of authorization.
	 */
	private String error;
	
	/*
	 * Message string, typically for 404s, or the likes.
	 */
	private String message;
	
	// Add serializers to output dates in the proper formats.
	public String toJson(boolean prettyPrint) {
		return SonarrClient.getGson().toJson(this);
	}
	
	public String toJson() {
		return toJson(false);
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
