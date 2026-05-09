package com.nemonotfound.nemos.campfires.world.item;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.Block;

import java.util.function.BiFunction;
import java.util.function.Function;

public class NemosCampfiresItems {

    public static final Item ACACIA_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.ACACIA_CAMPFIRE);
    public static final Item BIRCH_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.BIRCH_CAMPFIRE);
    public static final Item CHERRY_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CHERRY_CAMPFIRE);
    public static final Item PALE_OAK_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
    public static final Item CRIMSON_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
    public static final Item DARK_OAK_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
    public static final Item JUNGLE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
    public static final Item MANGROVE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
    public static final Item SPRUCE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
    public static final Item WARPED_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.WARPED_CAMPFIRE);
    public static final Item COBBLESTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE);

    public static final Item ACACIA_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE);
    public static final Item BIRCH_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE);
    public static final Item CHERRY_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE);
    public static final Item PALE_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE);
    public static final Item CRIMSON_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE);
    public static final Item DARK_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE);
    public static final Item JUNGLE_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE);
    public static final Item MANGROVE_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE);
    public static final Item SPRUCE_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE);
    public static final Item WARPED_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE);
    public static final Item COBBLESTONE_SOUL_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE);

    public static final Item ACACIA_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE);
    public static final Item BIRCH_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE);
    public static final Item CHERRY_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE);
    public static final Item PALE_OAK_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE);
    public static final Item CRIMSON_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE);
    public static final Item DARK_OAK_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE);
    public static final Item JUNGLE_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE);
    public static final Item MANGROVE_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE);
    public static final Item OAK_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE);
    public static final Item SPRUCE_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE);
    public static final Item WARPED_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE);
    public static final Item COBBLESTONE_COPPER_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE);

    public static final Item ACACIA_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE);
    public static final Item BIRCH_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE);
    public static final Item CHERRY_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE);
    public static final Item PALE_OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE);
    public static final Item CRIMSON_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE);
    public static final Item DARK_OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE);
    public static final Item JUNGLE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE);
    public static final Item MANGROVE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE);
    public static final Item OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE);
    public static final Item SPRUCE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE);
    public static final Item WARPED_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE);
    public static final Item COBBLESTONE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE);

    public static final Item ACACIA_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE);
    public static final Item BIRCH_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE);
    public static final Item CHERRY_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE);
    public static final Item PALE_OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE);
    public static final Item CRIMSON_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE);
    public static final Item DARK_OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE);
    public static final Item JUNGLE_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE);
    public static final Item MANGROVE_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE);
    public static final Item OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE);
    public static final Item SPRUCE_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE);
    public static final Item WARPED_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE);
    public static final Item COBBLESTONE_LAPIS_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE);

    public static final Item ACACIA_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE);
    public static final Item BIRCH_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE);
    public static final Item CHERRY_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE);
    public static final Item PALE_OAK_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE);
    public static final Item CRIMSON_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE);
    public static final Item DARK_OAK_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE);
    public static final Item JUNGLE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE);
    public static final Item MANGROVE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE);
    public static final Item OAK_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE);
    public static final Item SPRUCE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE);
    public static final Item WARPED_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE);
    public static final Item COBBLESTONE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE);

    public static void init() {}

    private static Item registerCampfireBlockItem(Block block) {
        return registerBlock(block, BlockItem::new, new Item.Properties().component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));
    }

    private static Item registerBlock(final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(
                blockIdToItemId(block.properties().blockIdOrThrow()),
                (p) -> itemFactory.apply(block, p),
                properties.useBlockDescriptionPrefix()
                        .requiredFeatures(block.requiredFeatures())
        );
    }

    private static ResourceKey<Item> blockIdToItemId(final ResourceKey<Block> blockName) {
        return ResourceKey.create(Registries.ITEM, blockName.identifier());
    }

    private static Item registerItem(final ResourceKey<Item> key, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }
}
