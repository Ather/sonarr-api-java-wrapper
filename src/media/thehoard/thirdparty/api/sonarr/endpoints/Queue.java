package media.thehoard.thirdparty.api.sonarr.endpoints;

import media.thehoard.thirdparty.api.sonarr.endpoints.common.Quality;
import media.thehoard.thirdparty.api.sonarr.endpoints.series.Series;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Queue {
	private Series series;
	private Episode episode;
	private Quality quality;
	private Integer size;
	private String title;
	private Integer sizeleft;
	private String timeleft;
	private String estimatedCompletionTime;
	private String status;
	private String trackedDownloadStatus;
	private List<Object> statusMessages = null;
	private String downloadId;
	private String protocol;
	private Integer id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Queue withSeries(Series series) {
		this.series = series;
		return this;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Queue withEpisode(Episode episode) {
		this.episode = episode;
		return this;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public Queue withQuality(Quality quality) {
		this.quality = quality;
		return this;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Queue withSize(Integer size) {
		this.size = size;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Queue withTitle(String title) {
		this.title = title;
		return this;
	}

	public Integer getSizeleft() {
		return sizeleft;
	}

	public void setSizeleft(Integer sizeleft) {
		this.sizeleft = sizeleft;
	}

	public Queue withSizeleft(Integer sizeleft) {
		this.sizeleft = sizeleft;
		return this;
	}

	public String getTimeleft() {
		return timeleft;
	}

	public void setTimeleft(String timeleft) {
		this.timeleft = timeleft;
	}

	public Queue withTimeleft(String timeleft) {
		this.timeleft = timeleft;
		return this;
	}

	public String getEstimatedCompletionTime() {
		return estimatedCompletionTime;
	}

	public void setEstimatedCompletionTime(String estimatedCompletionTime) {
		this.estimatedCompletionTime = estimatedCompletionTime;
	}

	public Queue withEstimatedCompletionTime(String estimatedCompletionTime) {
		this.estimatedCompletionTime = estimatedCompletionTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Queue withStatus(String status) {
		this.status = status;
		return this;
	}

	public String getTrackedDownloadStatus() {
		return trackedDownloadStatus;
	}

	public void setTrackedDownloadStatus(String trackedDownloadStatus) {
		this.trackedDownloadStatus = trackedDownloadStatus;
	}

	public Queue withTrackedDownloadStatus(String trackedDownloadStatus) {
		this.trackedDownloadStatus = trackedDownloadStatus;
		return this;
	}

	public List<Object> getStatusMessages() {
		return statusMessages;
	}

	public void setStatusMessages(List<Object> statusMessages) {
		this.statusMessages = statusMessages;
	}

	public Queue withStatusMessages(List<Object> statusMessages) {
		this.statusMessages = statusMessages;
		return this;
	}

	public String getDownloadId() {
		return downloadId;
	}

	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}

	public Queue withDownloadId(String downloadId) {
		this.downloadId = downloadId;
		return this;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Queue withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Queue withId(Integer id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Queue withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}