package me.ulrich.koth.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface ClaimImplement {
	
	boolean hasClaimLocation(Location location);
	
	Optional<String> getClaimName(Location location);
	
	boolean isOwnerClaimLocation(Player player, Location location);
	
	Optional<UUID> getClaimOwner(Location location);
	
	boolean isMemberClaimLocation(Player player, Location location);

	List<UUID> getClaimMembers(Location location);

	Location[] getClaimCornersLocation(Player player, Location location);

	boolean canDestroyClaimLocation(Player player, Location location);
	
	boolean changeDestroyClaimLocation(Location location, boolean destroy);
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
