package com.seamusdean.MineplexRanks;

import com.seamusdean.MineplexRanks.Commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ************************************************************************************
 * Copyright (c) 2015 Jonah Dean (seamusdean). All Rights Reserved. Any code          *
 * contained within this document, or similar branded products are the sole property  *
 * of Jonah Dean.                                                                     *
 * None of the following code may be distributed, copied, or sold without the explict *
 * permission of Jonah Dean. Claiming any code as your own or under any other         *
 * individual's name, taking snippets, taking screenshots and/or pictures is strictly *
 * prohibited. Failure to comply without exclusive permission from Jonah Dean will    *
 * void any and all agreements created with you, the third party. Legal action may    *
 * also be incorporated, under the copyright law of the United States of America      *
 * Send any questions or concerns to seamusdeanminecraft@gmail.com                    *
 * Please respect my work and the law.                                                *
 * ************************************************************************************
 */

public class Main extends JavaPlugin {

    public void onEnable()
    {
        getCommand("mineplexranks").setExecutor(new MineplexRanks());
        getCommand("owner").setExecutor(new Owner());
        getCommand("lt").setExecutor(new LT());
        getCommand("dev").setExecutor(new Dev());
        getCommand("jrdev").setExecutor(new JrDev());
        getCommand("admin").setExecutor(new Admin());
        getCommand("srmod").setExecutor(new SrMod());
        getCommand("mod").setExecutor(new Mod());
        getCommand("trainee").setExecutor(new Trainee());
        getCommand("maplead").setExecutor(new MapLead());
        getCommand("builder").setExecutor(new Builder());
        getCommand("media").setExecutor(new Media());
        getCommand("youtube").setExecutor(new YouTube());
        getCommand("twitch").setExecutor(new Twitch());
        getCommand("legend").setExecutor(new Legend());
        getCommand("hero").setExecutor(new Hero());
        getCommand("ultra").setExecutor(new Ultra());
        getCommand("default").setExecutor(new Default());
    }

    public static String getLevelColor(int level)
    {
        if (level < 0)
        {
            return ChatColor.LIGHT_PURPLE.toString() + level;
        }
        else if(level >= 0 && level <= 19)
        {
            return ChatColor.GRAY.toString() + level;
        }
        else if (level >= 20 && level <= 39)
        {
            return ChatColor.BLUE.toString() + level;
        }
        else if (level >= 40 && level <= 59)
        {
            return ChatColor.DARK_GREEN.toString() + level;
        }
        else if (level >= 60 && level <= 79)
        {
            return ChatColor.GOLD.toString() + level;
        }
        else
        {
            return ChatColor.RED.toString() + level;
        }
    }
}
