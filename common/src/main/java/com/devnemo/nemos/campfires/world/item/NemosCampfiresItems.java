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

    public static void init() {}

    private static Supplier<Item> registerCampfireBlockItem(String id, Supplier<Block> blockSupplier) {
        return registerBlockItem(id, blockSupplier, new Item.Properties().component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));
    }

    private static Supplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier, Item.Properties properties) {
        return Services.REGISTRY_HELPER.registerItem(id, itemProperties -> new BlockItem(blockSupplier.get(), itemProperties.useBlockDescriptionPrefix()), properties);
    }
}
