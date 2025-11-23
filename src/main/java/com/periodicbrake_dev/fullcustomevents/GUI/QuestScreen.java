package com.periodicbrake_dev.fullcustomevents.GUI;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class QuestScreen extends Screen {

    private static final ResourceLocation BG =
            new ResourceLocation("fullcustomevents", "textures/gui/quests.png");

    public QuestScreen() {
        super(Component.literal("Quests"));
    }

    @Override
    protected void init() {
        // rien pour l’instant
    }

    @Override
    public void render(GuiGraphics gui, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(gui); // fond noir comme l'inventaire

        int x = (this.width - 192) / 2;  // 192 = largeur de ta texture
        int y = (this.height - 128) / 2; // 128 = hauteur de ta texture

        gui.blit(BG, x, y, 0, 0, 192, 128); // BAM texture affichée

        super.render(gui, mouseX, mouseY, partialTick);
    }
}
