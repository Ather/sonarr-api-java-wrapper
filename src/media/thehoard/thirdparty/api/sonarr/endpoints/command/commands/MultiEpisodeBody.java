package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

import java.util.List;

import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;

public class MultiEpisodeBody extends CommandBody {
	/**
	 * List of episode IDs being modified
	 */
	private List<Integer> episodeIds;

	/**
	 * @return the seriesIds
	 */
	public List<Integer> getSeriesIds() {
		return episodeIds;
	}

	/**
	 * @param episodeIds the episodeIds to set
	 * @return updated CommandBody object
	 */
	public MultiEpisodeBody setSeriesIds(List<Integer> episodeIds) {
		this.episodeIds = episodeIds;
		return this;
	}
}
