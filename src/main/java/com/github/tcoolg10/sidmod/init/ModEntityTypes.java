package com.github.tcoolg10.sidmod.init;

import com.github.tcoolg10.sidmod.SidMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, SidMod.MODID);

    public static final String SID_NAME = "sid";
    public static final RegistryObject<EntityType<PandaEntity>> SID = ENTITY_TYPES.register(SID_NAME, () ->
            EntityType.Builder.<PandaEntity>create(PandaEntity::new, EntityClassification.CREATURE)
    .size(EntityType.PANDA.getWidth(), EntityType.PANDA.getHeight())
    .build(new ResourceLocation(SidMod.MODID, SID_NAME).toString())
    );
}
