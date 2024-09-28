package me.ulrich.koth.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.ulrich.koth.Koth;
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
import me.ulrich.koth.interfaces.KothAPI;
import me.ulrich.koth.interfaces.ScoreboardAPI;

public class KothAPIManager implements KothAPI {

	public static KothAPIManager getInstance() {
		return Koth.getCore().getKothAPI();
	}
	
	@Override
	public String getTag() {
		return null;
	}
	
	@Override
	public boolean hasScoreboardImplemented() {
		return false;
	}
	
	@Override
	public void addScoreboardImplement(ScoreboardAPI impl) {}
	
	@Override
	public boolean startKothEvent(UUID kothUUID, Player sender) {
		return false;
	}
	
	@Override
	public boolean endKothEvent(String kothName) {
		return false;
	}
	
	@Override
	public boolean endKothEvent(UUID kothUUID) {
		return false;
	}
	
	@Override
	public boolean endKothEvent(UUID kothUUID, Player winner) {
		return false;
	}
	
	@Override
	public boolean hasKothStarted(String kothName) {
		return false;
	}
	
	@Override
	public boolean hasKothStarted(UUID kothUUID) {
		return false;
	}
	
	@Override
	public Optional<String> getKothName(UUID kothUUID) {
		return null;
	}
	
	@Override
	public Optional<UUID> getKothUUID(String kothName) {
		return null;
	}
	
	@Override
	public Optional<KothData> getKoth(UUID kothUUID) {
		return null;
	}

	@Override
	public List<Player> getAdminMode() {
		return null;
	}
	
	@Override
	public HashMap<UUID, IslandJoinLeaveData> getPlayerRegion() {
		return null;
	}
	
	@Override
	public HashMap<UUID, KothData> getKothData() {
		return null;
	}
	
	@Override
	public Set<UUID> getAllKothEvent(){
		return null;
	}
	
	@Override
	public String parseText(KothData koth, String text) {
		return null;
	}
	
	@Override
	public String parseText(UUID playerUUID, String text) {
		return null;
	}

	@Override
	public Optional<CubRegionLoc> getKoth(Location location) {
		return Optional.empty();
	}

	@Override
	public Optional<KothData> getKothByLocation(Location location) {
		return Optional.empty();
	}

	@Override
	public Optional<KothData> getKoth(String name) {
		return null;
	}

	@Override
	public boolean toggleStarterEnabled(boolean state) {
		return false;
	}

	@Override
	public boolean togglePlayerAdminMode(Player player) {
		return false;
	}

	@Override
	public boolean kothExists(UUID name) {
		return false;
	}

	@Override
	public Optional<KothData> createNewKoth(String name, Location loc1, Location loc2) {
		return Optional.empty();
	}

	@Override
	public boolean deleteKoth(UUID name) {
		return false;
	}

	@Override
	public boolean moveKoth(UUID name, Location loc1, Location loc2) {
		return false;
	}

	@Override
	public boolean teleportKoth(Player player, UUID uuid) {
		return false;
	}

	@Override
	public Optional<Location> getCoordKoth(UUID uuid) {
		return Optional.empty();
	}

	@Override
	public Optional<ItemStack> getWand() {
		return Optional.empty();
	}

	@Override
	public Optional<ItemStack> getKeyWand() {
		return Optional.empty();
	}

	@Override
	public Optional<ItemStack> getKothKey(KothData koth, int amount) {
		return Optional.empty();
	}

	@Override
	public Optional<ItemStack> getStarterItem(KothData koth, int amount) {
		return Optional.empty();
	}

	@Override
	public boolean clearWand() {
		return false;
	}

	@Override
	public boolean checkWand() {
		return false;
	}

	@Override
	public boolean changeIconKoth(UUID name, ItemStack hand) {
		return false;
	}

	@Override
	public HashMap<NextEventData, Long> getNextEvents(UUID kothUUID) {
		return null;
	}

	@Override
	public void stopAllEvents() {
		
	}

	@Override
	public void removeControler(UUID kothUUID) {
		
	}

	@Override
	public void applyPlayerWinner(UUID kothUUID, Player winner) {
		
	}

	@Override
	public List<Player> getAllRegionPlayers(UUID kothUUID) {
		return null;
	}

	@Override
	public List<String> getActiveEventList() {
		return null;
	}

	@Override
	public HashMap<NextEventData, Long> getAllEvents() {
		return null;
	}

	@Override
	public HashMap<NextEventData, Long> getNextEvents() {
		return null;
	}

	@Override
	public boolean hasKothOwner(UUID koth) {
		return false;
	}

	@Override
	public Optional<UUID> getKothOwner(UUID koth) {
		return Optional.empty();
	}

	@Override
	public List<KothData> getKothOwned(UUID playerUUID) {
		return null;
	}

	@Override
	public Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner) {
		return Optional.empty();
	}

	@Override
	public boolean saveKothLoots(Inventory inventory, KothData koth) {
		return false;
	}

	@Override
	public boolean addLootKoth(UUID name, ItemStack hand) {
		return false;
	}

	@Override
	public void saveLootsData(LootsData loot) {
		
	}

	@Override
	public void saveKothData(KothData clan) {
		
	}

	@Override
	public boolean isUseGUI() {
		return false;
	}

	@Override
	public List<KothData> getActiveEventListData(boolean system) {
		return null;
	}

	@Override
	public HashMap<UUID, LootsData> getLootsData() {
		return null;
	}

	@Override
	public Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner,
			Optional<String> mode) {
		
		return Optional.empty();
	}

	@Override
	public Optional<ModeData> getKothDefaultMode() {
		
		return Optional.empty();
	}

	@Override
	public Optional<String> getKothDefaultModeName() {
		
		return Optional.empty();
	}

	@Override
	public List<String> getPlaceholdersList(Optional<ModeData> mode) {
		
		return null;
	}

	@Override
	public boolean isDefaultMode(String name) {
		
		return false;
	}

	@Override
	public boolean isCurrentMode(UUID kothUUID, Optional<ModeData> mode) {
		
		return false;
	}

	@Override
	public boolean isDefaultMode(UUID kothUUID) {
		
		return false;
	}

	@Override
	public Optional<ModeData> getKothMode(UUID kothUUID) {
		
		return Optional.empty();
	}

	@Override
	public boolean isDefaultMode(Optional<ModeData> mode) {
		
		return false;
	}

	@Override
	public Optional<ModeData> registerMode(String name, Optional<Addon> addon, String icon, String desc) {
		
		return Optional.empty();
	}

	@Override
	public boolean unRegisterMode(String name) {
		
		return false;
	}

	@Override
	public boolean hasMode(String string) {
		
		return false;
	}

	@Override
	public Optional<ModeData> getMode(String string) {
		
		return Optional.empty();
	}

	@Override
	public Optional<String> getModeId(String string) {
		
		return Optional.empty();
	}

	@Override
	public HashMap<String, ModeData> getModes() {
		
		return null;
	}

	@Override
	public boolean hasKothEvent(UUID koth) {
		return false;
	}

	@Override
	public EventData getKothEvent(UUID koth) {
		return null;
	}

	@Override
	public KothStatus getKothStatus(UUID koth) {
		return null;
	}

	@Override
	public List<Player> getRegionPlayers(UUID kothUUID, CubLoc loc) {
		return null;
	}

	@Override
	public HashMap<String, GuiData> getInsertGui() {
		return null;
	}	


}
