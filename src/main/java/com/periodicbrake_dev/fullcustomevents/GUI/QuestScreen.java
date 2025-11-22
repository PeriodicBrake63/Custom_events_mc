package com.periodicbrake_dev.fullcustomevents.GUI;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class QuestScreen extends Screen {

    public QuestScreen() {
        super(Component.literal("Quest Menu"));
    }

    @Override
    protected void init() {
    }

    @Override
    public void renderBackground() {
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
