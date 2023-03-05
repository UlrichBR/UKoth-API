package me.ulrich.koth.api;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.koth.Koth;
import me.ulrich.koth.data.CubRegionLoc;
import me.ulrich.koth.data.IslandJoinLeaveData;
import me.ulrich.koth.data.KothData;
import me.ulrich.koth.interfaces.GroupAPI;
import me.ulrich.koth.interfaces.HologramAPI;
import me.ulrich.koth.interfaces.KothAPI;
import me.ulrich.koth.interfaces.ScoreboardAPI;

public class KothAPIManager implements KothAPI {

	public static KothAPIManager getInstance() {
		return Koth.getCore().getKothAPI();
	}
	
	@Override
	public String getTag() {
		return null;
	}
	
	@Override
	public boolean hasHoloImplemented() {
		return false;
	}
	
	@Override
	public void addHoloImplement(HologramAPI impl) {}
	
	@Override
	public boolean hasGroupImplemented() {
		return false;
	}
	
	@Override
	public void addGroupImplement(GroupAPI impl) {}
	
	@Override
	public boolean hasScoreboardImplemented() {
		return false;
	}
	
	@Override
	public void addScoreboardImplement(ScoreboardAPI impl) {}
	
	@Override
	public boolean startKothEvent(String kothName) {
		return false;
	}
	
	@Override
	public boolean startKothEvent(UUID kothUUID) {
		return false;
	}
	
	@Override
	public boolean startKothEvent(UUID kothUUID, Player sender) {
		return false;
	}
	
	@Override
	public boolean endKothEvent(String kothName) {
		return false;
	}
	
	@Override
	public boolean endKothEvent(UUID kothUUID) {
		return false;
	}
	
	@Override
	public boolean endKothEvent(UUID kothUUID, Player winner) {
		return false;
	}
	
	@Override
	public boolean hasKothStarted(String kothName) {
		return false;
	}
	
	@Override
	public boolean hasKothStarted(UUID kothUUID) {
		return false;
	}
	
	@Override
	public String getKothName(UUID kothUUID) {
		return null;
	}
	
	@Override
	public UUID getKothUUID(String kothName) {
		return null;
	}
	
	@Override
	public KothData getKoth(UUID kothUUID) {
		return null;
	}
	
	@Override
	public CubRegionLoc getKoth(Location location) {
		return null;
	}
	
	@Override
	public List<Player> getAdminMode() {
		return null;
	}
	
	@Override
	public HashMap<UUID, IslandJoinLeaveData> getPlayerRegion() {
		return null;
	}
	
	@Override
	public HashMap<UUID, KothData> getKothData() {
		return null;
	}
	
	@Override
	public Set<UUID> getAllKothEvent(){
		return null;
	}
	
	@Override
	public String parseText(KothData koth, String text) {
		return null;
	}
	
	@Override
	public String parseText(UUID playerUUID, String text) {
		return null;
	}	


}
