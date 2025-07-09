package com.devnemo.nemos.campfires.world.level.block;

import com.devnemo.nemos.campfires.platform.Services;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class NemosCampfiresBlocks {


    public static void init() {}

    public static final Supplier<Block> ACACIA_CAMPFIRE = register("acacia_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> BIRCH_CAMPFIRE = register("birch_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CHERRY_CAMPFIRE = register("cherry_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> PALE_OAK_CAMPFIRE = register("pale_oak_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CRIMSON_CAMPFIRE = register("crimson_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> DARK_OAK_CAMPFIRE = register("dark_oak_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> JUNGLE_CAMPFIRE = register("jungle_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> MANGROVE_CAMPFIRE = register("mangrove_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> SPRUCE_CAMPFIRE = register("spruce_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> WARPED_CAMPFIRE = register("warped_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> ACACIA_SOUL_CAMPFIRE = register("acacia_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> BIRCH_SOUL_CAMPFIRE = register("birch_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> CHERRY_SOUL_CAMPFIRE = register("cherry_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> PALE_OAK_SOUL_CAMPFIRE = register("pale_oak_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> CRIMSON_SOUL_CAMPFIRE = register("crimson_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 10));
    public static final Supplier<Block> DARK_OAK_SOUL_CAMPFIRE = register("dark_oak_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> JUNGLE_SOUL_CAMPFIRE = register("jungle_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> MANGROVE_SOUL_CAMPFIRE = register("mangrove_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> SPRUCE_SOUL_CAMPFIRE = register("spruce_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> WARPED_SOUL_CAMPFIRE = register("warped_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 10));

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

    private static Supplier<Block> register(String id, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        return Services.REGISTRY_HELPER.registerBlock(id, block, properties);
    }
}
