package com.github.tcoolg10.sidmod.client.render.entity;

import com.github.tcoolg10.sidmod.SidMod;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.PandaModel;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.util.ResourceLocation;

public class SidRenderer extends MobRenderer<PandaEntity, PandaModel<PandaEntity>> {

    private static final ResourceLocation SID_TEXTURE = new ResourceLocation(SidMod.MODID, "textures/entity/sid.png");

    public SidRenderer(final EntityRendererManager manager) {
        super(manager, new PandaModel<>(9, 0.0F), 0.9F);
    }

    @Override
    public ResourceLocation getEntityTexture(final PandaEntity entity) {
        return SID_TEXTURE;
    }

}
