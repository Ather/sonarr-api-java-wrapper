package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.files;

import java.util.List;

/**
 * @author Michael Haas
 *
 */
public class ImportFile {
	/**
	 * Path to file on disk
	 */
	private String path;
	
	/**
	 * Series ID of the file
	 */
	private Integer seriesId;
	
	/**
	 * List of episodes in the file
	 */
	private List<Integer> episodeIds;
	
	/**
	 * Quality of the file
	 */
	private Quality quality;
	
	/**
	 * Hash of the download used in the download client
	 */
	private String downloadId;

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 * @return updated ImportFile object
	 */
	public ImportFile setPath(String path) {
		this.path = path;
		return this;
	}

	/**
	 * @return the seriesId
	 */
	public Integer getSeriesId() {
		return seriesId;
	}

	/**
	 * @param seriesId the seriesId to set
	 * @return updated ImportFile object
	 */
	public ImportFile setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
		return this;
	}

	/**
	 * @return the episodeIds
	 */
	public List<Integer> getEpisodeIds() {
		return episodeIds;
	}

	/**
	 * @param episodeIds the episodeIds to set
	 * @return updated ImportFile object
	 */
	public ImportFile setEpisodeIds(List<Integer> episodeIds) {
		this.episodeIds = episodeIds;
		return this;
	}

	/**
	 * @return the quality
	 */
	public Quality getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 * @return updated ImportFile object
	 */
	public ImportFile setQuality(Quality quality) {
		this.quality = quality;
		return this;
	}

	/**
	 * @return the downloadId
	 */
	public String getDownloadId() {
		return downloadId;
	}

	/**
	 * @param downloadId the downloadId to set
	 * @return updated ImportFile object
	 */
	public ImportFile setDownloadId(String downloadId) {
		this.downloadId = downloadId;
		return this;
	}
}
