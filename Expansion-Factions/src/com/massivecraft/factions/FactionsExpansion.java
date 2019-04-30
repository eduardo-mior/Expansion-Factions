package com.massivecraft.factions;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.massivecraft.factions.mvdw.MCoreFactionsExpansionMVdW;
import com.massivecraft.factions.papi.MCoreFactionsExpansionPAPI;
import com.massivecraft.factions.util.FactionsUtil;

public class FactionsExpansion extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		FactionsExpansion plugin = this;
		FactionsUtil util = new FactionsUtil();
		
		if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
			new MCoreFactionsExpansionPAPI(plugin, util).register();
		}
		
		if (Bukkit.getPluginManager().getPlugin("MVdWPlaceholderAPI") != null) {
			new MCoreFactionsExpansionMVdW(plugin, util).register();
		}
	}

}