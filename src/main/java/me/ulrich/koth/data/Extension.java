package me.ulrich.koth.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.koth.loader.Serializer;
import me.ulrich.koth.loader.extension.ExtensionClassloader;

public abstract class Extension {
	private boolean enabled;
	private Serializer dataSerializer;
	private Serializer configSerializer;
	private JavaPlugin instance;
	private String name;
	private String author;
	private String version;
	private String require;
	private String description;
	private String category;
	private ExtensionClassloader classLoader;
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

	public ExtensionClassloader getClassLoader() {
		return null;
	}

	public void setClassLoader(ExtensionClassloader classLoader) {
		
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
		return null;
	}

	public void setAuthor(String author) {
		
	}

	public String getVersion() {
		return null;
	}

	public void setVersion(String version) {
		
	}

	public String getDescription() {
		return null;
	}
	
	public void setDescription(String description) {
		
	}
	
	public HashMap<String, InputStream> getAddonFiles() {
		return null;
	}

	public void setAddonFiles(HashMap<String, InputStream> addonFiles) {
		
	}

	public String getRequire() {
		return null;
	}

	public void setRequire(String require) {
		
	}

	public String getCategory() {
		return null;
	}

	public void setCategory(String category) {
		
	}
}

