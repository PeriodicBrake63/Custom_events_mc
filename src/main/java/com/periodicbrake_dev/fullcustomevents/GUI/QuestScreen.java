package com.periodicbrake_dev.fullcustomevents.GUI;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class QuestScreen extends Screen{

    public QuestScreen() {
        super(Component.literal("Quest Menu"));
    }

    @Override
    protected void init() {
        super.init();
        // ici tu mettras tes boutons etc plus tard
    }

    @Override
    public void render(net.minecraft.client.gui.GuiGraphics gfx, int mx, int my, float partialTicks) {
        this.renderBackground(gfx);
        super.render(gfx, mx, my, partialTicks);

        gfx.drawString(this.font, "GUI VIDE 😎", this.width / 2 - 30, this.height / 2, 0xFFFFFF);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

}
