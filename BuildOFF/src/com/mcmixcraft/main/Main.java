package com.mcmixcraft.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.mcmixcraft.build.Build;
import com.mcmixcraft.build.BuildEvent;

public class Main extends JavaPlugin {

	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new BuildEvent(), this);
		getCommand("construir").setExecutor(new Build());
		
	}
	
}
