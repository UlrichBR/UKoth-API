package me.ulrich.koth.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KothFindNewControlerEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private UUID kothUUID;
	private Player lastControler;
    
    public KothFindNewControlerEvent(UUID kothUUID, Player lastControler) {
    	this.setKothUUID(kothUUID);
    	this.setLastControler(lastControler);
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

	public Player getLastControler() {
		return lastControler;
	}

	public void setLastControler(Player lastControler) {
		this.lastControler = lastControler;
	}




}
