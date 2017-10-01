package media.thehoard.thirdparty.api.sonarr.endpoints.series;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class AddOptions extends GenericJson {
	/**
	 * Whether to unmonitor episodes already on the disk
	 */
	private Boolean ignoreEpisodesWithFiles;
	
	/**
	 * Whether to unmonitor episodes not already on the disk
	 */
	private Boolean ignoreEpisodesWithoutFiles;
	
	/**
	 * Whether to search for missing episodes (after the other options are already applied)
	 */
	private Boolean searchForMissingEpisodes;

	/**
	 * @return the ignoreEpisodesWithFiles
	 */
	public Boolean isIgnoreEpisodesWithFiles() {
		return ignoreEpisodesWithFiles;
	}

	/**
	 * @param ignoreEpisodesWithFiles the ignoreEpisodesWithFiles to set
	 * @return updated AddOptions object
	 */
	public AddOptions setIgnoreEpisodesWithFiles(Boolean ignoreEpisodesWithFiles) {
		this.ignoreEpisodesWithFiles = ignoreEpisodesWithFiles;
		return this;
	}

	/**
	 * @return the ignoreEpisodesWithoutFiles
	 */
	public Boolean isIgnoreEpisodesWithoutFiles() {
		return ignoreEpisodesWithoutFiles;
	}

	/**
	 * @param ignoreEpisodesWithoutFiles the ignoreEpisodesWithoutFiles to set
	 * @return updated AddOptions object
	 */
	public AddOptions setIgnoreEpisodesWithoutFiles(Boolean ignoreEpisodesWithoutFiles) {
		this.ignoreEpisodesWithoutFiles = ignoreEpisodesWithoutFiles;
		return this;
	}

	/**
	 * @return the searchForMissingEpisodes
	 */
	public Boolean isSearchForMissingEpisodes() {
		return searchForMissingEpisodes;
	}

	/**
	 * @param searchForMissingEpisodes the searchForMissingEpisodes to set
	 * @return updated AddOptions object
	 */
	public AddOptions setSearchForMissingEpisodes(Boolean searchForMissingEpisodes) {
		this.searchForMissingEpisodes = searchForMissingEpisodes;
		return this;
	}
}
