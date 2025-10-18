package com.devnemo.nemos.campfires.datagen.lang;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class UkranianLanguageProvider extends FabricLanguageProvider {

    public UkranianLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("modmenu.descriptionTranslation.nemos-campfires", "Додає більше варіантів багаття");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), "Акацієве багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), "Березове багаття");
        translationBuilder.add(Blocks.CAMPFIRE, "Дубове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), "Вишневе багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), "Блідо-дубове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), "Багряне багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), "Темно-дубове багаття");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), "Тропічне багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), "Мангрове багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), "Смерекове багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), "Химерне багаття");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), "Акацієве багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), "Березове багаття душ");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Дубове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), "Вишневе багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), "Блідо-дубове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), "Багряне багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), "Темно-дубове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), "Тропічне багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), "Мангрове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), "Смерекове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), "Химерне багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), "Акацієве мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), "Березове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), "Вишневе мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), "Блідо-дубове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), "Багряне мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), "Темно-дубове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), "Тропічне мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), "Мангрове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), "Дубове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), "Смерекове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), "Химерне мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get(), "Акацієве редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get(), "Березове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get(), "Вишневе редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get(), "Редстоунове багаття з блідого дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get(), "Багряне редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get(), "Редстоунове багаття з темного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get(), "Тропічне редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get(), "Мангрове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get(), "Дубове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get(), "Смерекове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get(), "Химерне редстоунове багаття");
        //TODO: Add Lapis
    }
}
