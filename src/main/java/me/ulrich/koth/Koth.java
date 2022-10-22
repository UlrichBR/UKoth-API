package me.ulrich.koth;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.koth.api.KothAPIManager;
import me.ulrich.koth.data.Addon;
import me.ulrich.koth.data.Extension;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public class Koth extends JavaPlugin{

	private static Koth Core;
	private BukkitAudiences adventure;
	private KothAPIManager kothAPI;
	
	//addon usage
	private HashMap<Addon, Boolean> addonEnabledList = new HashMap<Addon, Boolean>();
	//extension usage
	private HashMap<Extension, Boolean> extensionEnabledList = new HashMap<Extension, Boolean>();
	private HashMap<Extension, Boolean> extensionDisabledList = new HashMap<Extension, Boolean>();
	
	public static Koth getCore() {
		return Core;
	}

	public BukkitAudiences getAdventure() {
		return adventure;
	}

	public KothAPIManager getKothAPI() {
		return kothAPI;
	}

	public HashMap<Addon, Boolean> getAddonEnabledList() {
		return addonEnabledList;
	}

	public void setAddonEnabledList(HashMap<Addon, Boolean> addonEnabledList) {
		this.addonEnabledList = addonEnabledList;
	}

	public HashMap<Extension, Boolean> getExtensionEnabledList() {
		return extensionEnabledList;
	}

	public void setExtensionEnabledList(HashMap<Extension, Boolean> extensionEnabledList) {
		this.extensionEnabledList = extensionEnabledList;
	}

	public HashMap<Extension, Boolean> getExtensionDisabledList() {
		return extensionDisabledList;
	}

	public void setExtensionDisabledList(HashMap<Extension, Boolean> extensionDisabledList) {
		this.extensionDisabledList = extensionDisabledList;
	}






	


}
