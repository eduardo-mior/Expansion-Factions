package com.massivecraft.factions.util;

import org.bukkit.entity.Player;

import com.massivecraft.factions.entity.MPlayer;

public class FactionsUtil {

	public boolean hasFaction(Player p) {
		return MPlayer.get(p) == null ? false : MPlayer.get(p).hasFaction();
	}

	public String getFactionName(Player p) {
		return p == null || !this.hasFaction(p) ? "Sem Facção" : String.valueOf(MPlayer.get(p).getFactionName());
	}

	public String getFactionTag(Player p) {
		return p == null || !this.hasFaction(p) ? "Sem Facção" : String.valueOf(MPlayer.get(p).getFactionTag());
	}

	public String getFactionRanking(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getTopPosition());
	}

	public String getFactionMembersCount(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getMembersCount());
	}

	public String getFactionMembersOnline(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getOnlinePlayers().size());
	}

	public String getFactionMembersMax(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getMembersLimit());
	}

	public String getFactionPowerCount(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getPowerRounded());
	}

	public String getFactionPowerMax(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getPowerMaxRounded());
	}

	public String getFactionClaims(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getLandCount());
	}

	public String getFactionKills(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getKills());
	}

	public String getFactionDeaths(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getDeaths());
	}

	public String getFactionKdr(Player p) {
		return p == null || !this.hasFaction(p) ? "0" : String.valueOf(MPlayer.get(p).getFaction().getKdrRounded());
	}

	public String getPlayerRole(Player p) {
		return p == null || !this.hasFaction(p) ? "" : String.valueOf(MPlayer.get(p).getRole().getPrefix());
	}

	public String getPlayerPowerCount(Player p) {
		return p == null || MPlayer.get(p) == null ? "0" : String.valueOf(MPlayer.get(p).getPowerRounded());
	}

	public String getPlayerPowerMax(Player p) {
		return p == null || MPlayer.get(p) == null ? "0" : String.valueOf(MPlayer.get(p).getPowerMaxRounded());
	}

	public String getPlayerKills(Player p) {
		return p == null || MPlayer.get(p) == null ? "0" : String.valueOf(MPlayer.get(p).getKills());
	}

	public String getPlayerDeaths(Player p) {
		return p == null || MPlayer.get(p) == null ? "0" : String.valueOf(MPlayer.get(p).getDeaths());
	}

	public String getPlayerKdr(Player p) {
		return p == null || MPlayer.get(p) == null ? "0" : String.valueOf(MPlayer.get(p).getKdrRounded());
	}
	
}