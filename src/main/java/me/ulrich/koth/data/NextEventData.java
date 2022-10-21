package me.ulrich.koth.data;

import java.util.UUID;

public class NextEventData {

	private UUID kothId;
	private UUID schedulerId;

	public NextEventData(UUID kothId, UUID schedulerId) {
		this.setKothId(kothId);
		this.setSchedulerId(schedulerId);
	}

	public UUID getKothId() {
		return kothId;
	}

	public void setKothId(UUID kothId) {
		this.kothId = kothId;
	}

	public UUID getSchedulerId() {
		return schedulerId;
	}

	public void setSchedulerId(UUID schedulerId) {
		this.schedulerId = schedulerId;
	}
}
