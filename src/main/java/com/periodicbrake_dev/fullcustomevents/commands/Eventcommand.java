package com.periodicbrake_dev.fullcustomevents.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Eventcommand {

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event){
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
            Commands.literal("event")
                .then(
                    Commands.literal("menu")
                        .executes(Eventcommand::openEventMenu)
                )
        );
    }

    private static int openEventMenu(CommandContext<CommandSourceStack> context){
        context.getSource().sendSuccess(
            () -> Component.literal("command received: /event menu"),
            false
        );
        return 1;
    }
}
