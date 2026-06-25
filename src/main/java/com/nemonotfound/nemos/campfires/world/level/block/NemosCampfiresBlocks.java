package com.nemonotfound.nemos.campfires.world.level.block;

import com.nemonotfound.nemos.campfires.reference.CampfiresBlockItemIds;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.*;

public class NemosCampfiresBlocks {


    public static void init() {}

    public static final Block ACACIA_CAMPFIRE = register(CampfiresBlockItemIds.ACACIA_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Block BIRCH_CAMPFIRE = register(CampfiresBlockItemIds.BIRCH_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Block CHERRY_CAMPFIRE = register(CampfiresBlockItemIds.CHERRY_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Block PALE_OAK_CAMPFIRE = register(CampfiresBlockItemIds.PALE_OAK_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Block CRIMSON_CAMPFIRE = register(CampfiresBlockItemIds.CRIMSON_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Block DARK_OAK_CAMPFIRE = register(CampfiresBlockItemIds.DARK_OAK_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Block JUNGLE_CAMPFIRE = register(CampfiresBlockItemIds.JUNGLE_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Block MANGROVE_CAMPFIRE = register(CampfiresBlockItemIds.MANGROVE_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Block SPRUCE_CAMPFIRE = register(CampfiresBlockItemIds.SPRUCE_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Block WARPED_CAMPFIRE = register(CampfiresBlockItemIds.WARPED_CAMPFIRE.block(), properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Block COBBLESTONE_CAMPFIRE = register(CampfiresBlockItemIds.COBBLESTONE_CAMPFIRE.block(), properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Block ACACIA_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.ACACIA_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 10));
    public static final Block BIRCH_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.BIRCH_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 10));
    public static final Block CHERRY_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.CHERRY_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 10));
    public static final Block PALE_OAK_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.PALE_OAK_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 10));
    public static final Block CRIMSON_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.CRIMSON_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 10));
    public static final Block DARK_OAK_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.DARK_OAK_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 10));
    public static final Block JUNGLE_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.JUNGLE_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 10));
    public static final Block MANGROVE_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.MANGROVE_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 10));
    public static final Block SPRUCE_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.SPRUCE_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 10));
    public static final Block WARPED_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.WARPED_SOUL_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 10));
    public static final Block COBBLESTONE_SOUL_CAMPFIRE = register(CampfiresBlockItemIds.COBBLESTONE_SOUL_CAMPFIRE.block(), properties -> new CobblestoneCampfireBlock(false, 2, properties), createCobblestoneCampfireProperties(10));

    public static final Block ACACIA_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.ACACIA_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Block BIRCH_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.BIRCH_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Block CHERRY_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.CHERRY_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Block PALE_OAK_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.PALE_OAK_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Block CRIMSON_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.CRIMSON_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Block DARK_OAK_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.DARK_OAK_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Block JUNGLE_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.JUNGLE_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Block MANGROVE_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.MANGROVE_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Block OAK_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.OAK_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 15));
    public static final Block SPRUCE_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.SPRUCE_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Block WARPED_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.WARPED_COPPER_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Block COBBLESTONE_COPPER_CAMPFIRE = register(CampfiresBlockItemIds.COBBLESTONE_COPPER_CAMPFIRE.block(), properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Block ACACIA_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.ACACIA_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Block BIRCH_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.BIRCH_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Block CHERRY_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.CHERRY_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Block PALE_OAK_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.PALE_OAK_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Block CRIMSON_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.CRIMSON_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Block DARK_OAK_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.DARK_OAK_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Block JUNGLE_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.JUNGLE_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Block MANGROVE_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.MANGROVE_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Block OAK_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.OAK_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 15));
    public static final Block SPRUCE_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.SPRUCE_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Block WARPED_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.WARPED_REDSTONE_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Block COBBLESTONE_REDSTONE_CAMPFIRE = register(CampfiresBlockItemIds.COBBLESTONE_REDSTONE_CAMPFIRE.block(), properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Block ACACIA_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.ACACIA_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Block BIRCH_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.BIRCH_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Block CHERRY_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.CHERRY_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Block PALE_OAK_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.PALE_OAK_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Block CRIMSON_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.CRIMSON_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Block DARK_OAK_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.DARK_OAK_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Block JUNGLE_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.JUNGLE_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Block MANGROVE_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.MANGROVE_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Block OAK_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.OAK_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 15));
    public static final Block SPRUCE_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.SPRUCE_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Block WARPED_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.WARPED_LAPIS_CAMPFIRE.block(), properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Block COBBLESTONE_LAPIS_CAMPFIRE = register(CampfiresBlockItemIds.COBBLESTONE_LAPIS_CAMPFIRE.block(), properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Block ACACIA_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.ACACIA_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 10));
    public static final Block BIRCH_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.BIRCH_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 10));
    public static final Block CHERRY_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.CHERRY_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 10));
    public static final Block PALE_OAK_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.PALE_OAK_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 10));
    public static final Block CRIMSON_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.CRIMSON_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 10));
    public static final Block DARK_OAK_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.DARK_OAK_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 10));
    public static final Block JUNGLE_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.JUNGLE_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 10));
    public static final Block MANGROVE_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.MANGROVE_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 10));
    public static final Block OAK_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.OAK_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 10));
    public static final Block SPRUCE_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.SPRUCE_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 10));
    public static final Block WARPED_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.WARPED_QUARTZ_CAMPFIRE.block(), properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 10));
    public static final Block COBBLESTONE_QUARTZ_CAMPFIRE = register(CampfiresBlockItemIds.COBBLESTONE_QUARTZ_CAMPFIRE.block(), properties -> new CobblestoneCampfireBlock(false, 2, properties), createCobblestoneCampfireProperties(10));

    private static BlockBehaviour.Properties createCampfireProperties(MapColor mapColor, int lightValue) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sound(SoundType.WOOD)
                .lightLevel(blockState -> blockState.getValue(BlockStateProperties.LIT) ? lightValue : 0)
                .noOcclusion()
                .ignitedByLava();
    }
    
    private static BlockBehaviour.Properties createCobblestoneCampfireProperties(int lightValue) {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(2.0F, 6.0F)
                .sound(SoundType.STONE)
                .lightLevel(blockState -> blockState.getValue(BlockStateProperties.LIT) ? lightValue : 0)
                .noOcclusion()
                .ignitedByLava();
    }

    public static Block register(final ResourceKey<Block> id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        var block = factory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }
}
