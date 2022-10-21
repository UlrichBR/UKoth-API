package me.ulrich.koth.data;

public class GeneralSettings {

	private boolean allowWithoutGroup;

	public GeneralSettings(boolean allowWithoutGroup) {
		this.setAllowWithoutGroup(allowWithoutGroup);
	}

	public boolean isAllowWithoutGroup() {
		return allowWithoutGroup;
	}

	public void setAllowWithoutGroup(boolean allowWithoutGroup) {
		this.allowWithoutGroup = allowWithoutGroup;
	}
}
