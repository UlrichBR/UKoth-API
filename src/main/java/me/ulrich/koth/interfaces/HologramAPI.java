package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface HologramAPI {

	Optional<HologramImplement> getPreferentialOrFirstImplement();
	
	HashMap<String, HologramImplement> getImplementedHolograms();

	boolean addImplementation(String pluginName, HologramImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPluginsNames();
	
	HashMap<String, HologramImplement> getImplementationPluginsData();

	Optional<HologramImplement> getHologramImplemented(String pluginName);
}
