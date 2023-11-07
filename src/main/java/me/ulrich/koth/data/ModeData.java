package me.ulrich.koth.data;

import java.util.Optional;

import org.jetbrains.annotations.NotNull;

public class ModeData {

	private String id;
	private Optional<Addon> addon;
	private String icon;
	private String description;

	public ModeData(@NotNull String id, Optional<Addon> addon,@NotNull String icon,@NotNull String description) {
		this.setId(id);
		this.setAddon(addon);
		this.setIcon(icon);
		this.setDescription(description);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Optional<Addon> getAddon() {
		return addon;
	}

	public void setAddon(Optional<Addon> addon) {
		this.addon = addon;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
