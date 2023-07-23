package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.koth.data.CubRegionLoc;
import me.ulrich.koth.data.IslandJoinLeaveData;
import me.ulrich.koth.data.KothData;
import me.ulrich.koth.data.NextEventData;

public interface KothAPI {

	void addGroupImplement(GroupAPI impl);
	
	boolean hasGroupImplemented();

	void addScoreboardImplement(ScoreboardAPI impl);
	
	boolean hasScoreboardImplemented();

	void addHoloImplement(HologramAPI impl);
	
	boolean hasHoloImplemented();
	
	boolean startKothEvent(String kothName);

	boolean startKothEvent(UUID kothUUID);

	boolean endKothEvent(String kothName);

	boolean endKothEvent(UUID kothUUID);

	boolean endKothEvent(UUID kothUUID, Player winner);

	Set<UUID> getAllKothEvent();

	boolean hasKothStarted(String kothName);

	boolean hasKothStarted(UUID kothUUID);

	UUID getKothUUID(String kothName);

	String getKothName(UUID kothUUID);

	String getTag();

	KothData getKoth(UUID kothUUID);

	Optional<CubRegionLoc> getKoth(Location location);
	
	Optional<KothData> getKothByLocation(Location location);

	List<Player> getAdminMode();

	HashMap<UUID, IslandJoinLeaveData> getPlayerRegion();

	HashMap<UUID, KothData> getKothData();

	boolean startKothEvent(UUID kothUUID, Player sender);

	String parseText(KothData koth, String text);

	String parseText(UUID playerUUID, String text);

	KothData getKoth(String name);

	boolean toggleStarterEnabled(boolean state);

	boolean togglePlayerAdminMode(Player player);

	boolean kothExists(UUID name);

	Optional<KothData> createNewKoth(String name, Location loc1, Location loc2);

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

	void findNewControler(UUID kothUUID);

	void setNewControler(UUID kothUUID, Player player);

	void applyPlayerWinner(UUID kothUUID, Player winner);

	List<Player> getAllRegionPlayers(UUID kothUUID);

	List<String> getActiveEventList();

	HashMap<NextEventData, Long> getAllEvents();

	HashMap<NextEventData, Long> getNextEvents();

	void findNewControler(UUID kothUUID, Player player, boolean sameGroup);

	boolean hasKothOwner(UUID koth);

	Optional<UUID> getKothOwner(UUID koth);

	List<KothData> getKothOwned(UUID playerUUID);

	Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner);




	


}
