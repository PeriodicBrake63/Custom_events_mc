package com.periodicbrake_dev.fullcustomevents.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.periodicbrake_dev.fullcustomevents.GUI.QuestScreen;

import net.minecraft.client.Minecraft;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Questcommand {

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event){
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
            Commands.literal("quest")
                .then(
                    Commands.literal("menu")
                        .executes(Questcommand::openQuestMenu)
                )
        );
    }

    private static int openQuestMenu(CommandContext<CommandSourceStack> context){
        context.getSource().sendSuccess(
            () -> Component.literal("opening quest menu"),
            false
        );
        Minecraft.getInstance().setScreen(new QuestScreen());
        return 1;
    }
}
