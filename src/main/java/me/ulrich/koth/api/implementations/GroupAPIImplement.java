package me.ulrich.koth.api.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.koth.interfaces.GroupAPI;
import me.ulrich.koth.interfaces.GroupImplement;

public class GroupAPIImplement implements GroupAPI {

	@Override
	public Optional<GroupImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, GroupImplement> getImplementedGroup() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, GroupImplement region) {
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
	public Optional<GroupImplement> getGroupImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public HashMap<String, GroupImplement> getImplementationPluginsData() {
		return null;
	}

}
