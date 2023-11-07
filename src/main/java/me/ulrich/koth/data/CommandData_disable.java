package me.ulrich.koth.data;

import java.util.List;

public class CommandData_disable {

	private List<String> disabledWorlds;
	private List<String> disabledRegions;

	public CommandData_disable(List<String> disabledWorlds, List<String> disabledRegions) {
		this.setDisabledWorlds(disabledWorlds);
		this.setDisabledRegions(disabledRegions);
	}

	public List<String> getDisabledWorlds() {
		return disabledWorlds;
	}

	public void setDisabledWorlds(List<String> disabledWorlds) {
		this.disabledWorlds = disabledWorlds;
	}

	public List<String> getDisabledRegions() {
		return disabledRegions;
	}

	public void setDisabledRegions(List<String> disabledRegions) {
		this.disabledRegions = disabledRegions;
	}
}
