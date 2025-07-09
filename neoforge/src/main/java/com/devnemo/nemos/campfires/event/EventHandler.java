package com.devnemo.nemos.campfires.event;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;

import static com.devnemo.nemos.campfires.Constants.MOD_ID;

@EventBusSubscriber(modid = MOD_ID)
public class EventHandler {
    
    @SubscribeEvent
    public static void onBlockEntityTypeAddBlockEvent(BlockEntityTypeAddBlocksEvent event) {
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get());
    }
}
