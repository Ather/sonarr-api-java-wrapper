package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

import java.util.List;

import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;

public class MultiFileListBody extends CommandBody {
	/**
	 * List of files being modified
	 */
	private List<Integer> files;

	/**
	 * @return the files
	 */
	public List<Integer> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 * @return updated CommandBody object
	 */
	public MultiFileListBody setFiles(List<Integer> files) {
		this.files = files;
		return this;
	}
}
