package me.ulrich.koth.data;

import java.util.List;

import org.bukkit.entity.Player;

import net.kyori.adventure.bossbar.BossBar;

public class BossBarData {

	private List<Player> sender;
	private BossBar bossbar;

	public BossBarData(List<Player> sender, BossBar bossBar) {
		this.setSender(sender);
		this.setBossbar(bossBar);
	}




	public List<Player> getSender() {
		return sender;
	}



	public void setSender(List<Player> sender) {
		this.sender = sender;
	}



	public BossBar getBossbar() {
		return bossbar;
	}



	public void setBossbar(BossBar bossbar) {
		this.bossbar = bossbar;
	}
}
