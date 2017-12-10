package media.thehoard.thirdparty.api.sonarr.endpoints.common;

public enum SortDirection {
	Ascending("asc"),
	Descending("desc");

	private String strVal;

	SortDirection(String strVal) {
		this.strVal = strVal;
	}

	@Override
	public String toString() {
		return this.strVal;
	}
}