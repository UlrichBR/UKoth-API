package me.ulrich.koth.api;

import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.koth.Koth;
import me.ulrich.koth.interfaces.GroupAPI;
import me.ulrich.koth.interfaces.HologramAPI;
import me.ulrich.koth.interfaces.KothAPI;
import me.ulrich.koth.interfaces.ScoreboardAPI;

public class KothAPIManager implements KothAPI {

	public static KothAPIManager getInstance() {
		return null;
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
	public Set<UUID> getAllKothEvent(){
		return null;
	}


}
