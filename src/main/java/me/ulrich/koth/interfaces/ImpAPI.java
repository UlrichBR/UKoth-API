package me.ulrich.koth.interfaces;

import me.ulrich.koth.api.implementations.ClaimAPIImplement;
import me.ulrich.koth.api.implementations.GroupAPIImplement;
import me.ulrich.koth.api.implementations.HologramAPIImplement;
import me.ulrich.koth.api.implementations.MoneyAPIImplement;
import me.ulrich.koth.api.implementations.RegionAPIImplement;

public interface ImpAPI {

	ClaimAPIImplement getClaimAPI();
	HologramAPIImplement getHologramAPI();
	RegionAPIImplement getRegionAPI();
	GroupAPIImplement getGroupAPI();
	MoneyAPIImplement getMoneyAPI();
}
