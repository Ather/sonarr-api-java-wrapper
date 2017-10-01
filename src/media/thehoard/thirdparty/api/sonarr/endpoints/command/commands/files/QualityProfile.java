/**
 * 
 */
package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands.files;

/**
 * @author Michael Haas
 *
 */
public class QualityProfile {
	/**
	 * Quality ID
	 */
	private Integer id;
	
	/**
	 * Quality Name
	 */
	private String name;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 * @return updated Quality object
	 */
	public QualityProfile setId(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @return updated Quality object
	 */
	public QualityProfile setName(String name) {
		this.name = name;
		return this;
	}
}
