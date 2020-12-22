package com.maxx.testplugin;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;


public class spawnzombie implements CommandExecutor  {



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("armortemplate.t")) {
            Entity evilzombie = player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
            evilzombie.setCustomName("God Zombie");
            evilzombie.setCustomNameVisible(true);
            evilzombie.setGlowing(true);
            evilzombie.setSilent(true);
        }
        return false;

    }

}
