package com.tg.forgebackroomsplus.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.tg.forgebackroomsplus.world.inventory.InvMenu;

import com.mojang.blaze3d.systems.RenderSystem;

public class InvScreen extends AbstractContainerScreen<InvMenu> {
	private final static HashMap<String, Object> guistate = InvMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public InvScreen(InvMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 174;
		this.imageHeight = 165;
	}

	private static final ResourceLocation texture = new ResourceLocation("forge_backrooms_plus:textures/screens/inv.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 151 && mouseX < leftPos + 175 && mouseY > topPos + -2 && mouseY < topPos + 22)
			guiGraphics.renderTooltip(font, Component.translatable("gui.forge_backrooms_plus.inv.tooltip_it_works_like_chest_but_you_can"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.forge_backrooms_plus.inv.label_almond_pocket"), 8, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.forge_backrooms_plus.inv.label_empty"), 161, 5, -6710887, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
