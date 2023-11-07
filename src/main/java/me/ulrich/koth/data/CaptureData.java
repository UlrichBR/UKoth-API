package me.ulrich.koth.data;

import net.kyori.adventure.bossbar.BossBar;

public class CaptureData {
	
	private BossBar bossbar;

	public CaptureData(BossBar bossbar) {
		this.setBossbar(bossbar);
	}

	public BossBar getBossbar() {
		return bossbar;
	}

	public void setBossbar(BossBar bossbar) {
		this.bossbar = bossbar;
	}

}
