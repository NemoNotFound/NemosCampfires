package com.devnemo.nemos.campfires.datagen.lang;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.campfires.Constants.MOD_ID;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), "Acacia Campfire");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), "Acacia Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), "Birch Campfire");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), "Birch Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), "Cherry Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), "Cherry Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), "Pale Oak Campfire");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), "Pale Oak Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), "Crimson Campfire");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), "Crimson Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), "Dark Oak Campfire");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), "Dark Oak Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), "Jungle Campfire");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), "Jungle Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), "Mangrove Campfire");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), "Mangrove Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), "Spruce Campfire");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), "Spruce Soul Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), "Warped Campfire");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), "Warped Soul Campfire");
        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Campfires");
    }
}
