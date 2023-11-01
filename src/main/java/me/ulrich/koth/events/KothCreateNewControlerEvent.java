package me.ulrich.koth.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KothCreateNewControlerEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private UUID kothUUID;
	private Player constoler;
    
    public KothCreateNewControlerEvent(UUID kothUUID, Player constoler) {
    	this.setKothUUID(kothUUID);
    	this.setControler(constoler);
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

	public Player getControler() {
		return constoler;
	}

	public void setControler(Player constoler) {
		this.constoler = constoler;
	}




}
