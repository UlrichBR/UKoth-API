package me.ulrich.koth.interfaces;

import java.util.HashMap;
import java.util.List;

import org.bukkit.command.CommandSender;

import me.ulrich.koth.data.CommandData;
import me.ulrich.koth.data.CommandData_actionbar;
import me.ulrich.koth.data.CommandData_disable;
import me.ulrich.koth.data.CommandData_show;
import me.ulrich.koth.data.CommandData_sound;
import me.ulrich.koth.data.CommandData_title;
import me.ulrich.koth.data.KothEnum.MsgUsage;

public interface CommandAPI {

	void showHelpSubmessage(CommandSender sender, CommandData commander);
	
	HashMap<String, CommandData> getKothCommander();

	HashMap<String, CommandData> getUKothCommander();
	
	void unRegisterCommand(String command);

	void insertCommand(String command, String permission, String alias, double value, int cooldown, CommandData_show data,CommandData_title title, CommandData_actionbar actionbar, CommandData_sound sound, HashMap<String, CommandData_show> subcommands, CommandData_disable disable);

	void registerCommand(String alias, KothCommand command);

	void sendCommandJson(CommandSender player, CommandData comander, MsgUsage key, List<String> data);

	void sendSubCommandJson(CommandSender player, CommandData comander, String sub, MsgUsage key, List<String> data);
	
}
