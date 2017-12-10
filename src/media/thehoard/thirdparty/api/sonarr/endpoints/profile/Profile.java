package media.thehoard.thirdparty.api.sonarr.endpoints.profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {

	private String name;
	private Cutoff cutoff;
	private List<Item> items = null;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profile withName(String name) {
		this.name = name;
		return this;
	}

	public Cutoff getCutoff() {
		return cutoff;
	}

	public void setCutoff(Cutoff cutoff) {
		this.cutoff = cutoff;
	}

	public Profile withCutoff(Cutoff cutoff) {
		this.cutoff = cutoff;
		return this;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Profile withItems(List<Item> items) {
		this.items = items;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profile withId(Integer id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Profile withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
