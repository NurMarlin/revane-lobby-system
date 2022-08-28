package net.revane.lobby;

import lombok.Getter;
import net.revane.lobby.commands.SetSpawnCommand;
import net.revane.lobby.commands.SpawnCommand;
import net.revane.lobby.events.EntityDamageListener;
import net.revane.lobby.events.PlayerFoodLevelChangeListener;
import net.revane.lobby.events.PlayerJoinListener;
import net.revane.lobby.events.PlayerQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Lobby extends JavaPlugin {

    @Getter
    private static Lobby instance;

    @Override
    public void onEnable() {
        instance = this;

        //register events
        final PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new PlayerJoinListener(), this);
        manager.registerEvents(new PlayerQuitListener(), this);
        manager.registerEvents(new EntityDamageListener(), this);
        manager.registerEvents(new PlayerFoodLevelChangeListener(), this);

        this.getCommand("setspawn").setExecutor(new SetSpawnCommand());
        this.getCommand("spawn").setExecutor(new SpawnCommand());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
