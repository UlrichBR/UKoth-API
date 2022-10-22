package me.ulrich.koth.interfaces;

import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface KothAPI {

	void addGroupImplement(GroupAPI impl);
	
	boolean hasGroupImplemented();

	void addScoreboardImplement(ScoreboardAPI impl);
	
	boolean hasScoreboardImplemented();
	
	boolean startKothEvent(String kothName);

	boolean startKothEvent(UUID kothUUID);

	boolean endKothEvent(String kothName);

	boolean endKothEvent(UUID kothUUID);

	boolean endKothEvent(UUID kothUUID, Player winner);

	Set<UUID> getAllKothEvent();
	


}
