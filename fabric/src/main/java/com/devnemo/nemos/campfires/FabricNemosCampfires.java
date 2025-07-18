package com.devnemo.nemos.campfires;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class FabricNemosCampfires implements ModInitializer {
    
    @Override
    public void onInitialize() {
        NemosCampfiresCommon.init();

        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_CAMPFIRE.get());
        BlockEntityType.CAMPFIRE.addSupportedBlock(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get());
    }
}
