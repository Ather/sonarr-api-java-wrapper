package media.thehoard.thirdparty.api.sonarr.endpoints.common;

public enum SortKey {
	SeriesTitle("series.title"),
	Date("date");

	private String strVal;

	SortKey(String strVal) {
		this.strVal = strVal;
	}

	@Override
	public String toString() {
		return this.strVal;
	}
}
