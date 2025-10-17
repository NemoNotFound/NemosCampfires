package com.devnemo.nemos.campfires.datagen;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get());

        valueLookupBuilder(BlockTags.CAMPFIRES)
                .add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get())
                .add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get());
    }
}
