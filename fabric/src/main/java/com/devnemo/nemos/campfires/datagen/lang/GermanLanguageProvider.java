package com.devnemo.nemos.campfires.datagen.lang;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class GermanLanguageProvider extends FabricLanguageProvider {

    public GermanLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), "Akazienlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), "Birkenlagerfeuer");
        translationBuilder.add(Blocks.CAMPFIRE, "Eichenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), "Kirschlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), "Blasseichenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), "Karmesinlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), "Schwarzeichenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), "Tropenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), "Mangrovenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), "Fichtenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), "Wirrlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), "Akazienseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), "Birkenseelenlagerfeuer");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Eichenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), "Kirschseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), "Blasseichenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), "Karmesinseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), "Schwarzeichenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), "Tropenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), "Mangrovenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), "Fichtenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), "Wirrseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), "Akazienkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), "Birkenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), "Kirschkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), "Blasseichenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), "Karmesinkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), "Schwarzeichenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), "Tropenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), "Mangrovenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), "Eichenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), "Fichtenkupferlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), "Wirrkupferlagerfeuer");
    }
}
