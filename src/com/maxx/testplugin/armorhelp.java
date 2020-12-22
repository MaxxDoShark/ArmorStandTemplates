package com.maxx.testplugin;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class armorhelp implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("/armor: Spawn Armor Stand " + "\n /armor1: Spawn Leather Armor Stand \n /armor2: Spawn a iron Armor Stand \n /armor3: Spawn a gold Armor Stand \n /armor4: Spawn a diamond Armor Stand. \n /armor5: Spawn a sitting armor stand");

        return false;
    }
}