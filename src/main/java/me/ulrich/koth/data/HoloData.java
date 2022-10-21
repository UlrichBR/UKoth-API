package me.ulrich.koth.data;

import org.bukkit.Location;

import me.ulrich.koth.interfaces.Hologram;

public class HoloData {

	private String id;
	private Location loc;
	private Hologram hologram;
	private Object extra;
	private int maxlines;
	private Object top;

	public HoloData(String id, Location loc, Hologram hologram, int maxlines, Object extra, Object top) {
		this.setId(id);
		this.setLoc(loc);
		this.setHologram(hologram);
		this.setExtra(extra);
		this.setTop(top);
		this.setMaxlines(maxlines);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public Hologram getHologram() {
		return hologram;
	}

	public void setHologram(Hologram hologram) {
		this.hologram = hologram;
	}

	public Object getExtra() {
		return extra;
	}

	public void setExtra(Object extra) {
		this.extra = extra;
	}

	public int getMaxlines() {
		return maxlines;
	}

	public void setMaxlines(int maxlines) {
		this.maxlines = maxlines;
	}

	public Object getTop() {
		return top;
	}

	public void setTop(Object top) {
		this.top = top;
	}
}
