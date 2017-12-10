package media.thehoard.thirdparty.api.sonarr.endpoints.history;

import java.util.HashMap;
import java.util.Map;

public class HistoryData {
	private String droppedPath;
	private String importedPath;
	private String downloadClient;
	private String reason;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getDroppedPath() {
		return droppedPath;
	}

	public void setDroppedPath(String droppedPath) {
		this.droppedPath = droppedPath;
	}

	public String getImportedPath() {
		return importedPath;
	}

	public void setImportedPath(String importedPath) {
		this.importedPath = importedPath;
	}

	public String getDownloadClient() {
		return downloadClient;
	}

	public void setDownloadClient(String downloadClient) {
		this.downloadClient = downloadClient;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
