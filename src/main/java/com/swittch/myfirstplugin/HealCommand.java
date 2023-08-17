package com.swittch.myfirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GOLD + "Paul! Gucke. alle Herzen wurden wieder aufgefüllt!");
            player.setHealth(19.5);


        } else {

        }

        return false;
    }
}
