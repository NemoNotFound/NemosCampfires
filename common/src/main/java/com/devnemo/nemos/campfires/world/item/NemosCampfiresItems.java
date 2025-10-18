package com.devnemo.nemos.campfires.world.item;

import com.devnemo.nemos.campfires.platform.Services;
import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class NemosCampfiresItems {

    public static final Supplier<Item> ACACIA_CAMPFIRE = registerCampfireBlockItem("acacia_campfire", NemosCampfiresBlocks.ACACIA_CAMPFIRE);
    public static final Supplier<Item> BIRCH_CAMPFIRE = registerCampfireBlockItem("birch_campfire", NemosCampfiresBlocks.BIRCH_CAMPFIRE);
    public static final Supplier<Item> CHERRY_CAMPFIRE = registerCampfireBlockItem("cherry_campfire", NemosCampfiresBlocks.CHERRY_CAMPFIRE);
    public static final Supplier<Item> PALE_OAK_CAMPFIRE = registerCampfireBlockItem("pale_oak_campfire", NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
    public static final Supplier<Item> CRIMSON_CAMPFIRE = registerCampfireBlockItem("crimson_campfire", NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
    public static final Supplier<Item> DARK_OAK_CAMPFIRE = registerCampfireBlockItem("dark_oak_campfire", NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
    public static final Supplier<Item> JUNGLE_CAMPFIRE = registerCampfireBlockItem("jungle_campfire", NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
    public static final Supplier<Item> MANGROVE_CAMPFIRE = registerCampfireBlockItem("mangrove_campfire", NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
    public static final Supplier<Item> SPRUCE_CAMPFIRE = registerCampfireBlockItem("spruce_campfire", NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
    public static final Supplier<Item> WARPED_CAMPFIRE = registerCampfireBlockItem("warped_campfire", NemosCampfiresBlocks.WARPED_CAMPFIRE);
    public static final Supplier<Item> ACACIA_SOUL_CAMPFIRE = registerCampfireBlockItem("acacia_soul_campfire", NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE);
    public static final Supplier<Item> BIRCH_SOUL_CAMPFIRE = registerCampfireBlockItem("birch_soul_campfire", NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE);
    public static final Supplier<Item> CHERRY_SOUL_CAMPFIRE = registerCampfireBlockItem("cherry_soul_campfire", NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE);
    public static final Supplier<Item> PALE_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem("pale_oak_soul_campfire", NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE);
    public static final Supplier<Item> CRIMSON_SOUL_CAMPFIRE = registerCampfireBlockItem("crimson_soul_campfire", NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE);
    public static final Supplier<Item> DARK_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem("dark_oak_soul_campfire", NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE);
    public static final Supplier<Item> JUNGLE_SOUL_CAMPFIRE = registerCampfireBlockItem("jungle_soul_campfire", NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE);
    public static final Supplier<Item> MANGROVE_SOUL_CAMPFIRE = registerCampfireBlockItem("mangrove_soul_campfire", NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE);
    public static final Supplier<Item> SPRUCE_SOUL_CAMPFIRE = registerCampfireBlockItem("spruce_soul_campfire", NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE);
    public static final Supplier<Item> WARPED_SOUL_CAMPFIRE = registerCampfireBlockItem("warped_soul_campfire", NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE);
    public static final Supplier<Item> ACACIA_COPPER_CAMPFIRE = registerCampfireBlockItem("acacia_copper_campfire", NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE);
    public static final Supplier<Item> BIRCH_COPPER_CAMPFIRE = registerCampfireBlockItem("birch_copper_campfire", NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE);
    public static final Supplier<Item> CHERRY_COPPER_CAMPFIRE = registerCampfireBlockItem("cherry_copper_campfire", NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE);
    public static final Supplier<Item> PALE_OAK_COPPER_CAMPFIRE = registerCampfireBlockItem("pale_oak_copper_campfire", NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE);
    public static final Supplier<Item> CRIMSON_COPPER_CAMPFIRE = registerCampfireBlockItem("crimson_copper_campfire", NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE);
    public static final Supplier<Item> DARK_OAK_COPPER_CAMPFIRE = registerCampfireBlockItem("dark_oak_copper_campfire", NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE);
    public static final Supplier<Item> JUNGLE_COPPER_CAMPFIRE = registerCampfireBlockItem("jungle_copper_campfire", NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE);
    public static final Supplier<Item> MANGROVE_COPPER_CAMPFIRE = registerCampfireBlockItem("mangrove_copper_campfire", NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE);
    public static final Supplier<Item> OAK_COPPER_CAMPFIRE = registerCampfireBlockItem("oak_copper_campfire", NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE);
    public static final Supplier<Item> SPRUCE_COPPER_CAMPFIRE = registerCampfireBlockItem("spruce_copper_campfire", NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE);
    public static final Supplier<Item> WARPED_COPPER_CAMPFIRE = registerCampfireBlockItem("warped_copper_campfire", NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE);
    public static final Supplier<Item> ACACIA_REDSTONE_CAMPFIRE = registerCampfireBlockItem("acacia_redstone_campfire", NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> BIRCH_REDSTONE_CAMPFIRE = registerCampfireBlockItem("birch_redstone_campfire", NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> CHERRY_REDSTONE_CAMPFIRE = registerCampfireBlockItem("cherry_redstone_campfire", NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> PALE_OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem("pale_oak_redstone_campfire", NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> CRIMSON_REDSTONE_CAMPFIRE = registerCampfireBlockItem("crimson_redstone_campfire", NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> DARK_OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem("dark_oak_redstone_campfire", NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> JUNGLE_REDSTONE_CAMPFIRE = registerCampfireBlockItem("jungle_redstone_campfire", NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> MANGROVE_REDSTONE_CAMPFIRE = registerCampfireBlockItem("mangrove_redstone_campfire", NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem("oak_redstone_campfire", NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> SPRUCE_REDSTONE_CAMPFIRE = registerCampfireBlockItem("spruce_redstone_campfire", NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> WARPED_REDSTONE_CAMPFIRE = registerCampfireBlockItem("warped_redstone_campfire", NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE);
    public static final Supplier<Item> ACACIA_LAPIS_CAMPFIRE = registerCampfireBlockItem("acacia_lapis_campfire", NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE);
    public static final Supplier<Item> BIRCH_LAPIS_CAMPFIRE = registerCampfireBlockItem("birch_lapis_campfire", NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE);
    public static final Supplier<Item> CHERRY_LAPIS_CAMPFIRE = registerCampfireBlockItem("cherry_lapis_campfire", NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE);
    public static final Supplier<Item> PALE_OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem("pale_oak_lapis_campfire", NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE);
    public static final Supplier<Item> CRIMSON_LAPIS_CAMPFIRE = registerCampfireBlockItem("crimson_lapis_campfire", NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE);
    public static final Supplier<Item> DARK_OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem("dark_oak_lapis_campfire", NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE);
    public static final Supplier<Item> JUNGLE_LAPIS_CAMPFIRE = registerCampfireBlockItem("jungle_lapis_campfire", NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE);
    public static final Supplier<Item> MANGROVE_LAPIS_CAMPFIRE = registerCampfireBlockItem("mangrove_lapis_campfire", NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE);
    public static final Supplier<Item> OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem("oak_lapis_campfire", NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE);
    public static final Supplier<Item> SPRUCE_LAPIS_CAMPFIRE = registerCampfireBlockItem("spruce_lapis_campfire", NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE);
    public static final Supplier<Item> WARPED_LAPIS_CAMPFIRE = registerCampfireBlockItem("warped_lapis_campfire", NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE);

    public static void init() {}

    private static Supplier<Item> registerCampfireBlockItem(String id, Supplier<Block> blockSupplier) {
        return registerBlockItem(id, blockSupplier, new Item.Properties().component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));
    }

    private static Supplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier, Item.Properties properties) {
        return Services.REGISTRY_HELPER.registerItem(id, itemProperties -> new BlockItem(blockSupplier.get(), itemProperties.useBlockDescriptionPrefix()), properties);
    }
}
