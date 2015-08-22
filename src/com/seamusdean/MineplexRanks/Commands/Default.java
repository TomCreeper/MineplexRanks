package com.seamusdean.MineplexRanks.Commands;

import com.seamusdean.MineplexRanks.Main;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
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

public class Default implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args)
    {
        if (sender instanceof Player)
        {
            Player p = (Player) sender;
            if (args.length >= 3)
            {
                try
                {
                    Bukkit.broadcastMessage(Main.getLevelColor(Integer.parseInt(args[1])) + ChatColor.YELLOW + " " + args[0] + ChatColor.WHITE + " " + StringUtils.join(args, " ", 2, args.length));
                }
                catch (NumberFormatException e)
                {
                    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "ERROR " + ChatColor.RED + "Level must be a whole number.");
                }
            }
            else
            {
                p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "ERROR " + ChatColor.RED + "Incorrect usage. /default <name> <level> <message>");
            }
        }
        else
        {
            sender.sendMessage("You must be a player to execute this command!");
        }
        return false;
    }
}
