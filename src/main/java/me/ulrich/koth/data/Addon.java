package me.ulrich.koth.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.koth.loader.Serializer;
import me.ulrich.koth.loader.addon.AddonClassloader;

public abstract class Addon {
	private boolean enabled;
	private Serializer dataSerializer;
	private Serializer configSerializer;
	private JavaPlugin instance;
	private String name;
	private String author;
	private String version;
	private String require;
	private AddonClassloader classLoader;
	private File addonDataFolder;
	private HashMap<String, InputStream> addonFiles;

	public boolean isEnabled() {
		return false;
	}

	public void setEnabled(boolean enabled) {
		
	}

	public JavaPlugin getInstance() {
		return null;
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
		
	}

	public AddonClassloader getClassLoader() {
		return null;
	}

	public void setClassLoader(AddonClassloader classLoader) {
		
	}

	public File getAddonDataFolder() {
		return null;
	}

	public void enable(JavaPlugin instance, File addonDataFolder, Serializer dataSerializer,
			Serializer configSerializer) {

	}

	protected boolean logThis(Exception e) {
		

		return false;

	}

	public void disable() {
		if (!isEnabled())
			throw new IllegalStateException("Cannot disable the addon when it isn't enabled");
		onDisable();
		setEnabled(false);
	}

	public abstract void onEnable();

	public abstract void onDisable();

	public Serializer getDataSerializer() {
		return null;
	}

	public Serializer getConfigSerializer() {
		return null;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public HashMap<String, InputStream> getAddonFiles() {
		return addonFiles;
	}

	public void setAddonFiles(HashMap<String, InputStream> addonFiles) {
		this.addonFiles = addonFiles;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}
}

