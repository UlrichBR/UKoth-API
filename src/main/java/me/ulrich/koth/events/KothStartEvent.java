package me.ulrich.koth.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KothStartEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private UUID kothUUID;
	private CommandSender player;
    
    public KothStartEvent(UUID kothUUID, CommandSender sender) {
    	this.setKothUUID(kothUUID);
    	this.setPlayer(sender);
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

	public CommandSender getPlayer() {
		return player;
	}

	public void setPlayer(CommandSender player) {
		this.player = player;
	}



}
