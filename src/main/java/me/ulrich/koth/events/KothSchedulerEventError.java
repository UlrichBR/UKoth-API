package me.ulrich.koth.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.koth.data.KothEnum.KothSchedulerError;

public class KothSchedulerEventError extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private UUID kothUUID;
	private KothSchedulerError error;
    
    public KothSchedulerEventError(UUID kothUUID, KothSchedulerError error) {
    	this.setKothUUID(kothUUID);
    	this.setError(error);
    }
    
	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public UUID getKothUUID() {
		return kothUUID;
	}

	public void setKothUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}

	public KothSchedulerError getError() {
		return error;
	}

	public void setError(KothSchedulerError error) {
		this.error = error;
	}




}
