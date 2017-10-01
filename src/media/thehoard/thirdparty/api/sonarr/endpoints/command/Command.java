package media.thehoard.thirdparty.api.sonarr.endpoints.command;

import java.time.Duration;
import java.util.Date;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class Command<T> extends GenericJson {
	/**
	 * Name of the command
	 */
	private CommandName name;

	/**
	 * Message of the command
	 */
	private String message;

	/**
	 * Command body to use
	 */
	private T body;

	/**
	 * Priority of the command
	 */
	private CommandPriority priority;

	/**
	 * Status of the command
	 */
	private CommandStatus status;

	/**
	 * Date the command was queued
	 */
	private Date queued;

	/**
	 * Date the command was started
	 */
	private Date started;

	/**
	 * Date the command ended
	 */
	private Date ended;

	/**
	 * How long the command ran for
	 */
	private Duration duration;

	/**
	 * What triggered the command
	 */
	private CommandTrigger trigger;

	/**
	 * State of the command While included, the "status" of the command is
	 * considered the better choice
	 */
	@Deprecated
	private CommandStatus state;

	/**
	 * Whether the command was manually triggered
	 */
	private Boolean manual;

	/**
	 * Date the command was started
	 */
	@Deprecated
	private Date startedOn;

	/**
	 * Last time the command state was modified
	 */
	private Date stateChangeTime;

	/**
	 * Whether to update clients with the command status
	 */
	private Boolean sendUpdatesToClient;

	/**
	 * Whether to update the scheduled task statistics
	 */
	private Boolean updatedScheduledTask;

	/**
	 * Id of the command
	 */
	private Integer id;

	/**
	 * @return the name
	 */
	public CommandName getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 * @return updated Command object
	 */
	public Command<T> setName(CommandName name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 * @return updated Command object
	 */
	public Command<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	/**
	 * @return the body
	 */
	public T getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 * @return updated Command object
	 */
	public Command<T> setBody(T body) {
		this.body = body;
		return this;
	}

	/**
	 * @return the priority
	 */
	public CommandPriority getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 * @return updated Command object
	 */
	public Command<T> setPriority(CommandPriority priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * @return the status
	 */
	public CommandStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 * @return updated Command object
	 */
	public Command<T> setStatus(CommandStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * @return the queued
	 */
	public Date getQueued() {
		return queued;
	}

	/**
	 * @param queued
	 *            the queued to set
	 * @return updated Command object
	 */
	public Command<T> setQueued(Date queued) {
		this.queued = queued;
		return this;
	}

	/**
	 * @return the started
	 */
	public Date getStarted() {
		return started;
	}

	/**
	 * @param started
	 *            the started to set
	 * @return updated Command object
	 */
	public Command<T> setStarted(Date started) {
		this.started = started;
		return this;
	}

	/**
	 * @return the ended
	 */
	public Date getEnded() {
		return ended;
	}

	/**
	 * @param ended
	 *            the ended to set
	 * @return updated Command object
	 */
	public Command<T> setEnded(Date ended) {
		this.ended = ended;
		return this;
	}

	/**
	 * @return the duration
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 * @return updated Command object
	 */
	public Command<T> setDuration(Duration duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * @return the trigger
	 */
	public CommandTrigger getTrigger() {
		return trigger;
	}

	/**
	 * @param trigger
	 *            the trigger to set
	 * @return updated Command object
	 */
	public Command<T> setTrigger(CommandTrigger trigger) {
		this.trigger = trigger;
		return this;
	}

	/**
	 * @return the state
	 */
	public CommandStatus getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 * @return updated Command object
	 */
	public Command<T> setState(CommandStatus state) {
		this.state = state;
		return this;
	}

	/**
	 * @return the manual
	 */
	public Boolean getManual() {
		return manual;
	}

	/**
	 * @param manual
	 *            the manual to set
	 * @return updated Command object
	 */
	public Command<T> setManual(Boolean manual) {
		this.manual = manual;
		return this;
	}

	/**
	 * @return the startedOn
	 */
	public Date getStartedOn() {
		return startedOn;
	}

	/**
	 * @param startedOn
	 *            the startedOn to set
	 * @return updated Command object
	 */
	public Command<T> setStartedOn(Date startedOn) {
		this.startedOn = startedOn;
		return this;
	}

	/**
	 * @return the stateChangeTime
	 */
	public Date getStateChangeTime() {
		return stateChangeTime;
	}

	/**
	 * @param stateChangeTime
	 *            the stateChangeTime to set
	 * @return updated Command object
	 */
	public Command<T> setStateChangeTime(Date stateChangeTime) {
		this.stateChangeTime = stateChangeTime;
		return this;
	}

	/**
	 * @return the sendUpdatesToClient
	 */
	public Boolean getSendUpdatesToClient() {
		return sendUpdatesToClient;
	}

	/**
	 * @param sendUpdatesToClient
	 *            the sendUpdatesToClient to set
	 * @return updated Command object
	 */
	public Command<T> setSendUpdatesToClient(Boolean sendUpdatesToClient) {
		this.sendUpdatesToClient = sendUpdatesToClient;
		return this;
	}

	/**
	 * @return the updatedScheduledTask
	 */
	public Boolean getUpdatedScheduledTask() {
		return updatedScheduledTask;
	}

	/**
	 * @param updatedScheduledTask
	 *            the updatedScheduledTask to set
	 * @return updated Command object
	 */
	public Command<T> setUpdatedScheduledTask(Boolean updatedScheduledTask) {
		this.updatedScheduledTask = updatedScheduledTask;
		return this;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 * @return updated Command object
	 */
	public Command<T> setId(Integer id) {
		this.id = id;
		return this;
	}
}
