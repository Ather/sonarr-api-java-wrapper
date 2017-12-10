package media.thehoard.thirdparty.api.sonarr.endpoints.systembackup;

import java.util.HashMap;
import java.util.Map;

public class SystemBackup {

	private String name;
	private String path;
	private BackupType type;
	private String time;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SystemBackup withName(String name) {
		this.name = name;
		return this;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public SystemBackup withPath(String path) {
		this.path = path;
		return this;
	}

	public BackupType getType() {
		return type;
	}

	public void setType(BackupType type) {
		this.type = type;
	}

	public SystemBackup withType(BackupType type) {
		this.type = type;
		return this;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public SystemBackup withTime(String time) {
		this.time = time;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SystemBackup withId(Integer id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public SystemBackup withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
