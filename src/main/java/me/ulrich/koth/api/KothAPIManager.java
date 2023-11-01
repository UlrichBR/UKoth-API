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
import me.ulrich.koth.data.IslandJoinLeaveData;
import me.ulrich.koth.data.KothData;
import me.ulrich.koth.data.LootsData;
import me.ulrich.koth.data.ModeData;
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
	public boolean isUseGUI() {
		return Koth.getCore().isUseGUI();
	}
	
	@Override
	public String getTag() {
		return (Koth.getCore().getTag());
	}
	
	@Override
	public boolean hasGroupImplemented() {
		return (Koth.getCore().getGroupManager().hasGroupAPIEnabled());
	}
	
	@Override
	public void addGroupImplement(GroupAPI impl) {
		Koth.getCore().getGroupManager().setGroupAPI(impl);
	}
	
	@Override
	public boolean hasHoloImplemented() {
		return Koth.getCore().getHologramManager().isHoloEnabled();
	}
	
	@Override
	public void addHoloImplement(HologramAPI impl) {
		Koth.getCore().getHologramManager().setHoloAPI(impl);
	}
	
	@Override
	public boolean hasScoreboardImplemented() {
		return Koth.getCore().getScoreboardManager().hasScoreboardAPIEnabled();
	}
	
	@Override
	public void addScoreboardImplement(ScoreboardAPI impl) {
		Koth.getCore().getScoreboardManager().setScoreboardAPi(impl);
	}
	
	@Override
	public boolean startKothEvent(UUID kothUUID, Player sender) {
		return Koth.getCore().getEventManager().startKothEvent(kothUUID, sender);
	}
	
	@Override
	public boolean endKothEvent(String kothName) {
		return Koth.getCore().getEventManager().endKothEvent(kothName);
	}
	
	@Override
	public boolean endKothEvent(UUID kothUUID) {
		return Koth.getCore().getEventManager().endKothEvent(kothUUID);
	}
	
	@Override
	public boolean endKothEvent(UUID kothUUID, Player winner) {
		return Koth.getCore().getEventManager().endKothEvent(kothUUID, winner);
	}
	
	@Override
	public boolean hasKothStarted(String kothName) {
		return Koth.getCore().getEventManager().hasKothStarted(kothName);
	}
	
	@Override
	public boolean hasKothStarted(UUID kothUUID) {
		return Koth.getCore().getEventManager().hasKothStarted(kothUUID);
	}

	@Override
	public Optional<String> getKothName(UUID kothUUID) {
		return Koth.getCore().getKothManager().getKothName(kothUUID);
	}
	
	@Override
	public Optional<UUID> getKothUUID(String kothName) {
		return Koth.getCore().getKothManager().getKothUUID(kothName);
	}
	
	@Override
	public Optional<KothData> getKoth(UUID kothUUID) {
		return Koth.getCore().getKothManager().getKoth(kothUUID);
	}
	@Override
	public Optional<KothData> getKoth(String name) {
		return Koth.getCore().getKothManager().getKoth(name);
	}
	
	@Override
	public Optional<CubRegionLoc> getKoth(Location location) {
		return Koth.getCore().getKothManager().getKoth(location);
	}
	
	@Override
	public Optional<KothData> getKothByLocation(Location location) {
		return Koth.getCore().getKothManager().getKothByLocation(location);
	}
	
	@Override
	public List<Player> getAdminMode() {
		return Koth.getCore().getKothManager().getAdminMode();
	}
	
	@Override
	public HashMap<UUID, IslandJoinLeaveData> getPlayerRegion() {
		return Koth.getCore().getKothManager().getPlayerRegion();
	}
	
	@Override
	public HashMap<UUID, KothData> getKothData() {
		return Koth.getCore().getKothManager().getKothData();
	}
	
	@Override
	public Set<UUID> getAllKothEvent(){
		return Koth.getCore().getKothManager().getKothData().keySet();
	}
	
	@Override
	public String parseText(KothData koth, String text) {
		return Koth.getCore().getKothPlaceholderManager().parseText(koth, text);
	}
	
	@Override
	public String parseText(UUID playerUUID, String text) {
		return Koth.getCore().getKothPlaceholderManager().parseText(playerUUID, text);
	}
	@Override
	public boolean toggleStarterEnabled(boolean state) {
		return Koth.getCore().getKothManager().toggleStarterEnabled(state);
	}
	@Override
	public boolean togglePlayerAdminMode(Player player) {
		return Koth.getCore().getKothManager().togglePlayerAdminMode(player);
	}
	
	@Override
	public boolean kothExists(UUID name) {
		return Koth.getCore().getKothManager().kothExists(name);
	}
	
	@Override
	public Optional<KothData> createNewKoth(String name, Location loc1, Location loc2) {
		return Koth.getCore().getKothManager().createNewKoth(name, loc1, loc2);
	}
	
	@Override
	public Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner) {
		return Koth.getCore().getKothManager().createNewKoth(name, loc1, loc2, owner);
	}
	
	@Override
	public Optional<KothData> createNewKoth(String name, Location loc1, Location loc2, UUID owner, Optional<String> mode) {
		return Koth.getCore().getKothManager().createNewKoth(name, loc1, loc2, owner, mode);
	}
	
	@Override
	public boolean deleteKoth(UUID name) {
		return Koth.getCore().getKothManager().deleteKoth(name);
	}
	@Override
	public boolean moveKoth(UUID name, Location loc1, Location loc2) {
		return Koth.getCore().getKothManager().moveKoth(name, loc1, loc2);
	}
	
	@Override
	public boolean hasKothOwner(UUID koth) {
		return Koth.getCore().getKothManager().hasKothOwner(koth);
	}
	
	@Override
	public Optional<UUID> getKothOwner(UUID koth) {
		return Koth.getCore().getKothManager().getKothOwner(koth);
	}
	
	@Override
	public List<KothData> getKothOwned(UUID playerUUID){
		return Koth.getCore().getKothManager().getKothOwned(playerUUID);
	}
	
	@Override
	public boolean teleportKoth(Player player, UUID uuid) {
		return Koth.getCore().getKothManager().teleportKoth(player, uuid);
	}
	@Override
	public Optional<Location> getCoordKoth(UUID uuid) {
		return Koth.getCore().getKothManager().getCoordKoth(uuid);
	}
	@Override
	public Optional<ItemStack> getWand() {
		return Koth.getCore().getKothManager().getWand();
	}
	@Override
	public Optional<ItemStack> getKeyWand() {
		return Koth.getCore().getKothManager().getKeyWand();
	}
	@Override
	public Optional<ItemStack> getKothKey(KothData koth, int amount) {
		return Koth.getCore().getKothManager().getKothKey(koth, amount);
	}
	@Override
	public Optional<ItemStack> getStarterItem(KothData koth, int amount) {
		return Koth.getCore().getKothManager().getStarterItem(koth, amount);
	}
	@Override
	public boolean clearWand() {
		return Koth.getCore().getKothManager().clearWand();
	}
	@Override
	public boolean checkWand() {
		return Koth.getCore().getKothManager().checkWand();
	}
	
	@Override
	public boolean changeIconKoth(UUID name, ItemStack hand) {
		return Koth.getCore().getKothManager().changeIconKoth(name, hand);
	}
	@Override
	public void stopAllEvents() {
		Koth.getCore().getEventManager().stopAllEvents();
	}
	@Override
	public void removeControler(UUID kothUUID) {
		Koth.getCore().getEventManager().removeControler(kothUUID);
	}

	@Override
	public void applyPlayerWinner(UUID kothUUID, Player winner) {
		Koth.getCore().getEventManager().applyPlayerWinner(kothUUID, winner);
	}
	@Override
	public List<Player> getAllRegionPlayers(UUID kothUUID){
		return Koth.getCore().getEventManager().getAllRegionPlayers(kothUUID);
	}
	@Override
	public List<String> getActiveEventList() {
		return Koth.getCore().getEventManager().getActiveEventList();
	}
	
	@Override
	public List<KothData> getActiveEventListData(boolean system) {
		return Koth.getCore().getEventManager().getActiveEventListData(system);
	}
	
	@Override
	public HashMap<NextEventData, Long> getAllEvents() {
		return Koth.getCore().getEventManager().getAllEvents();
	}
	@Override
	public HashMap<NextEventData, Long> getNextEvents() {
		return Koth.getCore().getEventManager().getNextEvents();
	}
	@Override
	public HashMap<NextEventData, Long> getNextEvents(UUID kothUUID) {
		return Koth.getCore().getEventManager().getNextEvents(kothUUID);
	}
	@Override
	public void saveKothData(KothData clan) {
		Koth.getCore().getKothManager().saveKothData(clan);
	}
	
	@Override
	public boolean saveKothLoots(Inventory inventory, KothData koth) {
		return Koth.getCore().getLootsManager().saveKothLoots(inventory, koth);
	}
	@Override
	public boolean addLootKoth(UUID name, ItemStack hand) {
		return Koth.getCore().getLootsManager().addLootKoth(name, hand);
	}
	@Override
	public void saveLootsData(LootsData loot) {
		Koth.getCore().getLootsManager().saveLootsData(loot);
	}
	
	@Override
	public HashMap<UUID, LootsData> getLootsData() {
		return Koth.getCore().getLootsManager().getLootsData();
	}
	@Override
	public Optional<ModeData> getKothDefaultMode(){
		return Koth.getCore().getModeManager().getKothDefaultMode();
	}
	@Override
	public Optional<String> getKothDefaultModeName(){
		return Koth.getCore().getModeManager().getKothDefaultModeName();
	}
	@Override
	public List<String> getPlaceholdersList(Optional<ModeData> mode){
		return Koth.getCore().getModeManager().getPlaceholdersList(mode);
	}
	@Override
	public boolean isDefaultMode(String name) {
		return Koth.getCore().getModeManager().isDefaultMode(name);
	}
	@Override
	public boolean isCurrentMode(UUID kothUUID, Optional<ModeData> mode) {
		return Koth.getCore().getModeManager().isCurrentMode(kothUUID, mode);
	}
	@Override
	public boolean isDefaultMode(UUID kothUUID) {
		return Koth.getCore().getModeManager().isDefaultMode(kothUUID);
	}
	@Override
	public Optional<ModeData> getKothMode(UUID kothUUID) {
		return Koth.getCore().getModeManager().getKothMode(kothUUID);
	}
	@Override
	public boolean isDefaultMode(Optional<ModeData> mode) {
		return Koth.getCore().getModeManager().isDefaultMode(mode);
	}
	@Override
	public Optional<ModeData> registerMode(String name, Optional<Addon> addon,String icon,String desc){
		return Koth.getCore().getModeManager().registerMode(name, addon, icon, desc);
	}
	@Override
	public boolean unRegisterMode(String name){
		return Koth.getCore().getModeManager().unRegisterMode(name);
	}
	@Override
	public boolean hasMode(String string) {
		return Koth.getCore().getModeManager().hasMode(string);
	}
	@Override
	public Optional<ModeData> getMode(String string) {
		return Koth.getCore().getModeManager().getMode(string);
	}
	@Override
	public Optional<String> getModeId(String string) {
		return Koth.getCore().getModeManager().getModeId(string);
	}
	@Override
	public HashMap<String, ModeData> getModes() {
		return Koth.getCore().getModeManager().getModes();
	}
	
}
