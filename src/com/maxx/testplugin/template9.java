package com.maxx.testplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;

public class template9 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("armortemplate.template")) {


            ArmorStand stand = (ArmorStand) player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            stand.setVisible(true);
            stand.setArms(true);
            stand.setLeftArmPose(new EulerAngle(Math.toRadians(234), Math.toRadians(54), Math.toRadians(0)));
            stand.setLeftArmPose(new EulerAngle(Math.toRadians(52), Math.toRadians(126), Math.toRadians(193)));
            stand.setBasePlate(false);
            stand.setCustomName(ChatColor.GREEN + "Dabbing Armor Stand!");
            stand.setCustomNameVisible(true);
            stand.setGravity(true);
            player.sendMessage("ArmorStand spawned! UUID=" + stand.getUniqueId());
        }
        return false;

    }
}
