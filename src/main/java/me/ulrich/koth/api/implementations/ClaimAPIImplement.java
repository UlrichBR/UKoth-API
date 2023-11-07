package me.ulrich.koth.api.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

import org.bukkit.Location;

import me.ulrich.koth.interfaces.ClaimAPI;
import me.ulrich.koth.interfaces.ClaimImplement;

public class ClaimAPIImplement implements ClaimAPI {

	@Override
	public Optional<ClaimImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, ClaimImplement> getImplementedClaim() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, ClaimImplement region) {
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
	public List<String> getImplementationPluginsName() {
		return null;
	}

	@Override
	public List<Entry<String, ClaimImplement>> findClaimedLocationImplement(Location location) {
		return null;
	}

	@Override
	public Optional<ClaimImplement> getClaimImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public HashMap<String, ClaimImplement> getImplementationPluginsData() {
		return null;
	}

}
