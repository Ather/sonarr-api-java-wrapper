package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

import java.util.List;

import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;
import media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.files.ImportFile;

public class MultiFileBody extends CommandBody {
	/**
	 * List of files being modified
	 */
	private List<ImportFile> files;

	/**
	 * @return the files
	 */
	public List<ImportFile> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 * @return updated CommandBody object
	 */
	public MultiFileBody setFiles(List<ImportFile> files) {
		this.files = files;
		return this;
	}
}
