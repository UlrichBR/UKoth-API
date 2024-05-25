package me.ulrich.koth.data;

import me.ulrich.koth.data.KothEnum.LootType;

public class LootSettings {

	private LootType type;
	private int chance;
	private int maxAmount;
	private boolean group;

	public LootSettings(LootType type, int chance, int maxAmount, boolean group) {
		this.setType(type);
		this.setChance(chance);
		this.setMaxAmount(maxAmount);
		this.setGroup(group);
	}

	public LootType getType() {
		return type;
	}

	public void setType(LootType type) {
		this.type = type;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}

	public int getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(int maxAmount) {
		this.maxAmount = maxAmount;
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}


}
