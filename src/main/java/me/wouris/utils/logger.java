package me.wouris.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class logger {
    public static void log(LogLevel level, String message) {
        if (message == null) return;

        switch (level) {
            case ERROR ->
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bReputation&3+ &7| &cERROR&8] &f" + message));
            case WARNING ->
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bReputation&3+ &7| &6WARNING&8] &f" + message));
            case INFO ->
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes(
                            '&', "&8[&bReputation&3+ &7| &eINFO&8] &f" + message));
            case SUCCESS ->
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bReputation&3+ &7| &aSUCCESS&8] &f" + message));
            case OUTLINE ->
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7" + message));
        }
    }

    public enum LogLevel { ERROR, WARNING, INFO, SUCCESS, OUTLINE }
}
