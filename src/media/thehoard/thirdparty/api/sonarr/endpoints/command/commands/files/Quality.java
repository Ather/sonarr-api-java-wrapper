/**
 * 
 */
package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.files;

/**
 * @author Michael Haas
 *
 */
public class Quality {
	/**
	 * Quality profile used
	 */
	private QualityProfile quality;
	
	/**
	 * Revision of the file
	 */
	private Revision revision;

	/**
	 * @return the quality
	 */
	public QualityProfile getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 * @return updated Quality object
	 */
	public Quality setQuality(QualityProfile quality) {
		this.quality = quality;
		return this;
	}

	/**
	 * @return the revision
	 */
	public Revision getRevision() {
		return revision;
	}

	/**
	 * @param revision the revision to set
	 * @return updated Quality object
	 */
	public Quality setRevision(Revision revision) {
		this.revision = revision;
		return this;
	}
}
