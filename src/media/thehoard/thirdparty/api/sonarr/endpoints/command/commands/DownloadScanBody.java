package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;

public class DownloadScanBody extends CommandBody {
	/**
	 * Path of the file to import with the scan
	 */
	private String path;
	
	/**
	 * ID of the download client to retrieve file from
	 */
	private String downloadClientId;
	
	/**
	 * Whether to copy or move the file on import
	 */
	private FileImportMode importMode;

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 * @return updated CommandBody object
	 */
	public DownloadScanBody setPath(String path) {
		this.path = path;
		return this;
	}

	/**
	 * @return the downloadClientId
	 */
	public String getDownloadClientId() {
		return downloadClientId;
	}

	/**
	 * @param downloadClientId the downloadClientId to set
	 * @return updated CommandBody object
	 */
	public DownloadScanBody setDownloadClientId(String downloadClientId) {
		this.downloadClientId = downloadClientId;
		return this;
	}

	/**
	 * @return the importMode
	 */
	public FileImportMode getImportMode() {
		return importMode;
	}

	/**
	 * @param importMode the importMode to set
	 * @return updated CommandBody object
	 */
	public DownloadScanBody setImportMode(FileImportMode importMode) {
		this.importMode = importMode;
		return this;
	}
}
