package com.caseyweed.gt;
import com.caseyweed.gt.Events.ChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Gt extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ChatEvent(), this);
        getLogger().info("GT Started");
    }

    @Override
    public void onDisable() {

    }
}
