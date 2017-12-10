package media.thehoard.thirdparty.api.sonarr.endpoints.parse;

import media.thehoard.thirdparty.api.sonarr.endpoints.Episode;
import media.thehoard.thirdparty.api.sonarr.endpoints.series.Series;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parse {

	private String title;
	private ParsedEpisodeInfo parsedEpisodeInfo;
	//TODO Verify this
	private Series series;
	private List<Episode> episodes = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ParsedEpisodeInfo getParsedEpisodeInfo() {
		return parsedEpisodeInfo;
	}

	public void setParsedEpisodeInfo(ParsedEpisodeInfo parsedEpisodeInfo) {
		this.parsedEpisodeInfo = parsedEpisodeInfo;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
