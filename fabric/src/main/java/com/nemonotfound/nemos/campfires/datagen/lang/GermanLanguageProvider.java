package com.nemonotfound.nemos.campfires.datagen.lang;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
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
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE.get(), "Bruchsteinlagerfeuer");

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
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE.get(), "Bruchsteinseelenlagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), "Akazien-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), "Birken-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), "Kirsch-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), "Blasseichen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), "Karmesin-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), "Schwarzeichen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), "Tropen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), "Mangroven-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), "Eichen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), "Fichten-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), "Wirr-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE.get(), "Bruchstein-Kupfer-Lagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get(), "Akazien-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get(), "Birken-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get(), "Kirsch-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get(), "Blasseichen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get(), "Karmesin-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get(), "Schwarzeichen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get(), "Tropen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get(), "Mangroven-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get(), "Eichen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get(), "Fichten-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get(), "Wirr--Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE.get(), "Bruchstein-Redstone-Lagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get(), "Akazien-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get(), "Birken-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get(), "Kirsch-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get(), "Lapis-Lagerfeuer aus hellem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get(), "Karmesinrotes Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get(), "Lapis-Lagerfeuer aus dunklem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get(), "Tropenholz-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get(), "Mangroven-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get(), "Eichen-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get(), "Fichten-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get(), "Wirrpilz-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE.get(), "Bruchstein-Lapis-Lagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get(), "Akazien-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get(), "Birken-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get(), "Kirsch-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get(), "Quarz-Lagerfeuer aus hellem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get(), "Karmesinrotes Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get(), "Quarz-Lagerfeuer aus dunklem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get(), "Tropenholz-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get(), "Mangroven-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get(), "Eichen-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get(), "Fichten-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get(), "Wirrpilz-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE.get(), "Bruchstein-Quarz-Lagerfeuer");
    }
}
