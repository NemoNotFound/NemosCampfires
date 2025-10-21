package com.nemonotfound.nemos.campfires;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class FabricNemosCampfires implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCampfiresCommon.init();

        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get());
    }
}
