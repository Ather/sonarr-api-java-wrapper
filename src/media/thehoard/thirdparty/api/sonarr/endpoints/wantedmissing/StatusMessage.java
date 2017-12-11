package media.thehoard.thirdparty.api.sonarr.endpoints.wantedmissing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatusMessage {
	private String title;
	private List<String> messages = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public StatusMessage withTitle(String title) {
		this.title = title;
		return this;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public StatusMessage withMessages(List<String> messages) {
		this.messages = messages;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public StatusMessage withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
