package com.massivecraft.factions.papi;

import org.bukkit.entity.Player;
import com.massivecraft.factions.FactionsExpansion;
import com.massivecraft.factions.util.FactionsUtil;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class MCoreFactionsExpansionPAPI extends PlaceholderExpansion {

	public FactionsExpansion plugin;
	public FactionsUtil util;
	
	public MCoreFactionsExpansionPAPI(FactionsExpansion plugin, FactionsUtil util) {
		this.plugin = plugin;
		this.util = util;
	}
	
	@Override
	public boolean canRegister() {
		return true;
	}

	@Override
	public String getAuthor() {
		return "rush";
	}

	@Override
	public String getIdentifier() {
		return "factions";
	}

	@Override
	public String getVersion() {
		return "2.13.6";
	}
	
	@Override
	public String onPlaceholderRequest(Player p, String identifier) {
		switch (identifier.hashCode())
		{
			case 1865091790:  return util.getFactionName(p);
			case -1048208649: return util.getFactionTag(p);
			case -1786138349: return util.getFactionRanking(p);
			case 1654034822:  return util.getFactionMembersCount(p);
			case 77825212:    return util.getFactionMembersOnline(p);
			case 1239717787:  return util.getFactionMembersMax(p);
			case 606852018:	  return util.getFactionPowerCount(p);
			case -1308855097: return util.getFactionPowerMax(p);
			case 1046735674:  return util.getFactionClaims(p);
			case 1980737778:  return util.getFactionKills(p);
			case 1068910594:  return util.getFactionDeaths(p);
			case -1048217194: return util.getFactionKdr(p);
			case 557073172:   return util.getPlayerRole(p);
			case 1410553079:  return util.getPlayerPowerCount(p);
			case 434996044:   return util.getPlayerPowerMax(p);
			case -1933946979: return util.getPlayerDeaths(p);
			case 82756087:    return util.getPlayerKills(p);
			case 2096173019:  return util.getPlayerKdr(p);
		}

		return null;
	}

}