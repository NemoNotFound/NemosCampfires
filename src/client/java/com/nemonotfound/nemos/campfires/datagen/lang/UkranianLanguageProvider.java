package com.nemonotfound.nemos.campfires.datagen.lang;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class UkranianLanguageProvider extends FabricLanguageProvider {

    public UkranianLanguageProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("modmenu.descriptionTranslation.nemos-campfires", "Додає більше варіантів багаття");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE, "Акацієве багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE, "Березове багаття");
        translationBuilder.add(Blocks.CAMPFIRE, "Дубове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE, "Вишневе багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE, "Блідо-дубове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE, "Багряне багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE, "Темно-дубове багаття");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE, "Тропічне багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE, "Мангрове багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE, "Смерекове багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE, "Химерне багаття");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE, "Багаття з бруківки");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE, "Акацієве багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE, "Березове багаття душ");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Дубове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE, "Вишневе багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE, "Блідо-дубове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE, "Багряне багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE, "Темно-дубове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE, "Тропічне багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE, "Мангрове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE, "Смерекове багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE, "Химерне багаття душ");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE, "Багаття душ з бруківки");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE, "Акацієве мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE, "Березове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE, "Вишневе мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE, "Блідо-дубове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE, "Багряне мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE, "Темно-дубове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE, "Тропічне мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE, "Мангрове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE, "Дубове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE, "Смерекове мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE, "Химерне мідне багаття");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE, "Мідне багаття з бруківки");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE, "Акацієве редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE, "Березове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE, "Вишневе редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE, "Редстоунове багаття з блідого дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE, "Багряне редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE, "Редстоунове багаття з темного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE, "Тропічне редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE, "Мангрове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE, "Дубове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE, "Смерекове редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE, "Химерне редстоунове багаття");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE, "Редстоунове багаття з бруківки");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE, "Акацієве лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE, "Березове лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE, "Вишневе лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE, "Лазуритове багаття з блідого дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE, "Багряне лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE, "Лазуритове багаття з темного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE, "Тропічне лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE, "Мангрове лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE, "Дубове лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE, "Смерекове лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE, "Химерне лазуритове багаття");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE, "Лазуритове багаття з бруківки");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE, "Акацієве кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE, "Березове кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE, "Вишневе кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE, "Кварцове багаття з блідого дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE, "Багряне кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE, "Кварцове багаття з темного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE, "Тропічне кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE, "Мангрове кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE, "Дубове кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE, "Смерекове кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE, "Химерне кварцове багаття");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE, "Кварцове багаття з бруківки");
    }
}
