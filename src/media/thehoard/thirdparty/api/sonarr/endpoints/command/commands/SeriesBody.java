package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

import media.thehoard.thirdparty.api.sonarr.endpoints.command.CommandBody;

public class SeriesBody extends CommandBody {
	/**
	 * Series ID being modified
	 */
	private Integer seriesId;

	/**
	 * @return the seriesId
	 */
	public Integer getSeriesId() {
		return seriesId;
	}

	/**
	 * @param seriesId the seriesId to set
	 * @return updated CommandBody object
	 */
	public SeriesBody setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
		return this;
	}
}
