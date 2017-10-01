package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

import java.util.List;

import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;

public class MultiSeriesBody extends CommandBody {
	/**
	 * List of series IDs being modified
	 */
	private List<Integer> seriesIds;

	/**
	 * @return the seriesIds
	 */
	public List<Integer> getSeriesIds() {
		return seriesIds;
	}

	/**
	 * @param seriesIds the seriesIds to set
	 * @return updated CommandBody object
	 */
	public MultiSeriesBody setSeriesIds(List<Integer> seriesIds) {
		this.seriesIds = seriesIds;
		return this;
	}
}
