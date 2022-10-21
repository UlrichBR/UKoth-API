package me.ulrich.koth.data;

public class KothEnum {

	public enum KothLangs{
		EN;
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
		SENDKOTHSTART, 
		SENDKOTHENDWINNER, 
		SENDKOTHENDNOWIN, 
		ADDKOTHSTATS, 
		SENDKOTHCREATE;
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
		VAULT, PLAYERPOINTS, CLANSOULS, TOKENENCHANT, DISABLED;
	}
	
	public enum KothStatus{
		STOPED, ENABLED;
	}
	
	public enum MovementWay {
		MOVE, TELEPORT, SPAWN, DISCONNECT, CHANGEWORLD, CHANGEREGION;
	}
	
	public enum CubLoc {
		DENTRO, FORA;
	}
	
	public enum EventFrequency{
		DAILY, WEEKLY, MONTHLY;
	}
	
	public enum EndAction{
		END, CREATEBORDER;
	}
	
	public enum BorderColors{
		RED, GREEN, BLUE;
	}
	
	public enum LootType{
		KEY, DROP, INV;
	}
	
	public enum TopType{
		TOPPLAYER, TOPGROUP;
	}
	
	public enum TopTime{
		ALL, DAILY, WEEKLY, MONTHLY, YEARLY,
	}
	
}
