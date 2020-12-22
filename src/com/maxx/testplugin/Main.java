package com.maxx.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.Listener;

import org.bukkit.plugin.java.JavaPlugin;




public class Main extends JavaPlugin  implements Listener {

    @Override
    public void onEnable() {


        System.out.println("TEST PLUGIN ENABLED!");


        Bukkit.getPluginManager().registerEvents(this, this);

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("number").setExecutor(new NumberCommand());
        getCommand("t").setExecutor(new TimeCommand());
        getCommand("armor").setExecutor(new spawnstand());
        getCommand("sz").setExecutor(new spawnzombie());
        getCommand("armor1").setExecutor(new template1());
        getCommand("armor2").setExecutor(new template2());
        getCommand("armor3").setExecutor(new template3());
        getCommand("armor4").setExecutor(new template4());
        getCommand("armorhelp").setExecutor(new armorhelp());
        getCommand("armor5").setExecutor(new template5());
        getCommand("armor6").setExecutor(new template6());
        getCommand("armor7").setExecutor(new template7());
        getCommand("armor8").setExecutor(new template8());
        getCommand("armor9").setExecutor(new template9());

    }

    @Override
    public void onDisable() {
        System.out.println("TEST PLUGIN DISABLED!");
    }

}

//0f, 45f, 0f



    /* @EventHandler
    //public void onThrow(PlayerEggThrowEvent e) {

        //Player player = e.getPlayer();

       /player.sendMessage(ChatColor.RED + "Egg thrown!");

    }

     */


