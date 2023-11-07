package me.ulrich.koth.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

public interface MoneyImplement {
	
	boolean hasMoney(Player player, int amount);

	boolean addMoney(Player player, int amount);

	boolean withdrawMoney(Player player, int amount);

	int getMoney(Player player);
	
	boolean isInternal();
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();


}
