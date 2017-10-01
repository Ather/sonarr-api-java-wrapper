package media.thehoard.thirdparty.api.sonarr.endpoints;

public class Diskspace {
	/**
	 * Path of the disk
	 */
	private String path;
	
	/**
	 * Label for the disk
	 */
	private String label;
	
	/**
	 * Remaining space in bytes on the disk
	 */
	private Long freeSpace;
	
	/**
	 * Total space on the disk
	 */
	private Long totalSpace;

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public Diskspace setPath(String path) {
		this.path = path;
		return this;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public Diskspace setLabel(String label) {
		this.label = label;
		return this;
	}

	/**
	 * @return the freeSpace
	 */
	public Long getFreeSpace() {
		return freeSpace;
	}

	/**
	 * @param freeSpace the freeSpace to set
	 */
	public Diskspace setFreeSpace(Long freeSpace) {
		this.freeSpace = freeSpace;
		return this;
	}

	/**
	 * @return the totalSpace
	 */
	public Long getTotalSpace() {
		return totalSpace;
	}

	/**
	 * @param totalSpace the totalSpace to set
	 */
	public Diskspace setTotalSpace(Long totalSpace) {
		this.totalSpace = totalSpace;
		return this;
	}
}
