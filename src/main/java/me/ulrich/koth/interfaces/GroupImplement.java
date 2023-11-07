package me.ulrich.koth.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface GroupImplement {
	
	Optional<String> getGroupName(Player player);

	Optional<String> getGroupName(UUID player);

	boolean playerHasGroup(Player player);
	
	boolean playerHasGroup(UUID player);
	
	List<UUID> getGroupOnlineMembers(Player player);
	
	List<UUID> getGroupOnlineMembers(UUID player);

	public List<String> getMembersName(Player player);

	public List<String> getMembersName(UUID player);
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
