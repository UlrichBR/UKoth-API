package me.ulrich.koth.data;

import java.util.HashMap;

public class CommandData {

	private String id;
	private String permission;
	private String alias;
	private int cooldown;
	private CommandData_show show;
	private CommandData_title title;
	private CommandData_actionbar actionbar;
	private double value;
	private HashMap<String, CommandData_show> subcommands;

	public CommandData(String id, String permission, String alias, double value, int cooldown, CommandData_show show, CommandData_title title, CommandData_actionbar actionbar, HashMap<String, CommandData_show> subcommands2) {
		this.setId(id);
		this.setPermission(permission);
		this.setAlias(alias);
		this.setValue(value);
		this.setCooldown(cooldown);
		this.setShow(show);
		this.setTitle(title);
		this.setActionbar(actionbar);
		this.setSubcommands(subcommands2);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	public CommandData_show getShow() {
		return show;
	}

	public void setShow(CommandData_show show) {
		this.show = show;
	}
	
	public CommandData_title getTitle() {
		return title;
	}

	public void setTitle(CommandData_title title) {
		this.title = title;
	}

	public CommandData_actionbar getActionbar() {
		return actionbar;
	}

	public void setActionbar(CommandData_actionbar actionbar) {
		this.actionbar = actionbar;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public HashMap<String, CommandData_show> getSubcommands() {
		return subcommands;
	}

	public void setSubcommands(HashMap<String, CommandData_show> subcommands) {
		this.subcommands = subcommands;
	}
}
