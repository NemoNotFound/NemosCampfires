package com.nemonotfound.nemos.campfires.datagen.langdatagen;

import com.nemonotfound.nemos.campfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class UkranianLanguageProvider extends FabricLanguageProvider {

    public UkranianLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("modmenu.descriptionTranslation.nemos-campfires", "Додає більше варіантів багаття");
        translationBuilder.add(ModBlocks.ACACIA_CAMPFIRE, "Акацієве багаття");
        translationBuilder.add(ModBlocks.ACACIA_SOUL_CAMPFIRE, "Акацієве багаття душ");
        translationBuilder.add(ModBlocks.BIRCH_CAMPFIRE, "Березове багаття");
        translationBuilder.add(ModBlocks.BIRCH_SOUL_CAMPFIRE, "Березове багаття душ");
        translationBuilder.add(ModBlocks.CHERRY_CAMPFIRE, "Вишневе багаття");
        translationBuilder.add(ModBlocks.CHERRY_SOUL_CAMPFIRE, "Вишневе багаття душ");
        translationBuilder.add(ModBlocks.PALE_OAK_CAMPFIRE, "Блідо-дубове багаття");
        translationBuilder.add(ModBlocks.PALE_OAK_SOUL_CAMPFIRE, "Блідо-дубове багаття душ");
        translationBuilder.add(ModBlocks.CRIMSON_CAMPFIRE, "Багряне багаття");
        translationBuilder.add(ModBlocks.CRIMSON_SOUL_CAMPFIRE, "Багряне багаття душ");
        translationBuilder.add(ModBlocks.DARK_OAK_CAMPFIRE, "Темно-дубове багаття");
        translationBuilder.add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, "Темно-дубове багаття душ");
        translationBuilder.add(ModBlocks.JUNGLE_CAMPFIRE, "Тропічне багаття");
        translationBuilder.add(ModBlocks.JUNGLE_SOUL_CAMPFIRE, "Тропічне багаття душ");
        translationBuilder.add(ModBlocks.MANGROVE_CAMPFIRE, "Мангрове багаття");
        translationBuilder.add(ModBlocks.MANGROVE_SOUL_CAMPFIRE, "Мангрове багаття душ");
        translationBuilder.add(ModBlocks.SPRUCE_CAMPFIRE, "Смерекове багаття");
        translationBuilder.add(ModBlocks.SPRUCE_SOUL_CAMPFIRE, "Смерекове багаття душ");
        translationBuilder.add(ModBlocks.WARPED_CAMPFIRE, "Химерне багаття");
        translationBuilder.add(ModBlocks.WARPED_SOUL_CAMPFIRE, "Химерне багаття душ");
    }
}
