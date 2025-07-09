package com.devnemo.nemos.campfires;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class FabricNemosCampfiresClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
    }
}
