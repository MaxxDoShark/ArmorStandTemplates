package com.maxx.testplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class template3 implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

            Player player = (Player) sender;

            if (player.hasPermission("armortemplate.template")) {


                ArmorStand stand = (ArmorStand) player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
                stand.setVisible(true);
                stand.setArms(true);
                stand.setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
                stand.setBoots(new ItemStack(Material.GOLD_BOOTS));
                stand.setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                stand.setItemInHand(new ItemStack(Material.GOLD_SWORD));

                stand.setCustomName("Gold Armor Stand");
                stand.setCustomNameVisible(true);
                stand.setGravity(false);
                player.sendMessage("ArmorStand spawned! UUID=" + stand.getUniqueId());
            }
            return false;

        }
    }




