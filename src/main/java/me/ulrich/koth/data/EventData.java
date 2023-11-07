package me.ulrich.koth.data;

import org.bukkit.entity.Player;

import me.ulrich.koth.data.KothEnum.KothStatus;


public class EventData {

	private KothStatus status;
	private Player playerControl;
	private Long startedControl;
	private Long startedEvent;
	private Long addition;
	private EventData_Location eventLocation;

	public EventData(KothStatus status, Player playerControl, Long startedControl, Long startedEvent, Long addition, EventData_Location eventLocation) {
		this.setStatus(status);
		this.setPlayerControl(playerControl);
		this.setStartedControl(startedControl);
		this.setStartedEvent(startedEvent);
		this.setAddition(addition);
		this.setEventLocation(eventLocation);
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

	public Long getAddition() {
		return addition;
	}

	public void setAddition(Long addition) {
		this.addition = addition;
	}

	public EventData_Location getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(EventData_Location eventLocation) {
		this.eventLocation = eventLocation;
	}
}
