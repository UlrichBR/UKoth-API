package me.ulrich.koth.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KothEndEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private UUID kothUUID;
	private Player player;
    
    public KothEndEvent(UUID kothUUID, Player player) {
    	this.setKothUUID(kothUUID);
    	this.setPlayer(player);
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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}



}
