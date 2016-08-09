package com.nametagedit.plugin.storage;

import com.nametagedit.plugin.api.data.GroupData;
import com.nametagedit.plugin.api.data.PlayerData;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * This is responsible for abstracting
 * a database/flat file storage
 */
public interface AbstractConfig {

    void load();

    void reload();

    void shutdown();

    void load(Player player);

    void save(PlayerData playerData);

    void save(GroupData groupData);

    void savePriority(boolean playerTag, String key, int priority);

    void delete(GroupData groupData);

    void add(GroupData groupData);

    void clear(UUID uuid, String targetName);

    void orderGroups(CommandSender commandSender, String[] args);

}