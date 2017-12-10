package media.thehoard.thirdparty.api.sonarr.endpoints;

import java.util.HashMap;
import java.util.Map;

public class SystemStatus {

	private String version;
	private String buildTime;
	private Boolean isDebug;
	private Boolean isProduction;
	private Boolean isAdmin;
	private Boolean isUserInteractive;
	private String startupPath;
	private String appData;
	private String osVersion;
	private Boolean isMono;
	private Boolean isLinux;
	private Boolean isWindows;
	private String branch;
	private Boolean authentication;
	private Integer startOfWeek;
	private String urlBase;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public SystemStatus withVersion(String version) {
		this.version = version;
		return this;
	}

	public String getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}

	public SystemStatus withBuildTime(String buildTime) {
		this.buildTime = buildTime;
		return this;
	}

	public Boolean getIsDebug() {
		return isDebug;
	}

	public void setIsDebug(Boolean isDebug) {
		this.isDebug = isDebug;
	}

	public SystemStatus withIsDebug(Boolean isDebug) {
		this.isDebug = isDebug;
		return this;
	}

	public Boolean getIsProduction() {
		return isProduction;
	}

	public void setIsProduction(Boolean isProduction) {
		this.isProduction = isProduction;
	}

	public SystemStatus withIsProduction(Boolean isProduction) {
		this.isProduction = isProduction;
		return this;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public SystemStatus withIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
		return this;
	}

	public Boolean getIsUserInteractive() {
		return isUserInteractive;
	}

	public void setIsUserInteractive(Boolean isUserInteractive) {
		this.isUserInteractive = isUserInteractive;
	}

	public SystemStatus withIsUserInteractive(Boolean isUserInteractive) {
		this.isUserInteractive = isUserInteractive;
		return this;
	}

	public String getStartupPath() {
		return startupPath;
	}

	public void setStartupPath(String startupPath) {
		this.startupPath = startupPath;
	}

	public SystemStatus withStartupPath(String startupPath) {
		this.startupPath = startupPath;
		return this;
	}

	public String getAppData() {
		return appData;
	}

	public void setAppData(String appData) {
		this.appData = appData;
	}

	public SystemStatus withAppData(String appData) {
		this.appData = appData;
		return this;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public SystemStatus withOsVersion(String osVersion) {
		this.osVersion = osVersion;
		return this;
	}

	public Boolean getIsMono() {
		return isMono;
	}

	public void setIsMono(Boolean isMono) {
		this.isMono = isMono;
	}

	public SystemStatus withIsMono(Boolean isMono) {
		this.isMono = isMono;
		return this;
	}

	public Boolean getIsLinux() {
		return isLinux;
	}

	public void setIsLinux(Boolean isLinux) {
		this.isLinux = isLinux;
	}

	public SystemStatus withIsLinux(Boolean isLinux) {
		this.isLinux = isLinux;
		return this;
	}

	public Boolean getIsWindows() {
		return isWindows;
	}

	public void setIsWindows(Boolean isWindows) {
		this.isWindows = isWindows;
	}

	public SystemStatus withIsWindows(Boolean isWindows) {
		this.isWindows = isWindows;
		return this;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public SystemStatus withBranch(String branch) {
		this.branch = branch;
		return this;
	}

	public Boolean getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Boolean authentication) {
		this.authentication = authentication;
	}

	public SystemStatus withAuthentication(Boolean authentication) {
		this.authentication = authentication;
		return this;
	}

	public Integer getStartOfWeek() {
		return startOfWeek;
	}

	public void setStartOfWeek(Integer startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	public SystemStatus withStartOfWeek(Integer startOfWeek) {
		this.startOfWeek = startOfWeek;
		return this;
	}

	public String getUrlBase() {
		return urlBase;
	}

	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}

	public SystemStatus withUrlBase(String urlBase) {
		this.urlBase = urlBase;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public SystemStatus withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
