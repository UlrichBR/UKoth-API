package me.ulrich.koth;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.koth.api.KothAPIManager;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public class Koth extends JavaPlugin{

	private static Koth Core;
	private BukkitAudiences adventure;
	private KothAPIManager kothAPI;
	
	public static Koth getCore() {
		return Core;
	}

	public BukkitAudiences getAdventure() {
		return adventure;
	}

	public KothAPIManager getKothAPI() {
		return kothAPI;
	}






	


}
