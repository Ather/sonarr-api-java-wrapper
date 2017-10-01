package media.thehoard.thirdparty.api.sonarr.endpoints.command;

import media.thehoard.thirdparty.api.sonarr.http.GenericJson;

public class CommandBody extends GenericJson {	
	/**
	 * Whether to update clients with the state of the command
	 */
	private Boolean sendUpdatesToClient;
	
	/**
	 * Whether to update the scheduled task statistic
	 */
	private Boolean updateScheduledTask;
	
	/**
	 * What message will be presented in the main command upon completion
	 */
	private String completionMessage;
	
	/**
	 * Name of the command
	 */
	private CommandName name;
	
	/**
	 * What triggered the command
	 */
	private CommandTrigger trigger;

	/**
	 * @return the sendUpdatesToClient
	 */
	public Boolean getSendUpdatesToClient() {
		return sendUpdatesToClient;
	}

	/**
	 * @param sendUpdatesToClient the sendUpdatesToClient to set
	 * @return updated CommandBody object
	 */
	public CommandBody setSendUpdatesToClient(Boolean sendUpdatesToClient) {
		this.sendUpdatesToClient = sendUpdatesToClient;
		return this;
	}

	/**
	 * @return the updateScheduledTask
	 */
	public boolean isUpdateScheduledTask() {
		return updateScheduledTask;
	}

	/**
	 * @param updateScheduledTask the updateScheduledTask to set
	 * @return updated CommandBody object
	 */
	public CommandBody setUpdateScheduledTask(boolean updateScheduledTask) {
		this.updateScheduledTask = updateScheduledTask;
		return this;
	}

	/**
	 * @return the completionMessage
	 */
	public String getCompletionMessage() {
		return completionMessage;
	}

	/**
	 * @param completionMessage the completionMessage to set
	 * @return updated CommandBody object
	 * 
	 */
	public CommandBody setCompletionMessage(String completionMessage) {
		this.completionMessage = completionMessage;
		return this;
	}

	/**
	 * @return the name
	 */
	public CommandName getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @return updated CommandBody object
	 * 
	 */
	public CommandBody setName(CommandName name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the trigger
	 */
	public CommandTrigger getTrigger() {
		return trigger;
	}

	/**
	 * @param trigger the trigger to set
	 * @return updated CommandBody object
	 */
	public CommandBody setTrigger(CommandTrigger trigger) {
		this.trigger = trigger;
		return this;
	}
}
