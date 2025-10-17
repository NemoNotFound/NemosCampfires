package com.devnemo.nemos.campfires.datagen;

import com.devnemo.nemos.campfires.client.data.models.model.NemosCampfiresModelTemplates;
import com.devnemo.nemos.campfires.client.data.models.model.NemosCampfiresTextureMapping;
import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static net.minecraft.client.data.models.BlockModelGenerators.*;

public class ModelProvider extends FabricModelProvider {

    private static final PropertyDispatch<VariantMutator> ROTATION_HORIZONTAL_FACING_ALT = PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING).select(Direction.SOUTH, NOP).select(Direction.WEST, Y_ROT_90).select(Direction.NORTH, Y_ROT_180).select(Direction.EAST, Y_ROT_270);

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get());
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.ACACIA_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.BIRCH_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.CHERRY_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), Blocks.CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get());
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), NemosCampfiresBlocks.WARPED_CAMPFIRE.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    public final void createCampfires(BlockModelGenerators blockModelGenerators, Block campfireVariant, Block soulCampfireVariant) {
        var cmapfireMultiVariant = plainVariant(NemosCampfiresModelTemplates.CAMPFIRE.create(campfireVariant, NemosCampfiresTextureMapping.campfire(campfireVariant, Blocks.CAMPFIRE), blockModelGenerators.modelOutput));
        var soulCampfireMultiVariant =  plainVariant(NemosCampfiresModelTemplates.CAMPFIRE.create(soulCampfireVariant, NemosCampfiresTextureMapping.soulCampfire(soulCampfireVariant, campfireVariant, Blocks.SOUL_CAMPFIRE), blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(NemosCampfiresModelTemplates.CAMPFIRE_OFF.createWithSuffix(campfireVariant, "_off", NemosCampfiresTextureMapping.campfireOff(campfireVariant), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, campfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
        createCampfire(blockModelGenerators, soulCampfireVariant, soulCampfireMultiVariant, campfireOffMultiVariant);
    }

    public final void createCopperCampfire(BlockModelGenerators blockModelGenerators, Block copperCampfireVariant, Block campfireVariant) {
        var cmapfireMultiVariant = plainVariant(NemosCampfiresModelTemplates.CAMPFIRE.create(copperCampfireVariant, NemosCampfiresTextureMapping.copperCampfire(copperCampfireVariant, campfireVariant), blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(NemosCampfiresModelTemplates.CAMPFIRE_OFF.createWithSuffix(copperCampfireVariant, "_off", NemosCampfiresTextureMapping.campfireOff(copperCampfireVariant), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, copperCampfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
    }

    private static void createCampfire(BlockModelGenerators blockModelGenerators, Block campfireVariant, MultiVariant campfireMultiVariant, MultiVariant campfireOffMultiVariant) {
        blockModelGenerators.registerSimpleFlatItemModel(campfireVariant.asItem());
        blockModelGenerators.blockStateOutput
                .accept(MultiVariantGenerator.dispatch(campfireVariant)
                        .with(createBooleanModelDispatch(BlockStateProperties.LIT, campfireMultiVariant, campfireOffMultiVariant))
                        .with(ROTATION_HORIZONTAL_FACING_ALT));
    }
}
