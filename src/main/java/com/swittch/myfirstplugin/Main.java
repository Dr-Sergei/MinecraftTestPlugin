package com.swittch.myfirstplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

//        Entity entity= Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 390, 72, -284), EntityType.POLAR_BEAR);
//        EnderDragon stand = (EnderDragon) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 390, 72, -284), EntityType.ENDER_DRAGON);
//
//        ItemStack itemStack = new ItemStack(Material.DIAMOND_AXE, 2);
//        ItemMeta meta = itemStack.getItemMeta();
//        itemStack.setItemMeta(meta);
//
//        Block block = Bukkit.getWorld("world").getBlockAt(348,78,-181);
//        block.getType().equals(Material.DIAMOND_SWORD);




        getCommand("permission").setExecutor(new PermissionCommand());

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));


    }

//    @EventHandler
//    public void onEntitySpawn(CreatureSpawnEvent e){
//    public void onEntitySpawn(EntityDeathEvent e){
//        e.getDroppedExp();
//    public void onEntitySpawn(EntityDamageEvent e) {
//        e.getDamage();
//    }


}
