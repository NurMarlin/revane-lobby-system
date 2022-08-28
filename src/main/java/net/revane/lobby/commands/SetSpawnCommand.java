package net.revane.lobby.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SetSpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player player)) {
            return true;
        }

        if(strings.length != 0) {
            player.sendMessage("§cNutze: /setspawn");
            return true;
        }

        player.getWorld().setSpawnLocation(player.getLocation());
        player.sendMessage("§aDu hast den Spawn gesetzt!");
        return false;
    }
}
