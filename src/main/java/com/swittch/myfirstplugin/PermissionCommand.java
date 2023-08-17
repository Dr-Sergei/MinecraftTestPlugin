package com.swittch.myfirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PermissionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.hasPermission("permissionplugin.use")) {
                player.sendMessage(ChatColor.GREEN + "You have permission to use it");
            } else {
                player.sendMessage((ChatColor.RED +"You dont have a permission!"));
            }
        }

        return false;
    }
}
