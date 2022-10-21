package me.ulrich.koth.interfaces;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface GroupAPI {

	String getGroupName(Player player);

	String getGroupName(UUID player);

	boolean playerHasGroup(Player player);
	
	boolean playerHasGroup(UUID player);
	
	List<UUID> getGroupOnlineMembers(Player player);
	
	List<UUID> getGroupOnlineMembers(UUID player);

	String getPluginVersion();


}
