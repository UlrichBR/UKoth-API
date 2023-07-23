package me.ulrich.koth.data;

import me.ulrich.koth.data.KothEnum.LootType;

public class LootSettings {

	private LootType type;
	private int chance;

	public LootSettings(LootType type, int chance) {
		this.setType(type);
		this.setChance(chance);
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


}
