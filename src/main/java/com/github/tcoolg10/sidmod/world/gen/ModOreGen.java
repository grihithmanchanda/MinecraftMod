package com.github.tcoolg10.sidmod.world.gen;

import com.github.tcoolg10.sidmod.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {
    private static final CountRangeConfig cfg = new CountRangeConfig(60,0,0,255);
    private static final int veinsize = 9;

    public static void setupOre(){
        ForgeRegistries.BIOMES.getValues().stream()
                .filter(biome -> biome.getCategory() != Biome.Category.THEEND)
                .filter(biome -> biome.getCategory() != Biome.Category.NETHER)
                .forEach(biome -> {
                    biome.addFeature(
                            GenerationStage.Decoration.UNDERGROUND_DECORATION,
                            Feature.ORE.func_225566_b_(
                                    new OreFeatureConfig(
                                            OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                            ModBlocks.sid_ore.getDefaultState(),
                                            veinsize
                                    )
                            )
                                    .func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(cfg))
                    );
                });
    }
}
