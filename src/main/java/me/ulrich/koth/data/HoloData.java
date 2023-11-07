package me.ulrich.koth.data;

import java.util.List;

import org.bukkit.Location;

public class HoloData {

	private String id;
	private Location loc;
	private Object hologram;
	private Object[] extra;
	private List<String> lines;

	public HoloData(String id, Location loc, Object hologram, List<String> lines, Object... extra) {
		this.setId(id);
		this.setLoc(loc);
		this.setHologram(hologram);
		
		this.setLines(lines);
		this.setExtra(extra);
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

	public Object getHologram() {
		return hologram;
	}

	public void setHologram(Object hologram) {
		this.hologram = hologram;
	}

	public Object[] getExtra() {
		return extra;
	}

	public void setExtra(Object[] extra) {
		this.extra = extra;
	}

	public List<String> getLines() {
		return lines;
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}
	
}
