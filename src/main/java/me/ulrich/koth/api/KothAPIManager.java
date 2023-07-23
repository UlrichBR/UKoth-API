package me.ulrich.koth.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.koth.Koth;
import me.ulrich.koth.data.CubRegionLoc;
import me.ulrich.koth.data.IslandJoinLeaveData;
import me.ulrich.koth.data.KothData;
import me.ulrich.koth.data.NextEventData;
import me.ulrich.koth.interfaces.GroupAPI;
import me.ulrich.koth.interfaces.HologramAPI;
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
	public boolean hasHoloImplemented() {
		return false;
	}
	
	@Override
	public void addHoloImplement(HologramAPI impl) {}
	
	@Override
	public boolean hasGroupImplemented() {
		return false;
	}
	
	@Override
	public void addGroupImplement(GroupAPI impl) {}
	
	@Override
	public boolean hasScoreboardImplemented() {
		return false;
	}
	
	@Override
	public void addScoreboardImplement(ScoreboardAPI impl) {}
	
	@Override
	public boolean startKothEvent(String kothName) {
		return false;
	}
	
	@Override
	public boolean startKothEvent(UUID kothUUID) {
		return false;
	}
	
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
	public String getKothName(UUID kothUUID) {
		return null;
	}
	
	@Override
	public UUID getKothUUID(String kothName) {
		return null;
	}
	
	@Override
	public KothData getKoth(UUID kothUUID) {
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
	public KothData getKoth(String name) {
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
	public void findNewControler(UUID kothUUID) {
		
	}

	@Override
	public void setNewControler(UUID kothUUID, Player player) {
		
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
	public void findNewControler(UUID kothUUID, Player player, boolean sameGroup) {
		
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


}
