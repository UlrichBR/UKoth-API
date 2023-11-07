package me.ulrich.koth.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.koth.extension.ExtensionSerializer;
import me.ulrich.koth.extension.ExtensionClassloader;

public abstract class Extension {
	private boolean enabled;
	private ExtensionSerializer dataSerializer;
	private ExtensionSerializer configSerializer;
	private JavaPlugin instance;
	private String name;
	private String author;
	private String version;
	private String require;
	private ExtensionClassloader classLoader;
	private File addonDataFolder;
	private HashMap<String, InputStream> addonFiles;

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public JavaPlugin getInstance() {
		return this.instance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExtensionClassloader getClassLoader() {
		return this.classLoader;
	}

	public void setClassLoader(ExtensionClassloader classLoader) {
		this.classLoader = classLoader;
	}

	public File getAddonDataFolder() {
		return this.addonDataFolder;
	}

	public void enable(JavaPlugin instance, File addonDataFolder, ExtensionSerializer dataSerializer,
			ExtensionSerializer configSerializer) {

		try {
			if (isEnabled())
				this.instance.getLogger()
						.warning("Error extension: " + addonDataFolder.getName() + ", The extension is already enabled.");
			this.instance = instance;
			this.addonDataFolder = addonDataFolder;
			this.dataSerializer = dataSerializer;
			this.configSerializer = configSerializer;
			addonDataFolder.mkdirs();
			onEnable();
			setEnabled(true);
		} catch (Exception e) {
			logThis(e);
		}
	}

	protected boolean logThis(Exception e) {
		try {
			String stacktrace = ExceptionUtils.getStackTrace(e);
			//new UtilsManager((me.ulrich.clans.Clans) Bukkit.getPluginManager().getPlugin("UltimateClans")).addLog(stacktrace, "extension-"+addonDataFolder.getName()+"-stacktrace");
			this.instance.getLogger().warning("Error extension: " + addonDataFolder.getName() + ", StackTrace: saved in /logs/extension-"+addonDataFolder.getName()+"-stacktrace.log");
			return true;
		} catch (ClassCastException X) {
			this.instance.getLogger().warning("Error extension: " + addonDataFolder.getName() + ", StackTrace: Error to save log!");

		}

		return false;

	}

	public void disable() {
		if (!isEnabled())
			throw new IllegalStateException("Cannot disable the extension when it isn't enabled");
		onDisable();
		setEnabled(false);
	}

	public abstract void onEnable();

	public abstract void onDisable();

	public ExtensionSerializer getDataSerializer() {
		return this.dataSerializer;
	}

	public ExtensionSerializer getConfigSerializer() {
		return this.configSerializer;
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
