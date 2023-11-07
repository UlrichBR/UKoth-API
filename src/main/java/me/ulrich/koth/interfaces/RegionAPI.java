package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface RegionAPI {

	Optional<RegionImplement> getPreferentialOrFirstImplement();

	HashMap<String, RegionImplement> getImplementedRegions();

	boolean addImplementation(String pluginName, RegionImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPluginsNames();
	
	HashMap<String, RegionImplement> getImplementationPluginsData();

	Optional<RegionImplement> getRegionImplemented(String pluginName);
}
