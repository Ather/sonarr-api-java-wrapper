package media.thehoard.thirdparty.api.sonarr.endpoints.command.commands;

public class SeasonBody extends SeriesBody {
	/**
	 * Season being modified
	 */
	private Integer seasonNumber;

	/**
	 * @return the seasonNumber
	 */
	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	/**
	 * @param seasonNumber the seasonNumber to set
	 * @return updated CommandBody object
	 */
	public SeasonBody setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}
}
