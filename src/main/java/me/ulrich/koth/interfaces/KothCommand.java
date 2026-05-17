package me.ulrich.koth.interfaces;

import java.util.EnumMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.ulrich.koth.Koth;
import me.ulrich.koth.data.Flag;

public interface KothCommand {

    boolean execute(final Koth plugin, final CommandSender sender, final Command command, final String label, String[] args, EnumMap<Flag, String> info);

}
