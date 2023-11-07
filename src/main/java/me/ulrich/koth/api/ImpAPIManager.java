package me.ulrich.koth.api;

import me.ulrich.koth.api.implementations.ClaimAPIImplement;
import me.ulrich.koth.api.implementations.GroupAPIImplement;
import me.ulrich.koth.api.implementations.HologramAPIImplement;
import me.ulrich.koth.api.implementations.MoneyAPIImplement;
import me.ulrich.koth.api.implementations.RegionAPIImplement;
import me.ulrich.koth.interfaces.ImpAPI;

public class ImpAPIManager implements ImpAPI{

	@Override
	public ClaimAPIImplement getClaimAPI() {
		return null;
	}

	@Override
	public HologramAPIImplement getHologramAPI() {
		return null;
	}

	@Override
	public RegionAPIImplement getRegionAPI() {
		return null;
	}

	@Override
	public GroupAPIImplement getGroupAPI() {
		return null;
	}

	@Override
	public MoneyAPIImplement getMoneyAPI() {
		return null;
	}


	
}
