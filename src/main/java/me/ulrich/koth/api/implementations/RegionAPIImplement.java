package me.ulrich.koth.api.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.koth.interfaces.RegionAPI;
import me.ulrich.koth.interfaces.RegionImplement;

public class RegionAPIImplement implements RegionAPI {

	@Override
	public Optional<RegionImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, RegionImplement> getImplementedRegions() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, RegionImplement region) {
		return false;
	}

	@Override
	public boolean hasPluginImplemented(String pluginName) {
		return false;
	}

	@Override
	public boolean removeImplementation(String pluginName) {
		return false;
	}

	@Override
	public List<String> getImplementationPluginsNames() {
		return null;
	}

	@Override
	public HashMap<String, RegionImplement> getImplementationPluginsData() {
		return null;
	}

	@Override
	public Optional<RegionImplement> getRegionImplemented(String pluginName) {
		return Optional.empty();
	}

}
