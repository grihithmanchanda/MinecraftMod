package com.github.tcoolg10.sidmod.init;

import com.github.tcoolg10.sidmod.SidMod;
import com.github.tcoolg10.sidmod.item.ModdedSpawnEggItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final Item duct_tape = new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final Item glasses = new Item( new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final Item sid_chunk = new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final ModdedSpawnEggItem sid_spawn = new ModdedSpawnEggItem(ModEntityTypes.SID, 0xF0A5A2, 0xA96728, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SidMod.MODID);

    public static final RegistryObject<Item> DUCT_TAPE = ITEMS.register("duct_tape", () -> duct_tape);
    public static final RegistryObject<Item> GLASSES = ITEMS.register("glasses", () -> glasses);
    public static final RegistryObject<Item> SID_CHUNK = ITEMS.register("sid_chunk", () -> sid_chunk);
    public static final RegistryObject<ModdedSpawnEggItem> SID_SPAWN = ITEMS.register("sid_spawn", () -> sid_spawn);

}
