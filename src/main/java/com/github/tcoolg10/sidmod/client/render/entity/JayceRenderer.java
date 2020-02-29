package com.github.tcoolg10.sidmod.client.render.entity;

import com.github.tcoolg10.sidmod.SidMod;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EndermanModel;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.util.ResourceLocation;

public class JayceRenderer extends MobRenderer<EndermanEntity, EndermanModel<EndermanEntity>> {

    private static final ResourceLocation JAYCE_TEXTURE = new ResourceLocation(SidMod.MODID, "textures/entity/jayce.png");

    public JayceRenderer(final EntityRendererManager manager) {
        super(manager, new EndermanModel<>(0.0F), 0.9F);
    }

    @Override
    public ResourceLocation getEntityTexture(final EndermanEntity entity) {
        return JAYCE_TEXTURE;
    }

}
