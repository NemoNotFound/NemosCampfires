package com.nemonotfound.nemos.campfires.datagen.lang;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.campfires.NemosCampfires.MOD_ID;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE, "Acacia Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE, "Birch Campfire");
        translationBuilder.add(Blocks.CAMPFIRE, "Oak Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE, "Cherry Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE, "Pale Oak Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE, "Crimson Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE, "Dark Oak Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE, "Jungle Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE, "Mangrove Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE, "Spruce Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE, "Warped Campfire");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE, "Cobblestone Campfire");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE, "Acacia Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE, "Birch Soul Campfire");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Oak Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE, "Cherry Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE, "Pale Oak Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE, "Crimson Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE, "Dark Oak Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE, "Jungle Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE, "Mangrove Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE, "Spruce Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE, "Warped Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE, "Cobblestone Soul Campfire");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE, "Acacia Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE, "Birch Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE, "Cherry Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE, "Pale Oak Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE, "Crimson Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE, "Dark Oak Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE, "Jungle Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE, "Mangrove Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE, "Oak Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE, "Spruce Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE, "Warped Copper Campfire");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE, "Cobblestone Copper Campfire");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE, "Acacia Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE, "Birch Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE, "Cherry Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE, "Pale Oak Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE, "Crimson Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE, "Dark Oak Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE, "Jungle Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE, "Mangrove Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE, "Oak Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE, "Spruce Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE, "Warped Redstone Campfire");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE, "Cobblestone Redstone Campfire");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE, "Acacia Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE, "Birch Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE, "Cherry Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE, "Pale Oak Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE, "Crimson Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE, "Dark Oak Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE, "Jungle Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE, "Mangrove Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE, "Oak Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE, "Spruce Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE, "Warped Lapis Lazuli Campfire");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE, "Cobblestone Lapis Lazuli Campfire");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE, "Acacia Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE, "Birch Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE, "Cherry Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE, "Pale Oak Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE, "Crimson Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE, "Dark Oak Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE, "Jungle Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE, "Mangrove Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE, "Oak Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE, "Spruce Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE, "Warped Quartz Campfire");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE, "Cobblestone Quartz Campfire");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Campfires");
    }
}
