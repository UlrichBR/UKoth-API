package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.koth.data.CubRegionLoc;
import me.ulrich.koth.data.IslandJoinLeaveData;
import me.ulrich.koth.data.KothData;

public interface KothAPI {

	void addGroupImplement(GroupAPI impl);
	
	boolean hasGroupImplemented();

	void addScoreboardImplement(ScoreboardAPI impl);
	
	boolean hasScoreboardImplemented();

	void addHoloImplement(HologramAPI impl);
	
	boolean hasHoloImplemented();
	
	boolean startKothEvent(String kothName);

	boolean startKothEvent(UUID kothUUID);

	boolean endKothEvent(String kothName);

	boolean endKothEvent(UUID kothUUID);

	boolean endKothEvent(UUID kothUUID, Player winner);

	Set<UUID> getAllKothEvent();

	boolean hasKothStarted(String kothName);

	boolean hasKothStarted(UUID kothUUID);

	UUID getKothUUID(String kothName);

	String getKothName(UUID kothUUID);

	String getTag();

	KothData getKoth(UUID kothUUID);

	CubRegionLoc getKoth(Location location);

	List<Player> getAdminMode();

	HashMap<UUID, IslandJoinLeaveData> getPlayerRegion();

	HashMap<UUID, KothData> getKothData();



	


}
