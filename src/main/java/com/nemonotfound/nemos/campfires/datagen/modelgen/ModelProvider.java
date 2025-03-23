package com.nemonotfound.nemos.campfires.datagen.modelgen;

import com.nemonotfound.nemos.campfires.block.ModBlocks;
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
        createCampfires(blockStateModelGenerator, ModBlocks.ACACIA_CAMPFIRE, ModBlocks.ACACIA_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.BIRCH_CAMPFIRE, ModBlocks.BIRCH_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.CHERRY_CAMPFIRE, ModBlocks.CHERRY_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.PALE_OAK_CAMPFIRE, ModBlocks.PALE_OAK_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.CRIMSON_CAMPFIRE, ModBlocks.CRIMSON_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.DARK_OAK_CAMPFIRE, ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.JUNGLE_CAMPFIRE, ModBlocks.JUNGLE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.MANGROVE_CAMPFIRE, ModBlocks.MANGROVE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.SPRUCE_CAMPFIRE, ModBlocks.SPRUCE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.WARPED_CAMPFIRE, ModBlocks.WARPED_SOUL_CAMPFIRE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    public final void createCampfires(BlockModelGenerators blockModelGenerators, Block campfireVariant, Block soulCampfireVariant) {
        var cmapfireMultiVariant = plainVariant(ModModelTemplates.CAMPFIRE.create(campfireVariant, ModTextureMapping.campfire(campfireVariant, Blocks.CAMPFIRE), blockModelGenerators.modelOutput));
        var soulCampfireMultiVariant =  plainVariant(ModModelTemplates.CAMPFIRE.create(soulCampfireVariant, ModTextureMapping.soulCampfire(soulCampfireVariant, campfireVariant, Blocks.SOUL_CAMPFIRE), blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(ModModelTemplates.CAMPFIRE_OFF.createWithSuffix(campfireVariant, "_off", ModTextureMapping.campfireOff(campfireVariant), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, campfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
        createCampfire(blockModelGenerators, soulCampfireVariant, soulCampfireMultiVariant, campfireOffMultiVariant);
    }

    private static void createCampfire(BlockModelGenerators blockModelGenerators, Block campfireVariant, MultiVariant campfireMultiVariant, MultiVariant campfireOffMultiVariant) {
        blockModelGenerators.registerSimpleFlatItemModel(campfireVariant.asItem());
        blockModelGenerators.blockStateOutput
                .accept(MultiVariantGenerator.dispatch(campfireVariant)
                        .with(createBooleanModelDispatch(BlockStateProperties.LIT, campfireMultiVariant, campfireOffMultiVariant))
                        .with(ROTATION_HORIZONTAL_FACING_ALT));
    }
}
