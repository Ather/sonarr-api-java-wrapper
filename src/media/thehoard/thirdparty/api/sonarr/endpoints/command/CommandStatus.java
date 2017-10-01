package media.thehoard.thirdparty.api.sonarr.endpoints.command;

public enum CommandStatus {
	queued,
	started,
	completed,
	failed,
	aborted,
	cancelled,
	orphaned
}
