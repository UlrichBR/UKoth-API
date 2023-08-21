package me.ulrich.koth.data;

public class KothEnum {

	public enum KothLangs{
		EN, ES, RU;
	}
	
	public enum KothSchedulerError{
		MINPLAYER;
	}
	
	public enum CmdType{
		REWARD, CAPTURE, START, END;
	}
	
	public enum KothExtensions {
		BetterTeams, 
		CMI,
		DecentHolograms, 
		FactionsUUID, 
		Holograms, 
		HolographicDisplays, 
		SimpleClans, 
		TAB, 
		UltimateClans, 
		UltimateClansLite,
		IridiumSkyblock,
		MedievalFactions,
		AnimatedScoreboard,
		SuperiorSkyblock2,
		Lands,
		SternalBoard,
		GangsPlus,
		FeatherBoard,
		KingdomsX,
		TownyAdvanced,
		BSkyblock,
		KingdomCraft;
	}
	
	public enum ExtensionsReturn {
		ERROR_REPO, ALREADY_UPDATED, ERROR_DOWNLOAD, SUCCESS_DOWNLOAD, ALREADY_EXISTS, NEED_RELOAD_ADDONS, GENERAL_ERROR
		
		
	}
	
	public enum MsgUsage{
		help, usage, error, success;
	}
	
	public enum ChatDataType {
		ADDKOTHCOMMAND, 
		COMMANDUNKNOWNPLAYER, 
		COMMANDUNKNOWNADMIN, 
		SENDKOTHINSIDEENTER, 
		SENDKOTHOUTSIDEENTER, 
		SENDKOTHCAPTURE, 
		SENDKOTHCAPTUREALL, 
		SENDKOTHSTART, 
		SENDKOTHENDWINNER, 
		SENDKOTHENDNOWIN, 
		ADDKOTHSTATS, 
		SENDKOTHCREATE;
	}
	
	public enum ProximityType{
		BLOCKS, WORLD, DISABLED, ALLWORLDS;
	}

	
	public enum HoloPreference{
		ANY, CMI, HOLOGRAPHICDISPLAYS, HOLOGRAMS, DECENTHOLOGRAMS;
	}
	
	public enum GroupPreference{
		ANY, ULTIMATECLANS;
	}
	
	public enum ScoreboardPreference{
		ANY, TAB;
	}
	
	public enum MoneyType{
		VAULT, PLAYERPOINTS, CLANSOULS, TOKENENCHANT, DISABLED, CLANBANK;
	}
	
	public enum KothStatus{
		STOPPED, ENABLED;
	}
	
	public enum MovementWay {
		MOVE, TELEPORT, SPAWN, DISCONNECT, CHANGEWORLD, CHANGEREGION;
	}
	
	public enum WarpInfo {
		WORLD, X, Y, Z;
	}
	
	public enum GeneralSettingsType{
		ALLOWWITHOUTGROUP, ALLOWPLAYERWARP, VISIBLETOPLAYERS, STOPTIMEINDISPUTE;
	}
	
	public enum CubLoc {
		DENTRO, FORA;
	}
	
	public enum EventFrequency{
		DAILY, WEEKLY, MONTHLY;
	}
	
	public enum SchedulerFlag{
		MINPLAYERS;
	}
	
	public enum EndAction{
		END, CREATEBORDER;
	}
	
	public enum BorderColors{
		RED, GREEN, BLUE;
	}
	
	public enum LootType{
		KEY, DROP, INV, DISABLED;
	}
	
	public enum TopType{
		TOPPLAYER, TOPGROUP;
	}
	
	public enum TopFind{
		NAME, AMOUNT;
	}
	
	public enum TopTime{
		ALL, DAILY, WEEKLY, MONTHLY, YEARLY,
	}
	
}
