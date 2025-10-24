package com.nemonotfound.nemos.campfires.event;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static com.nemonotfound.nemos.campfires.Constants.MOD_ID;

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
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);

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
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE.get(), ChunkSectionLayer.CUTOUT);
    }
}
