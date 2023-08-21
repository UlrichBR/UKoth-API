package me.ulrich.koth.data;

public class GeneralSettings {

	private boolean allowWithoutGroup;
	private boolean autoDestroy;
	private boolean allowPlayerWarp;
	private boolean visibleToPlayers;
	private boolean stopTimeInDispute;

	public GeneralSettings(boolean allowWithoutGroup, boolean autoDestroy, boolean allowPlayerWarp, boolean visibleToPlayers, boolean stopTimeInDispute) {
		this.setAllowWithoutGroup(allowWithoutGroup);
		this.setAutoDestroy(autoDestroy);
		this.setAllowPlayerWarp(allowPlayerWarp);
		this.setVisibleToPlayers(visibleToPlayers);
		this.setStopTimeInDispute(stopTimeInDispute);
	}

	public boolean isAllowWithoutGroup() {
		return allowWithoutGroup;
	}

	public void setAllowWithoutGroup(boolean allowWithoutGroup) {
		this.allowWithoutGroup = allowWithoutGroup;
	}

	public boolean isAutoDestroy() {
		return autoDestroy;
	}

	public void setAutoDestroy(boolean autoDestroy) {
		this.autoDestroy = autoDestroy;
	}

	public boolean isAllowPlayerWarp() {
		return allowPlayerWarp;
	}

	public void setAllowPlayerWarp(boolean allowPlayerWarp) {
		this.allowPlayerWarp = allowPlayerWarp;
	}

	public boolean isVisibleToPlayers() {
		return visibleToPlayers;
	}

	public void setVisibleToPlayers(boolean visibleToPlayers) {
		this.visibleToPlayers = visibleToPlayers;
	}

	public boolean isStopTimeInDispute() {
		return stopTimeInDispute;
	}

	public void setStopTimeInDispute(boolean stopTimeInDispute) {
		this.stopTimeInDispute = stopTimeInDispute;
	}
}
