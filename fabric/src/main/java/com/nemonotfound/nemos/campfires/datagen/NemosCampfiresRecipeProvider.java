package com.nemonotfound.nemos.campfires.datagen;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class NemosCampfiresRecipeProvider extends FabricRecipeProvider {

    public NemosCampfiresRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                createCampfireRecipe(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), ItemTags.ACACIA_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), ItemTags.BIRCH_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), ItemTags.CHERRY_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), ItemTags.PALE_OAK_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), ItemTags.CRIMSON_STEMS);
                createCampfireRecipe(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), ItemTags.DARK_OAK_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), ItemTags.JUNGLE_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), ItemTags.MANGROVE_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), ItemTags.SPRUCE_LOGS);
                createCampfireRecipe(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), ItemTags.WARPED_STEMS);

                createSoulCampfireRecipe(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), ItemTags.ACACIA_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), ItemTags.BIRCH_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), ItemTags.CHERRY_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), ItemTags.PALE_OAK_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), ItemTags.CRIMSON_STEMS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), ItemTags.DARK_OAK_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), ItemTags.JUNGLE_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), ItemTags.MANGROVE_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), ItemTags.SPRUCE_LOGS);
                createSoulCampfireRecipe(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), ItemTags.WARPED_STEMS);

                createCopperCampfireRecipe(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), ItemTags.ACACIA_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), ItemTags.BIRCH_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), ItemTags.CHERRY_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), ItemTags.PALE_OAK_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), ItemTags.CRIMSON_STEMS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), ItemTags.DARK_OAK_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), ItemTags.JUNGLE_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), ItemTags.MANGROVE_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), ItemTags.OAK_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), ItemTags.SPRUCE_LOGS);
                createCopperCampfireRecipe(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), ItemTags.WARPED_STEMS);

                createRedstoneCampfireRecipe(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get(), ItemTags.ACACIA_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get(), ItemTags.BIRCH_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get(), ItemTags.CHERRY_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get(), ItemTags.PALE_OAK_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get(), ItemTags.CRIMSON_STEMS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get(), ItemTags.DARK_OAK_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get(), ItemTags.JUNGLE_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get(), ItemTags.MANGROVE_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get(), ItemTags.OAK_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get(), ItemTags.SPRUCE_LOGS);
                createRedstoneCampfireRecipe(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get(), ItemTags.WARPED_STEMS);

                createLapisCampfireRecipe(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get(), ItemTags.ACACIA_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get(), ItemTags.BIRCH_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get(), ItemTags.CHERRY_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get(), ItemTags.PALE_OAK_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get(), ItemTags.CRIMSON_STEMS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get(), ItemTags.DARK_OAK_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get(), ItemTags.JUNGLE_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get(), ItemTags.MANGROVE_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get(), ItemTags.OAK_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get(), ItemTags.SPRUCE_LOGS);
                createLapisCampfireRecipe(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get(), ItemTags.WARPED_STEMS);

                createQuartzCampfireRecipe(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get(), ItemTags.ACACIA_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get(), ItemTags.BIRCH_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get(), ItemTags.CHERRY_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get(), ItemTags.PALE_OAK_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get(), ItemTags.CRIMSON_STEMS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get(), ItemTags.DARK_OAK_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get(), ItemTags.JUNGLE_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get(), ItemTags.MANGROVE_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get(), ItemTags.OAK_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get(), ItemTags.SPRUCE_LOGS);
                createQuartzCampfireRecipe(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get(), ItemTags.WARPED_STEMS);
            }

            private void createCampfireRecipe(Block result, TagKey<Item> log) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log)
                        .define('S', Items.STICK)
                        .define('C', ItemTags.COALS)
                        .pattern(" S ")
                        .pattern("SCS")
                        .pattern("LLL")
                        .unlockedBy("has_stick", has(Items.STICK))
                        .unlockedBy("has_coal", has(ItemTags.COALS))
                        .group("campfires")
                        .save(this.output);
            }

            private void createCopperCampfireRecipe(Block result, TagKey<Item> log) {
                createCampfireRecipe(result, log, Items.COPPER_INGOT, "copper_campfires");
            }

            private void createRedstoneCampfireRecipe(Block result, TagKey<Item> log) {
                createCampfireRecipe(result, log, Items.REDSTONE, "redstone_campfires");
            }

            private void createLapisCampfireRecipe(Block result, TagKey<Item> log) {
                createCampfireRecipe(result, log, Items.LAPIS_LAZULI, "lapis_campfires");
            }

            private void createQuartzCampfireRecipe(Block result, TagKey<Item> log) {
                createCampfireRecipe(result, log, Items.QUARTZ, "quartz_campfires");
            }

            private void createSoulCampfireRecipe(Block result, TagKey<Item> log) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log)
                        .define('S', Items.STICK)
                        .define('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                        .pattern(" S ")
                        .pattern("S#S")
                        .pattern("LLL")
                        .unlockedBy("has_soul_sand", has(ItemTags.SOUL_FIRE_BASE_BLOCKS))
                        .group("soul_campfires")
                        .save(this.output);
            }

            private void createCampfireRecipe(Block result, TagKey<Item> log, Item fuelItem, String group) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log)
                        .define('S', Items.STICK)
                        .define('#', fuelItem)
                        .pattern(" S ")
                        .pattern("S#S")
                        .pattern("LLL")
                        .unlockedBy(getHasName(fuelItem), has(fuelItem))
                        .group(group)
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Campfires Recipes";
    }
}
