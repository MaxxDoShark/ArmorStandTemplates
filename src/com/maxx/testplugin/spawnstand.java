package com.maxx.testplugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;

public class spawnstand implements CommandExecutor {

    // number <number>
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("armortemplate.template")) {
            ArmorStand stand = (ArmorStand) player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            stand.setVisible(true);
            stand.setArms(true);
            stand.setCustomName("Armor Stand!");
            stand.setCustomNameVisible(true);
            stand.setGravity(false);
            player.sendMessage("ArmorStand spawned! UUID=" + stand.getUniqueId());
        }
        return false;
    }
}
