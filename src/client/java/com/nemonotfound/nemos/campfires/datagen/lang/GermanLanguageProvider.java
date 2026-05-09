package com.nemonotfound.nemos.campfires.datagen.lang;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class GermanLanguageProvider extends FabricLanguageProvider {

    public GermanLanguageProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE, "Akazienlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE, "Birkenlagerfeuer");
        translationBuilder.add(Blocks.CAMPFIRE, "Eichenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE, "Kirschlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE, "Blasseichenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE, "Karmesinlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE, "Schwarzeichenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE, "Tropenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE, "Mangrovenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE, "Fichtenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE, "Wirrlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE, "Bruchsteinlagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE, "Akazienseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE, "Birkenseelenlagerfeuer");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Eichenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE, "Kirschseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE, "Blasseichenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE, "Karmesinseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE, "Schwarzeichenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE, "Tropenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE, "Mangrovenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE, "Fichtenseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE, "Wirrseelenlagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE, "Bruchsteinseelenlagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE, "Akazien-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE, "Birken-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE, "Kirsch-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE, "Blasseichen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE, "Karmesin-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE, "Schwarzeichen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE, "Tropen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE, "Mangroven-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE, "Eichen-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE, "Fichten-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE, "Wirr-Kupfer-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE, "Bruchstein-Kupfer-Lagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE, "Akazien-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE, "Birken-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE, "Kirsch-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE, "Blasseichen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE, "Karmesin-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE, "Schwarzeichen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE, "Tropen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE, "Mangroven-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE, "Eichen-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE, "Fichten-Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE, "Wirr--Redstone-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE, "Bruchstein-Redstone-Lagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE, "Akazien-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE, "Birken-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE, "Kirsch-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE, "Lapis-Lagerfeuer aus hellem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE, "Karmesinrotes Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE, "Lapis-Lagerfeuer aus dunklem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE, "Tropenholz-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE, "Mangroven-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE, "Eichen-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE, "Fichten-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE, "Wirrpilz-Lapis-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE, "Bruchstein-Lapis-Lagerfeuer");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE, "Akazien-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE, "Birken-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE, "Kirsch-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE, "Quarz-Lagerfeuer aus hellem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE, "Karmesinrotes Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE, "Quarz-Lagerfeuer aus dunklem Eichenholz");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE, "Tropenholz-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE, "Mangroven-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE, "Eichen-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE, "Fichten-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE, "Wirrpilz-Quarz-Lagerfeuer");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE, "Bruchstein-Quarz-Lagerfeuer");
    }
}
