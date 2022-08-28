package net.revane.lobby.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player player)) {
            return true;
        }

        if(strings.length != 0) {
            player.sendMessage("§cNutze: /spawn");
            return true;
        }

        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 3, 3);
        player.teleport(player.getWorld().getSpawnLocation());
        return false;
    }
}
