package me.ulrich.koth.data;

import java.util.UUID;

import me.ulrich.koth.data.KothEnum.TopType;

public class StatsData {

	private UUID id;
	private long winDate;
	private TopType type;
	private String data;
	private UUID kothUUID;

	public StatsData(UUID id, String data, long winDate, TopType type, UUID kothUUID) {
		this.setId(id);
		this.setData(data);
		this.setWinDate(winDate);
		this.setType(type);
		this.setKothUUID(kothUUID);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public TopType getType() {
		return type;
	}

	public void setType(TopType type) {
		this.type = type;
	}

	public long getWinDate() {
		return winDate;
	}

	public void setWinDate(long winDate) {
		this.winDate = winDate;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public UUID getKothUUID() {
		return kothUUID;
	}

	public void setKothUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}
}
