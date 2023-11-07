package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


public interface GroupAPI {

	Optional<GroupImplement> getPreferentialOrFirstImplement();

	HashMap<String, GroupImplement> getImplementedGroup();

	boolean addImplementation(String pluginName, GroupImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPluginsName();
	
	Optional<GroupImplement> getGroupImplemented(String pluginName);

	HashMap<String, GroupImplement> getImplementationPluginsData();


}
