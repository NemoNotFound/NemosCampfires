package com.nemonotfound.nemos.campfires.event;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;

import static com.nemonotfound.nemos.campfires.Constants.MOD_ID;

@EventBusSubscriber(modid = MOD_ID)
public class EventHandler {
    
    @SubscribeEvent
    public static void onBlockEntityTypeAddBlockEvent(BlockEntityTypeAddBlocksEvent event) {
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get());
        event.modify(BlockEntityType.CAMPFIRE, NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get());
    }
}
