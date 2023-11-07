package me.ulrich.koth.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.google.common.base.Stopwatch;

import me.ulrich.koth.data.KothEnum.ExtensionsReturn;
import me.ulrich.koth.data.KothEnum.KothExtensions;

public class ExtEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private ExtensionsReturn extensionsReturn;
	private CommandSender commandSender;
	private Stopwatch stopwatch;
    
    public ExtEvent( CommandSender commandSender, ExtensionsReturn extensionsReturn, Stopwatch stopwatch, KothExtensions str) {
    	this.setExtensionsReturn(extensionsReturn);
    	this.setCommandSender(commandSender);
    	this.setStopwatch(stopwatch);
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

	public ExtensionsReturn getExtensionsReturn() {
		return extensionsReturn;
	}

	public void setExtensionsReturn(ExtensionsReturn extensionsReturn) {
		this.extensionsReturn = extensionsReturn;
	}

	public CommandSender getCommandSender() {
		return commandSender;
	}

	public void setCommandSender(CommandSender commandSender) {
		this.commandSender = commandSender;
	}

	public Stopwatch getStopwatch() {
		return stopwatch;
	}

	public void setStopwatch(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}




}
