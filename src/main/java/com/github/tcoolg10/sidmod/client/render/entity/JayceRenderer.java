package com.github.tcoolg10.sidmod.client.render.entity;

import com.github.tcoolg10.sidmod.SidMod;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EndermanModel;
import net.minecraft.client.renderer.entity.model.IronGolemModel;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.util.ResourceLocation;

public class JayceRenderer extends MobRenderer<IronGolemEntity, IronGolemModel<IronGolemEntity>> {

    private static final ResourceLocation JAYCE_TEXTURE = new ResourceLocation(SidMod.MODID, "textures/entity/jayce.png");

    public JayceRenderer(final EntityRendererManager manager) {
        super(manager, new IronGolemModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(final IronGolemEntity entity) {
        return JAYCE_TEXTURE;
    }

}
