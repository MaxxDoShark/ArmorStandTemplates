package com.maxx.testplugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;


public class NumberCommand implements CommandExecutor {

    // number <number>
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (args[0].equalsIgnoreCase("1")) {
            player.sendMessage("ONE");

        } else if (args[0].equalsIgnoreCase("2")) {
            player.sendMessage("TWO");

        } else {
            player.sendMessage("INVALID");
        }

        return false;
    }
}
