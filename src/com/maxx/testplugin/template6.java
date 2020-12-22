package com.maxx.testplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;

public class template6 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("armortemplate.template")) {


            ArmorStand stand = (ArmorStand) player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            stand.setVisible(true);
            stand.setArms(true);
            stand.setLeftArmPose(new EulerAngle(Math.toRadians(179), Math.toRadians(0), Math.toRadians(335)));
            stand.setBasePlate(false);
            stand.setCustomName(ChatColor.BLUE + "Waving Armor Stand");
            stand.setCustomNameVisible(true);
            stand.setGravity(true);
            player.sendMessage("ArmorStand spawned! UUID=" + stand.getUniqueId());
        }
        return false;

    }
}
