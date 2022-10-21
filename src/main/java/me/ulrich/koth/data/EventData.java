package me.ulrich.koth.data;

import org.bukkit.entity.Player;

import me.ulrich.koth.data.KothEnum.KothStatus;


public class EventData {

	private KothStatus status;
	private Player playerControl;
	private Long startedControl;
	private Long startedEvent;

	public EventData(KothStatus status, Player playerControl, Long startedControl, Long startedEvent) {
		this.setStatus(status);
		this.setPlayerControl(playerControl);
		this.setStartedControl(startedControl);
		this.setStartedEvent(startedEvent);
	}

	public KothStatus getStatus() {
		return status;
	}

	public void setStatus(KothStatus status) {
		this.status = status;
	}

	public Player getPlayerControl() {
		return playerControl;
	}

	public void setPlayerControl(Player playerControl) {
		this.playerControl = playerControl;
	}

	public Long getStartedControl() {
		return startedControl;
	}

	public void setStartedControl(Long startedControl) {
		this.startedControl = startedControl;
	}

	public Long getStartedEvent() {
		return startedEvent;
	}

	public void setStartedEvent(Long startedEvent) {
		this.startedEvent = startedEvent;
	}
}
