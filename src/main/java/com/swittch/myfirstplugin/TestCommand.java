package com.swittch.myfirstplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage("Paul, ich bin da! In console!");
        } else {
            System.out.println(" Hello you have messaged a console!");
        }


        return false;
    }
}
