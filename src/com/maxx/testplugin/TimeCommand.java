package com.maxx.testplugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import java.util.Date;
import java.util.Calendar;

public class TimeCommand implements CommandExecutor {


    Calendar c1 = Calendar.getInstance();
    Date dateOne = c1.getTime();
    // number <number>
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if (args[0].equalsIgnoreCase("1")) {
            dateOne.setTime(1000);

        } else if (args[0].equalsIgnoreCase("2")) {
            dateOne.setTime(14000);

        } else {
            player.sendMessage("INVALID");
        }

        return false;
    }
}
