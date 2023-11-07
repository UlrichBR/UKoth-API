package me.ulrich.koth.data;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import me.ulrich.koth.data.KothEnum.MovementWay;

public abstract class RegionEvent extends PlayerEvent {
    private static final HandlerList handlerList = new HandlerList();
    private IslandJoinLeaveData region;
    private MovementWay movement;
    public PlayerEvent parentEvent;

    public RegionEvent(IslandJoinLeaveData region, Player player, MovementWay movement, PlayerEvent parent) {
        super(player);
        this.region = region;
        this.movement = movement;
        this.parentEvent = parent;
    }

    public HandlerList getHandlers() {
        return handlerList;
    }

    public IslandJoinLeaveData getRegion() {
        return this.region;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public MovementWay getMovementWay() {
        return this.movement;
    }

    public PlayerEvent getParentEvent() {
        return this.parentEvent;
    }
}
