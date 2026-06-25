package com.nemonotfound.nemos.campfires.world.item;

import com.nemonotfound.nemos.campfires.reference.CampfiresBlockItemIds;
import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.Block;

import java.util.function.BiFunction;
import java.util.function.Function;

public class NemosCampfiresItems {

    public static final Item ACACIA_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.ACACIA_CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE);
    public static final Item BIRCH_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.BIRCH_CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE);
    public static final Item CHERRY_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CHERRY_CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE);
    public static final Item PALE_OAK_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.PALE_OAK_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
    public static final Item CRIMSON_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CRIMSON_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
    public static final Item DARK_OAK_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.DARK_OAK_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
    public static final Item JUNGLE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.JUNGLE_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
    public static final Item MANGROVE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.MANGROVE_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
    public static final Item SPRUCE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.SPRUCE_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
    public static final Item WARPED_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.WARPED_CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE);
    public static final Item COBBLESTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.COBBLESTONE_CAMPFIRE, NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE);

    public static final Item ACACIA_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.ACACIA_SOUL_CAMPFIRE, NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE);
    public static final Item BIRCH_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.BIRCH_SOUL_CAMPFIRE, NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE);
    public static final Item CHERRY_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CHERRY_SOUL_CAMPFIRE, NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE);
    public static final Item PALE_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.PALE_OAK_SOUL_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE);
    public static final Item CRIMSON_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CRIMSON_SOUL_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE);
    public static final Item DARK_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.DARK_OAK_SOUL_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE);
    public static final Item JUNGLE_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.JUNGLE_SOUL_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE);
    public static final Item MANGROVE_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.MANGROVE_SOUL_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE);
    public static final Item SPRUCE_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.SPRUCE_SOUL_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE);
    public static final Item WARPED_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.WARPED_SOUL_CAMPFIRE, NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE);
    public static final Item COBBLESTONE_SOUL_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.COBBLESTONE_SOUL_CAMPFIRE, NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE);

    public static final Item ACACIA_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.ACACIA_COPPER_CAMPFIRE, NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE);
    public static final Item BIRCH_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.BIRCH_COPPER_CAMPFIRE, NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE);
    public static final Item CHERRY_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CHERRY_COPPER_CAMPFIRE, NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE);
    public static final Item PALE_OAK_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.PALE_OAK_COPPER_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE);
    public static final Item CRIMSON_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CRIMSON_COPPER_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE);
    public static final Item DARK_OAK_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.DARK_OAK_COPPER_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE);
    public static final Item JUNGLE_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.JUNGLE_COPPER_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE);
    public static final Item MANGROVE_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.MANGROVE_COPPER_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE);
    public static final Item OAK_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.OAK_COPPER_CAMPFIRE, NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE);
    public static final Item SPRUCE_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.SPRUCE_COPPER_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE);
    public static final Item WARPED_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.WARPED_COPPER_CAMPFIRE, NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE);
    public static final Item COBBLESTONE_COPPER_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.COBBLESTONE_COPPER_CAMPFIRE, NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE);

    public static final Item ACACIA_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.ACACIA_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE);
    public static final Item BIRCH_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.BIRCH_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE);
    public static final Item CHERRY_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CHERRY_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE);
    public static final Item PALE_OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.PALE_OAK_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE);
    public static final Item CRIMSON_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CRIMSON_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE);
    public static final Item DARK_OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.DARK_OAK_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE);
    public static final Item JUNGLE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.JUNGLE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE);
    public static final Item MANGROVE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.MANGROVE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE);
    public static final Item OAK_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.OAK_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE);
    public static final Item SPRUCE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.SPRUCE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE);
    public static final Item WARPED_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.WARPED_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE);
    public static final Item COBBLESTONE_REDSTONE_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.COBBLESTONE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE);

    public static final Item ACACIA_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.ACACIA_LAPIS_CAMPFIRE, NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE);
    public static final Item BIRCH_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.BIRCH_LAPIS_CAMPFIRE, NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE);
    public static final Item CHERRY_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CHERRY_LAPIS_CAMPFIRE, NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE);
    public static final Item PALE_OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.PALE_OAK_LAPIS_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE);
    public static final Item CRIMSON_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CRIMSON_LAPIS_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE);
    public static final Item DARK_OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.DARK_OAK_LAPIS_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE);
    public static final Item JUNGLE_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.JUNGLE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE);
    public static final Item MANGROVE_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.MANGROVE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE);
    public static final Item OAK_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.OAK_LAPIS_CAMPFIRE, NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE);
    public static final Item SPRUCE_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.SPRUCE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE);
    public static final Item WARPED_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.WARPED_LAPIS_CAMPFIRE, NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE);
    public static final Item COBBLESTONE_LAPIS_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.COBBLESTONE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE);

    public static final Item ACACIA_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.ACACIA_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE);
    public static final Item BIRCH_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.BIRCH_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE);
    public static final Item CHERRY_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CHERRY_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE);
    public static final Item PALE_OAK_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.PALE_OAK_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE);
    public static final Item CRIMSON_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.CRIMSON_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE);
    public static final Item DARK_OAK_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.DARK_OAK_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE);
    public static final Item JUNGLE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.JUNGLE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE);
    public static final Item MANGROVE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.MANGROVE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE);
    public static final Item OAK_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.OAK_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE);
    public static final Item SPRUCE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.SPRUCE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE);
    public static final Item WARPED_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.WARPED_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE);
    public static final Item COBBLESTONE_QUARTZ_CAMPFIRE = registerCampfireBlockItem(CampfiresBlockItemIds.COBBLESTONE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE);

    public static void init() {}

    private static Item registerCampfireBlockItem(BlockItemId blockItemId, Block block) {
        return registerBlock(blockItemId, block, BlockItem::new, new Item.Properties().component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));
    }

    private static Item registerBlock(final BlockItemId blockItemId, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(
                blockItemId.item(),
                (p) -> itemFactory.apply(block, p),
                properties.useBlockDescriptionPrefix()
                        .requiredFeatures(block.requiredFeatures())
        );
    }

    private static Item registerItem(final ResourceKey<Item> key, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }
}
