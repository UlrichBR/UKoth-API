package me.ulrich.koth.data;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.koth.data.KothEnum.CubLoc;
import me.ulrich.koth.data.KothEnum.MovementWay;

public class IslandJoinLeaveData {
	private Player player;
	private MovementWay movementWay;
	private Location to;
	private UUID kothUUID;
	private CubLoc cubLoc;

//final Player player, final MovementWay movement, Location to, UUID island uuid
	

	public IslandJoinLeaveData(Player player, MovementWay movementWay, Location to, UUID kothUUID, CubLoc cubLoc) {
		this.setPlayer(player);
		this.setMovementWay(movementWay);
		this.setTo(to);
		this.setKothUUID(kothUUID);
		this.setCubLoc(cubLoc);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public MovementWay getMovementWay() {
		return movementWay;
	}

	public void setMovementWay(MovementWay movementWay) {
		this.movementWay = movementWay;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(Location to) {
		this.to = to;
	}


	public CubLoc getCubLoc() {
		return cubLoc;
	}

	public void setCubLoc(CubLoc cubLoc) {
		this.cubLoc = cubLoc;
	}

	public UUID getKothUUID() {
		return kothUUID;
	}

	public void setKothUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}



}
