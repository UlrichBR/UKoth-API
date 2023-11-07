package me.ulrich.koth.api;

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
import me.ulrich.koth.interfaces.CommandAPI;

import me.ulrich.koth.interfaces.KothCommand;

public class CommandAPIManager implements CommandAPI {

	@Override
	public void showHelpSubmessage(CommandSender sender, CommandData commander) {
		
	}

	@Override
	public HashMap<String, CommandData> getKothCommander() {
		return null;
	}

	@Override
	public HashMap<String, CommandData> getUKothCommander() {
		return null;
	}

	@Override
	public void unRegisterCommand(String command) {
		
	}

	@Override
	public void insertCommand(String command, String permission, String alias, double value, int cooldown,
			CommandData_show data, CommandData_title title, CommandData_actionbar actionbar, CommandData_sound sound,
			HashMap<String, CommandData_show> subcommands, CommandData_disable disable) {
		
	}

	@Override
	public void registerCommand(String alias, KothCommand command) {
		
	}

	@Override
	public void sendCommandJson(CommandSender player, CommandData comander, MsgUsage key, List<String> data) {		// TODO -generated method stub
		
	}

	@Override
	public void sendSubCommandJson(CommandSender player, CommandData comander, String sub, MsgUsage key,
			List<String> data) {
		
	}

}
