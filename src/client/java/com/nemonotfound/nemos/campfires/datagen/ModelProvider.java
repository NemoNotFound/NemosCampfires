package com.nemonotfound.nemos.campfires.datagen;

import com.nemonotfound.nemos.campfires.client.data.models.model.CampfiresModelTemplates;
import com.nemonotfound.nemos.campfires.client.data.models.model.CampfiresTextureMapping;
import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jspecify.annotations.NonNull;

import static net.minecraft.client.data.models.BlockModelGenerators.*;

public class ModelProvider extends FabricModelProvider {

    private static final PropertyDispatch<VariantMutator> ROTATION_HORIZONTAL_FACING_ALT = PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING).select(Direction.SOUTH, NOP).select(Direction.WEST, Y_ROT_90).select(Direction.NORTH, Y_ROT_180).select(Direction.EAST, Y_ROT_270);

    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockStateModelGenerator) {
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_CAMPFIRE, NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_CAMPFIRE, NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_CAMPFIRE, NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_CAMPFIRE, NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE);

        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE, Blocks.CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
        createCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE);

        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE, Blocks.CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
        createRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE);

        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE, Blocks.CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
        createLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE);

        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.ACACIA_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.BIRCH_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.CHERRY_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.PALE_OAK_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.CRIMSON_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.DARK_OAK_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.JUNGLE_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.MANGROVE_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE, Blocks.CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.SPRUCE_CAMPFIRE);
        createQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE, NemosCampfiresBlocks.WARPED_CAMPFIRE);

        createCobblestoneCampfires(blockStateModelGenerator, NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE,  NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE);
        createCobblestoneCopperCampfire(blockStateModelGenerator, NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE);
        createCobblestoneRedstoneCampfire(blockStateModelGenerator, NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE);
        createCobblestoneLapisCampfire(blockStateModelGenerator, NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE);
        createCobblestoneQuartzCampfire(blockStateModelGenerator, NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerator) {
    }

    public final void createCampfires(BlockModelGenerators blockModelGenerators, Block campfireVariant, Block soulCampfireVariant) {
        var cmapfireMultiVariant = plainVariant(CampfiresModelTemplates.CAMPFIRE.create(campfireVariant, CampfiresTextureMapping.campfire(campfireVariant, Blocks.CAMPFIRE), blockModelGenerators.modelOutput));
        var soulCampfireMultiVariant =  plainVariant(CampfiresModelTemplates.CAMPFIRE.create(soulCampfireVariant, CampfiresTextureMapping.soulCampfire(soulCampfireVariant, campfireVariant, Blocks.SOUL_CAMPFIRE), blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(CampfiresModelTemplates.CAMPFIRE_OFF.createWithSuffix(campfireVariant, "_off", CampfiresTextureMapping.campfireOff(campfireVariant), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, campfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
        createCampfire(blockModelGenerators, soulCampfireVariant, soulCampfireMultiVariant, campfireOffMultiVariant);
    }

    public final void createCobblestoneCampfires(BlockModelGenerators blockModelGenerators, Block campfireVariant, Block soulCampfireVariant) {
        var cmapfireMultiVariant = plainVariant(CampfiresModelTemplates.COBBLESTONE_CAMPFIRE.create(campfireVariant, CampfiresTextureMapping.cobblestoneCampfire(), blockModelGenerators.modelOutput));
        var soulCampfireMultiVariant =  plainVariant(CampfiresModelTemplates.COBBLESTONE_CAMPFIRE.create(soulCampfireVariant, CampfiresTextureMapping.cobblestoneSoulCampfire(), blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(CampfiresModelTemplates.COBBLESTONE_CAMPFIRE_OFF.createWithSuffix(campfireVariant, "_off", new TextureMapping(), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, campfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
        createCampfire(blockModelGenerators, soulCampfireVariant, soulCampfireMultiVariant, campfireOffMultiVariant);
    }

    public final void createCopperCampfire(BlockModelGenerators blockModelGenerators, Block copperCampfireVariant, Block campfireVariant) {
        createCustomFlameCampfire(blockModelGenerators, copperCampfireVariant, campfireVariant, CampfiresTextureMapping.copperCampfire(copperCampfireVariant, campfireVariant));
    }

    public final void createCobblestoneCopperCampfire(BlockModelGenerators blockModelGenerators, Block copperCampfireVariant) {
        createCustomFlameCobblestoneCampfire(blockModelGenerators, copperCampfireVariant, CampfiresTextureMapping.cobblestoneCopperCampfire());
    }

    public final void createRedstoneCampfire(BlockModelGenerators blockModelGenerators, Block redstoneCampfireVariant, Block campfireVariant) {
        createCustomFlameCampfire(blockModelGenerators, redstoneCampfireVariant, campfireVariant, CampfiresTextureMapping.redstoneCampfire(redstoneCampfireVariant, campfireVariant));
    }

    public final void createCobblestoneRedstoneCampfire(BlockModelGenerators blockModelGenerators, Block redstoneCampfireVariant) {
        createCustomFlameCobblestoneCampfire(blockModelGenerators, redstoneCampfireVariant, CampfiresTextureMapping.cobblestoneRedstoneCampfire());
    }

    public final void createLapisCampfire(BlockModelGenerators blockModelGenerators, Block lapisCampfireVariant, Block campfireVariant) {
        createCustomFlameCampfire(blockModelGenerators, lapisCampfireVariant, campfireVariant, CampfiresTextureMapping.lapisCampfire(lapisCampfireVariant, campfireVariant));
    }

    public final void createCobblestoneLapisCampfire(BlockModelGenerators blockModelGenerators, Block lapisCampfireVariant) {
        createCustomFlameCobblestoneCampfire(blockModelGenerators, lapisCampfireVariant, CampfiresTextureMapping.cobblestoneLapisCampfire());
    }

    public final void createQuartzCampfire(BlockModelGenerators blockModelGenerators, Block quartzCampfireVariant, Block campfireVariant) {
        createCustomFlameCampfire(blockModelGenerators, quartzCampfireVariant, campfireVariant, CampfiresTextureMapping.quartzCampfire(quartzCampfireVariant, campfireVariant));
    }

    public final void createCobblestoneQuartzCampfire(BlockModelGenerators blockModelGenerators, Block quartzCampfireVariant) {
        createCustomFlameCobblestoneCampfire(blockModelGenerators, quartzCampfireVariant, CampfiresTextureMapping.cobblestoneQuartzCampfire());
    }

    private void createCustomFlameCampfire(BlockModelGenerators blockModelGenerators, Block customFlameCampfireVariant, Block campfireVariant, TextureMapping textureMapping) {
        var cmapfireMultiVariant = plainVariant(CampfiresModelTemplates.CAMPFIRE.create(customFlameCampfireVariant, textureMapping, blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(CampfiresModelTemplates.CAMPFIRE_OFF.createWithSuffix(customFlameCampfireVariant, "_off", CampfiresTextureMapping.campfireOff(campfireVariant), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, customFlameCampfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
    }

    private void createCustomFlameCobblestoneCampfire(BlockModelGenerators blockModelGenerators, Block customFlameCampfireVariant, TextureMapping textureMapping) {
        var cmapfireMultiVariant = plainVariant(CampfiresModelTemplates.COBBLESTONE_CAMPFIRE.create(customFlameCampfireVariant, textureMapping, blockModelGenerators.modelOutput));
        var campfireOffMultiVariant =  plainVariant(CampfiresModelTemplates.COBBLESTONE_CAMPFIRE_OFF.createWithSuffix(customFlameCampfireVariant, "_off", new TextureMapping(), blockModelGenerators.modelOutput));

        createCampfire(blockModelGenerators, customFlameCampfireVariant, cmapfireMultiVariant, campfireOffMultiVariant);
    }

    private void createCampfire(BlockModelGenerators blockModelGenerators, Block campfireVariant, MultiVariant campfireMultiVariant, MultiVariant campfireOffMultiVariant) {
        blockModelGenerators.registerSimpleFlatItemModel(campfireVariant.asItem());
        blockModelGenerators.blockStateOutput
                .accept(MultiVariantGenerator.dispatch(campfireVariant)
                        .with(createBooleanModelDispatch(BlockStateProperties.LIT, campfireMultiVariant, campfireOffMultiVariant))
                        .with(ROTATION_HORIZONTAL_FACING_ALT));
    }
}
