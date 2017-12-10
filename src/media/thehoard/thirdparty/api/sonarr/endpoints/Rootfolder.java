package media.thehoard.thirdparty.api.sonarr.endpoints;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rootfolder {

	private String path;
	private Integer freeSpace;
	private List<String> unmappedFolders = null;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Rootfolder withPath(String path) {
		this.path = path;
		return this;
	}

	public Integer getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(Integer freeSpace) {
		this.freeSpace = freeSpace;
	}

	public Rootfolder withFreeSpace(Integer freeSpace) {
		this.freeSpace = freeSpace;
		return this;
	}

	public List<String> getUnmappedFolders() {
		return unmappedFolders;
	}

	public void setUnmappedFolders(List<String> unmappedFolders) {
		this.unmappedFolders = unmappedFolders;
	}

	public Rootfolder withUnmappedFolders(List<String> unmappedFolders) {
		this.unmappedFolders = unmappedFolders;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Rootfolder withId(Integer id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Rootfolder withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}