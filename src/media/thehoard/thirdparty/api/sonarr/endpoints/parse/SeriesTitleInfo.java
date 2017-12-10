package media.thehoard.thirdparty.api.sonarr.endpoints.parse;

import java.util.HashMap;
import java.util.Map;

public class SeriesTitleInfo {

	private String title;
	private String titleWithoutYear;
	private Integer year;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleWithoutYear() {
		return titleWithoutYear;
	}

	public void setTitleWithoutYear(String titleWithoutYear) {
		this.titleWithoutYear = titleWithoutYear;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
