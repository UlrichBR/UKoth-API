package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.ulrich.koth.data.Addon;
import me.ulrich.koth.data.CubRegionLoc;
import me.ulrich.koth.data.EventData;
import me.ulrich.koth.data.GuiData;
import me.ulrich.koth.data.IslandJoinLeaveData;
import me.ulrich.koth.data.KothData;
import me.ulrich.koth.data.KothEnum.CubLoc;
import me.ulrich.koth.data.KothEnum.KothStatus;
import me.ulrich.koth.data.LootsData;
import me.ulrich.koth.data.ModeData;
import me.ulrich.koth.data.NextEventData;

public interface KothAPI {


	void addScoreboardImplement(ScoreboardAPI impl);
	
	boolean hasScoreboardImplemented();
	
	boolean endKothEvent(String kothName);

	boolean endKothEvent(UUID kothUUID);

	boolean endKothEvent(UUID kothUUID, Player winner);

	Set<UUID> getAllKothEvent();

	boolean hasKothStarted(String kothName);

	boolean hasKothStarted(UUID kothUUID);

	Optional<UUID> getKothUUID(String kothName);

	Optional<String> getKothName(UUID kothUUID);

	String getTag();

	Optional<KothData> getKoth(UUID kothUUID);

	Optional<CubRegionLoc> getKoth(Location location);
	
	Optional<KothData> getKothByLocation(Location location);

	List<Player> getAdminMode();

	HashMap<UUID, IslandJoinLeaveData> getPlayerRegion();

	HashMap<UUID, KothData> getKothData();

	boolean startKothEvent(UUID kothUUID, Player sender);

	String parseText(KothData koth, String text);

	String parseText(UUID playerUUID, String text);

	Optional<KothData> getKoth(String name);

	boolean toggleStarterEnabled(boolean state);

	boolean togglePlayerAdminMode(Player player);

	boolean kothExists(UUID name);
	
	Optional<KothData> createNewKoth(String name, Location loc1, Location loc2);
	
	Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner);

	Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner, Optional<String> mode);

	boolean deleteKoth(UUID name);

	boolean moveKoth(UUID name, Location loc1, Location loc2);

	boolean teleportKoth(Player player, UUID uuid);

	Optional<Location> getCoordKoth(UUID uuid);

	Optional<ItemStack> getWand();

	Optional<ItemStack> getKeyWand();

	Optional<ItemStack> getKothKey(KothData koth, int amount);

	Optional<ItemStack> getStarterItem(KothData koth, int amount);

	boolean clearWand();

	boolean checkWand();

	boolean changeIconKoth(UUID name, ItemStack hand);

	HashMap<NextEventData, Long> getNextEvents(UUID kothUUID);

	void stopAllEvents();

	void removeControler(UUID kothUUID);

	void applyPlayerWinner(UUID kothUUID, Player winner);

	List<Player> getAllRegionPlayers(UUID kothUUID);

	List<String> getActiveEventList();

	HashMap<NextEventData, Long> getAllEvents();

	HashMap<NextEventData, Long> getNextEvents();

	boolean hasKothOwner(UUID koth);

	Optional<UUID> getKothOwner(UUID koth);

	List<KothData> getKothOwned(UUID playerUUID);

	boolean saveKothLoots(Inventory inventory, KothData koth);

	boolean addLootKoth(UUID name, ItemStack hand);

	void saveLootsData(LootsData loot);

	void saveKothData(KothData clan);

	boolean isUseGUI();

	List<KothData> getActiveEventListData(boolean system);

	HashMap<UUID, LootsData> getLootsData();

	Optional<ModeData> getKothDefaultMode();

	Optional<String> getKothDefaultModeName();

	List<String> getPlaceholdersList(Optional<ModeData> mode);

	boolean isDefaultMode(String name);

	boolean isCurrentMode(UUID kothUUID, Optional<ModeData> mode);

	boolean isDefaultMode(UUID kothUUID);

	Optional<ModeData> getKothMode(UUID kothUUID);

	boolean isDefaultMode(Optional<ModeData> mode);

	Optional<ModeData> registerMode(String name, Optional<Addon> addon, String icon, String desc);

	boolean unRegisterMode(String name);

	boolean hasMode(String string);

	Optional<ModeData> getMode(String string);

	Optional<String> getModeId(String string);

	HashMap<String, ModeData> getModes();

	boolean hasKothEvent(UUID koth);

	EventData getKothEvent(UUID koth);

	KothStatus getKothStatus(UUID koth);

	List<Player> getRegionPlayers(UUID kothUUID, CubLoc loc);

	HashMap<String, GuiData> getInsertGui();



}
