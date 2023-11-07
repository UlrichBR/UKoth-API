package me.ulrich.koth.api.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.koth.interfaces.HologramAPI;
import me.ulrich.koth.interfaces.HologramImplement;

public class HologramAPIImplement implements HologramAPI {

	@Override
	public Optional<HologramImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, HologramImplement> getImplementedHolograms() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, HologramImplement region) {
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
	public HashMap<String, HologramImplement> getImplementationPluginsData() {
		return null;
	}

	@Override
	public Optional<HologramImplement> getHologramImplemented(String pluginName) {
		return Optional.empty();
	}

}
