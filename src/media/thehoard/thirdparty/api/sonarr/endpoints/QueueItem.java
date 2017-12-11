package media.thehoard.thirdparty.api.sonarr.endpoints;

import media.thehoard.thirdparty.api.sonarr.endpoints.common.Quality;
import media.thehoard.thirdparty.api.sonarr.endpoints.series.Series;
import media.thehoard.thirdparty.api.sonarr.endpoints.wantedmissing.StatusMessage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueueItem {
	private Series series;
	private Episode episode;
	private Quality quality;
	private Double size;
	private String title;
	private Double sizeleft;
	private String timeleft;
	private String estimatedCompletionTime;
	private String status;
	private String trackedDownloadStatus;
	private List<StatusMessage> statusMessages = null;
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

	public QueueItem withSeries(Series series) {
		this.series = series;
		return this;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public QueueItem withEpisode(Episode episode) {
		this.episode = episode;
		return this;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public QueueItem withQuality(Quality quality) {
		this.quality = quality;
		return this;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public QueueItem withSize(Double size) {
		this.size = size;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public QueueItem withTitle(String title) {
		this.title = title;
		return this;
	}

	public Double getSizeleft() {
		return sizeleft;
	}

	public void setSizeleft(Double sizeleft) {
		this.sizeleft = sizeleft;
	}

	public QueueItem withSizeleft(Double sizeleft) {
		this.sizeleft = sizeleft;
		return this;
	}

	public String getTimeleft() {
		return timeleft;
	}

	public void setTimeleft(String timeleft) {
		this.timeleft = timeleft;
	}

	public QueueItem withTimeleft(String timeleft) {
		this.timeleft = timeleft;
		return this;
	}

	public String getEstimatedCompletionTime() {
		return estimatedCompletionTime;
	}

	public void setEstimatedCompletionTime(String estimatedCompletionTime) {
		this.estimatedCompletionTime = estimatedCompletionTime;
	}

	public QueueItem withEstimatedCompletionTime(String estimatedCompletionTime) {
		this.estimatedCompletionTime = estimatedCompletionTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public QueueItem withStatus(String status) {
		this.status = status;
		return this;
	}

	public String getTrackedDownloadStatus() {
		return trackedDownloadStatus;
	}

	public void setTrackedDownloadStatus(String trackedDownloadStatus) {
		this.trackedDownloadStatus = trackedDownloadStatus;
	}

	public QueueItem withTrackedDownloadStatus(String trackedDownloadStatus) {
		this.trackedDownloadStatus = trackedDownloadStatus;
		return this;
	}

	public List<StatusMessage> getStatusMessages() {
		return statusMessages;
	}

	public void setStatusMessages(List<StatusMessage> statusMessages) {
		this.statusMessages = statusMessages;
	}

	public QueueItem withStatusMessages(List<StatusMessage> statusMessages) {
		this.statusMessages = statusMessages;
		return this;
	}

	public String getDownloadId() {
		return downloadId;
	}

	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}

	public QueueItem withDownloadId(String downloadId) {
		this.downloadId = downloadId;
		return this;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public QueueItem withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public QueueItem withId(Integer id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public QueueItem withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}