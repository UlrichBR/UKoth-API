package me.ulrich.koth.interfaces;

import java.util.List;
import java.util.Optional;

import org.bukkit.Location;

import me.ulrich.koth.data.HoloData;



public interface HologramImplement {
	
	boolean hasHologram(String id);
	
	Optional<HoloData> createHologram(String id, Location loc, List<String>lines, Object...objects);
	
	void createHologramTimed(Long deleteAfterTicks, String id, Location loc, List<String> lines, Object... objects);

	boolean deleteHolo(String id);
	
	Optional<HoloData> getHologram(String id);
	
	Optional<HoloData> updateHologram(String id, List<String>lines, Object...objects);

	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
