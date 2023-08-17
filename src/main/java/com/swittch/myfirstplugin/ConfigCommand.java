package com.swittch.myfirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConfigCommand implements CommandExecutor {

    private Main main;


    public ConfigCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.sendMessage(ChatColor.YELLOW + main.getConfig().getString("Word"));
            player.sendMessage(main.getConfig().getInt("Number") + " " + ChatColor.DARK_RED);
            if(main.getConfig().getBoolean("Boolean")){
                player.sendMessage(ChatColor.DARK_AQUA +"Timo Yo Mann");
            }
            for(String value: main.getConfig().getStringList("String-list")){
                player.sendMessage(ChatColor.DARK_PURPLE + value);
            }

        }


        return false;
    }
}
