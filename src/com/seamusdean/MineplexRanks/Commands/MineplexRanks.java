package com.seamusdean.MineplexRanks.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * ************************************************************************************
 * Copyright (c) 2015 Jonah Dean (seamusdean). All Rights Reserved. Any code          *
 * contained within this document, or similar branded products are the sole property  *
 * of Jonah Dean.                                                                     *
 * None of the following code may be distributed, copied, or sold without the explicit*
 * permission of Jonah Dean. Claiming any code as your own or under any other         *
 * individuals name, taking snippets, taking screenshots and/or pictures is strictly  *
 * prohibited. Failure to comply without exclusive permission from Jonah Dean will    *
 * void any and all agreements created with you, the third party. Legal action may    *
 * also be incorporated, under the copyright law of the United States of America      *
 * Send any questions or concerns to seamusdeanminecraft@gmail.com                    *
 * Please respect my work and the law.                                                *
 * ************************************************************************************
 */

public class MineplexRanks implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args)
    {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.STRIKETHROUGH + "||||||||||||||||||||||||||||||||||||" + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + " Mineplex Ranks " + ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.STRIKETHROUGH + "||||||||||||||||||||||||||||||||||||");
            p.sendMessage("");
            p.sendMessage(ChatColor.BLUE + " " + ChatColor.BOLD + "Developed by " + ChatColor.RED + ChatColor.BOLD + "seamusdean");
            p.sendMessage(ChatColor.BLUE + " " + ChatColor.BOLD + "Version 1.0");
            p.sendMessage("");
            p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.STRIKETHROUGH + "||||||||||||||||||||||||||||||||||||" + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + " Mineplex Ranks " + ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.STRIKETHROUGH + "||||||||||||||||||||||||||||||||||||");
        }
        return true;
    }
}
