package com.devnemo.nemos.campfires.datagen;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
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
            }

            private void createCampfireRecipe(Block result, TagKey<Item> log) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log).define('S', Items.STICK).define('C', ItemTags.COALS)
                        .pattern(" S ").pattern("SCS").pattern("LLL")
                        .unlockedBy("has_stick", has(Items.STICK))
                        .unlockedBy("has_coal", has(ItemTags.COALS))
                        .group("campfires")
                        .save(this.output);
            }

            private void createSoulCampfireRecipe(Block result, TagKey<Item> log) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log).define('S', Items.STICK).define('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                        .pattern(" S ").pattern("S#S").pattern("LLL")
                        .unlockedBy("has_soul_sand", has(ItemTags.SOUL_FIRE_BASE_BLOCKS))
                        .group("soul_campfires")
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Campfires Recipes";
    }
}
