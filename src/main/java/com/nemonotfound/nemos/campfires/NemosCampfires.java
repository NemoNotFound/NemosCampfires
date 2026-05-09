package com.nemonotfound.nemos.campfires;

import com.nemonotfound.nemos.campfires.world.item.CampfiresCreativeModeTabs;
import com.nemonotfound.nemos.campfires.world.item.NemosCampfiresItems;
import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosCampfires implements ModInitializer {

    public static final String MOD_ID = "nemos_campfires";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("This flame looks so beautiful.. I'd like to touch it.. OUCH!");

        NemosCampfiresBlocks.init();
        NemosCampfiresItems.init();
        CampfiresCreativeModeTabs.init();

        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.ACACIA_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.BIRCH_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CHERRY_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.WARPED_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE);

        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE);

        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE);

        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE);

        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE);

        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addValidBlock(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE);
    }
}
