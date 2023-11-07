package me.ulrich.koth.data;

import me.ulrich.koth.data.KothEnum.CubLoc;

public class CubRegionLoc {

	private CubLoc loc;
	private KothData koth;

	public CubRegionLoc(CubLoc loc, KothData koth) {
		this.setLoc(loc);
		this.setKoth(koth);
	}

	public CubLoc getLoc() {
		return loc;
	}

	public void setLoc(CubLoc loc) {
		this.loc = loc;
	}

	public KothData getKoth() {
		return koth;
	}

	public void setKoth(KothData koth) {
		this.koth = koth;
	}
}
