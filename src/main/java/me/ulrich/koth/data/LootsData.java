package me.ulrich.koth.data;

import java.util.UUID;

public class LootsData {

	private UUID id;
	private String name;
	private String desc;
	private String loots;

	public LootsData(UUID id, String name, String desc, String loots) {
		this.setId(id);
		this.setName(name);
		this.setDesc(desc);
		this.setLoots(loots);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLoots() {
		return loots;
	}

	public void setLoots(String loots) {
		this.loots = loots;
	}
}
