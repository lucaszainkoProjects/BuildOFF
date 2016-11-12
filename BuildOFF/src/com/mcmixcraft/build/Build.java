package com.mcmixcraft.build;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Build implements CommandExecutor, Listener {

	public static ArrayList<Player> Build = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		
		Player p = (Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("construir")) {
			
			if(p.isOp()) {
			
			if(args.length == 0) {
				
				p.sendMessage("§cUse /construir [ON/OFF]");
				
			} else {
				
				if(args[0].equals("on")) {
					Build.add(p);
					p.sendMessage("§aModo Construir Ativado.");
				}
				
				if(args[0].equals("off")) {
					Build.remove(p);
					p.sendMessage("§cModo Construir Desativado.");
				}
				if(args[0].equals("OFF")) {
					Build.remove(p);
					p.sendMessage("§cModo Construir Desativado.");
				}
				if(args[0].equals("ON")) {
					Build.add(p);
					p.sendMessage("§aModo Construir Ativado");
				}
				
				
			}
			}
			
		}
		
		return false;
	}

	
	
}