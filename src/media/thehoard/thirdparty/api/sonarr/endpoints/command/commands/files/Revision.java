/**
 * 
 */
package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.files;

/**
 * @author Michael Haas
 *
 */
public class Revision {
	/**
	 * Version of the revision
	 */
	private Integer version;
	
	/**
	 * Real status
	 */
	private Integer real;

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 * @return updated Revision object
	 */
	public Revision setVersion(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * @return the real
	 */
	public Integer getReal() {
		return real;
	}

	/**
	 * @param real the real to set
	 * @return updated Revision object
	 */
	public Revision setReal(Integer real) {
		this.real = real;
		return this;
	}
}
