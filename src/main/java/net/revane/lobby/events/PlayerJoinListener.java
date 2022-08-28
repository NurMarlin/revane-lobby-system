package net.revane.lobby.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        //set join message null
        event.setJoinMessage(null);

        final Player player = event.getPlayer();

        //reset player
        this.resetPlayer(player);


    }


    /**
     *
     * @param player
     */
    private void resetPlayer(Player player) {
        player.getInventory().clear();
        player.setHealth(20);
        player.setFoodLevel(20);
        player.setExp(0);
        player.setLevel(2022);
    }

}
