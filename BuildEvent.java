package com.mcmixcraft.build;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BuildEvent implements Listener{

	@EventHandler
	public void Break(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if(Build.Build.contains(p)) {
			
			
		} else {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void Place(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(Build.Build.contains(p)) {
			
			
		} else {
			e.setCancelled(true);
			
		}
	}
}