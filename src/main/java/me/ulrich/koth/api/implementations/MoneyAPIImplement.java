package me.ulrich.koth.api.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.koth.interfaces.MoneyAPI;
import me.ulrich.koth.interfaces.MoneyImplement;

public class MoneyAPIImplement implements MoneyAPI {

	@Override
	public Optional<MoneyImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, MoneyImplement> getImplementedMoney() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, MoneyImplement region) {
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
	public Optional<MoneyImplement> getMoneyImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public List<String> getImplementationPluginsNames() {
		return null;
	}

	@Override
	public HashMap<String, MoneyImplement> getImplementationPluginsData() {
		return null;
	}

}
