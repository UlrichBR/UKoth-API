package me.ulrich.koth.data;

public class GeneralSettings {

	private boolean allowWithoutGroup;
	private boolean autoDestroy;

	public GeneralSettings(boolean allowWithoutGroup, boolean autoDestroy) {
		this.setAllowWithoutGroup(allowWithoutGroup);
		this.setAutoDestroy(autoDestroy);
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
}
