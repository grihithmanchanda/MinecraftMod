package com.github.tcoolg10.sidmod;

import com.github.tcoolg10.sidmod.init.ModBlocks;
import com.github.tcoolg10.sidmod.init.ModEntityTypes;
import com.github.tcoolg10.sidmod.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SidMod.MODID)
public final class SidMod {

    public static final String MODID = "sidmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public SidMod() {

        LOGGER.debug("Yeet");

        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);

    }
}
