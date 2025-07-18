package com.devnemo.nemos.campfires.event;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static com.devnemo.nemos.campfires.Constants.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class ClientEventHandler {
    
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
    }
}
