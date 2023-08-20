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
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ArmorMeta;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.CompassMeta;
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
//        block.getType().equals(Material.DIAMOND_BLOCK);

//        Bukkit.getWorld("world").getChunkAt(1,1,1);

//        ItemStack itemStack = new ItemStack(Material.BOOK);
//        BookMeta bookMeta = (BookMeta) itemStack.getItemMeta();
//        bookMeta.addPage();

//        ItemStack itemStack = new ItemStack(Material.COMPASS);
//        CompassMeta compassMeta = (CompassMeta) itemStack.getItemMeta();
//        compassMeta.getLodestone();

        Bukkit.getPluginManager().registerEvents(this, this);



        getCommand("permission").setExecutor(new PermissionCommand());

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));


    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta pickAxeMeta = (ItemMeta) pickaxe.getItemMeta();
        pickAxeMeta.addEnchant(Enchantment.LUCK,4,true);
        pickaxe.setItemMeta(pickAxeMeta);

        event.getPlayer().getInventory().addItem(pickaxe);

        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta swordItemMeta =(ItemMeta) sword.getItemMeta();
        swordItemMeta.addEnchant(Enchantment.MENDING,4 ,true);
        sword.setItemMeta(swordItemMeta);

        event.getPlayer().getInventory().addItem(sword);

    }




//    @EventHandler
//    public void onEntitySpawn(CreatureSpawnEvent e){
//    public void onEntitySpawn(EntityDeathEvent e){
//        e.getDroppedExp();
//    public void onEntitySpawn(EntityDamageEvent e) {
//        e.getDamage();
//    }


}
