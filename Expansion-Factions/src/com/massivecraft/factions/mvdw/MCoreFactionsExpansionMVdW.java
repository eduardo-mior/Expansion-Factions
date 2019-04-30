package com.massivecraft.factions.mvdw;

import com.massivecraft.factions.FactionsExpansion;
import com.massivecraft.factions.util.FactionsUtil;

import be.maximvdw.placeholderapi.PlaceholderAPI;
import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;
import be.maximvdw.placeholderapi.PlaceholderReplacer;

public class MCoreFactionsExpansionMVdW {
	
	public FactionsExpansion plugin;
	public FactionsUtil util;
	
	public MCoreFactionsExpansionMVdW(FactionsExpansion plugin, FactionsUtil util) {
		this.plugin = plugin;
		this.util = util;
	}
	
	public void register() {
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_name", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionName(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_tag", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionTag(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_ranking", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionRanking(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_members_count", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionMembersCount(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_members_online", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionMembersOnline(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_members_max", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionMembersMax(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_power_count", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionPowerCount(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_power_max", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionPowerMax(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_claims", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionClaims(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_kills", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionKills(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_deaths", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionDeaths(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_faction_kdr", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getFactionKdr(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_player_role", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getPlayerRole(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_player_power_count", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getPlayerPowerCount(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_player_power_max", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getPlayerPowerMax(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_player_deaths", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getPlayerDeaths(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_player_kills", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getPlayerKills(e.getPlayer());
			}
		});
		
		PlaceholderAPI.registerPlaceholder(plugin, "factions_player_kdr", new PlaceholderReplacer() {
			public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
				return util.getPlayerKdr(e.getPlayer());
			}
		});
	}

}