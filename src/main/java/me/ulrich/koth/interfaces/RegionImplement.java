package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public interface RegionImplement {
	
	boolean hasRegion(String regionName, Location location);
	
	boolean isPVPAllowed(Player player, Location location);
	
	boolean isExitAllowed(Player player, Location location);
	
	boolean isEntryAllowed(Player player, Location location);

	boolean isInRegion(Player player, String regionName);
	
	List<String> getPlayerRegion(Player player);
	
	boolean hasBuildPermission(Player player, Block block);
	
	List<String> getLocationRegion(Location loc);
	
	List<String> getWorldRegionList(World world);
	
	HashMap<String, Location[]> getWorldRegionCorners(World world);
	
	HashMap<String, Location[]> findWorldRegionCorners(World world, String region);
	
	List<UUID> getOwners(Location loc);
	
	List<UUID> getMembers(Location loc);
	
	Location[] getCorders(Location loc);
	
	HashMap<String, String> getFlags(Location loc);
	
	Optional<String> getPluginVersion();

	Optional<String> getPluginName();
}
