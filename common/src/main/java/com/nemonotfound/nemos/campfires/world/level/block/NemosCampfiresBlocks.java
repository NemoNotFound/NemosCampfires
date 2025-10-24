package com.nemonotfound.nemos.campfires.world.level.block;

import com.nemonotfound.nemos.campfires.platform.Services;
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
    public static final Supplier<Block> COBBLESTONE_CAMPFIRE = register("cobblestone_campfire", properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

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
    public static final Supplier<Block> COBBLESTONE_SOUL_CAMPFIRE = register("cobblestone_soul_campfire", properties -> new CobblestoneCampfireBlock(false, 2, properties), createCobblestoneCampfireProperties(10));

    public static final Supplier<Block> ACACIA_COPPER_CAMPFIRE = register("acacia_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> BIRCH_COPPER_CAMPFIRE = register("birch_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CHERRY_COPPER_CAMPFIRE = register("cherry_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> PALE_OAK_COPPER_CAMPFIRE = register("pale_oak_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CRIMSON_COPPER_CAMPFIRE = register("crimson_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> DARK_OAK_COPPER_CAMPFIRE = register("dark_oak_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> JUNGLE_COPPER_CAMPFIRE = register("jungle_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> MANGROVE_COPPER_CAMPFIRE = register("mangrove_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> OAK_COPPER_CAMPFIRE = register("oak_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> SPRUCE_COPPER_CAMPFIRE = register("spruce_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> WARPED_COPPER_CAMPFIRE = register("warped_copper_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> COBBLESTONE_COPPER_CAMPFIRE = register("cobblestone_copper_campfire", properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Supplier<Block> ACACIA_REDSTONE_CAMPFIRE = register("acacia_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> BIRCH_REDSTONE_CAMPFIRE = register("birch_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CHERRY_REDSTONE_CAMPFIRE = register("cherry_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> PALE_OAK_REDSTONE_CAMPFIRE = register("pale_oak_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CRIMSON_REDSTONE_CAMPFIRE = register("crimson_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> DARK_OAK_REDSTONE_CAMPFIRE = register("dark_oak_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> JUNGLE_REDSTONE_CAMPFIRE = register("jungle_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> MANGROVE_REDSTONE_CAMPFIRE = register("mangrove_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> OAK_REDSTONE_CAMPFIRE = register("oak_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> SPRUCE_REDSTONE_CAMPFIRE = register("spruce_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> WARPED_REDSTONE_CAMPFIRE = register("warped_redstone_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> COBBLESTONE_REDSTONE_CAMPFIRE = register("cobblestone_redstone_campfire", properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Supplier<Block> ACACIA_LAPIS_CAMPFIRE = register("acacia_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> BIRCH_LAPIS_CAMPFIRE = register("birch_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CHERRY_LAPIS_CAMPFIRE = register("cherry_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> PALE_OAK_LAPIS_CAMPFIRE = register("pale_oak_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> CRIMSON_LAPIS_CAMPFIRE = register("crimson_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> DARK_OAK_LAPIS_CAMPFIRE = register("dark_oak_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> JUNGLE_LAPIS_CAMPFIRE = register("jungle_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> MANGROVE_LAPIS_CAMPFIRE = register("mangrove_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> OAK_LAPIS_CAMPFIRE = register("oak_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> SPRUCE_LAPIS_CAMPFIRE = register("spruce_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Supplier<Block> WARPED_LAPIS_CAMPFIRE = register("warped_lapis_campfire", properties -> new CampfireBlock(false, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Supplier<Block> COBBLESTONE_LAPIS_CAMPFIRE = register("cobblestone_lapis_campfire", properties -> new CobblestoneCampfireBlock(false, 1, properties), createCobblestoneCampfireProperties(15));

    public static final Supplier<Block> ACACIA_QUARTZ_CAMPFIRE = register("acacia_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> BIRCH_QUARTZ_CAMPFIRE = register("birch_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> CHERRY_QUARTZ_CAMPFIRE = register("cherry_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> PALE_OAK_QUARTZ_CAMPFIRE = register("pale_oak_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> CRIMSON_QUARTZ_CAMPFIRE = register("crimson_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 10));
    public static final Supplier<Block> DARK_OAK_QUARTZ_CAMPFIRE = register("dark_oak_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> JUNGLE_QUARTZ_CAMPFIRE = register("jungle_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> MANGROVE_QUARTZ_CAMPFIRE = register("mangrove_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> OAK_QUARTZ_CAMPFIRE = register("oak_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(OAK_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> SPRUCE_QUARTZ_CAMPFIRE = register("spruce_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 10));
    public static final Supplier<Block> WARPED_QUARTZ_CAMPFIRE = register("warped_quartz_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 10));
    public static final Supplier<Block> COBBLESTONE_QUARTZ_CAMPFIRE = register("cobblestone_quartz_campfire", properties -> new CobblestoneCampfireBlock(false, 2, properties), createCobblestoneCampfireProperties(10));

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

    private static Supplier<Block> register(String id, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        return Services.REGISTRY_HELPER.registerBlock(id, block, properties);
    }
}
