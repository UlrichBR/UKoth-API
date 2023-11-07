package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


public interface MoneyAPI {

	Optional<MoneyImplement> getPreferentialOrFirstImplement();

	HashMap<String, MoneyImplement> getImplementedMoney();

	boolean addImplementation(String pluginName, MoneyImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	Optional<MoneyImplement> getMoneyImplemented(String pluginName);

	List<String> getImplementationPluginsNames();
	
	HashMap<String, MoneyImplement> getImplementationPluginsData();



}