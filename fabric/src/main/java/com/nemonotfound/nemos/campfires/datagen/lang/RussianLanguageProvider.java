package com.nemonotfound.nemos.campfires.datagen.lang;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class RussianLanguageProvider extends FabricLanguageProvider {

    public RussianLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), "Акациевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), "Берёзовый костёр");
        translationBuilder.add(Blocks.CAMPFIRE, "Дубовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), "Вишнёвый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), "Костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), "Багровый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), "Костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), "Костёр из тропического дерева");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), "Костёр душ из тропического дерева");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), "Мангровый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), "Еловый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), "Искажённый костёр");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), "Акациевый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), "Берёзовый костёр душ");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Дубовый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), "Вишнёвый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), "Костёр душ из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), "Багровый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), "Костёр душ из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), "Мангровый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), "Еловый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), "Искажённый костёр душ");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), "Акациевый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), "Берёзовый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), "Вишнёвый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), "Медный костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), "Багровый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), "Медный костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), "Мангровый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), "Дубовый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), "Еловый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), "Искажённый медный костёр");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get(), "Акациевый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get(), "Берёзовый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get(), "Вишнёвый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get(), "Редстоуновый костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get(), "Багровый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get(), "Редстоуновый костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get(), "Тропический редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get(), "Мангровый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get(), "Дубовый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get(), "Еловый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get(), "Искажённый редстоуновый костёр");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get(), "Акациевый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get(), "Берёзовый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get(), "Вишнёвый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get(), "Лазуритовый костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get(), "Багровый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get(), "Лазуритовый костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get(), "Тропический лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get(), "Мангровый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get(), "Дубовый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get(), "Еловый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get(), "Искажённый лазуритовый костёр");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get(), "Акациевый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get(), "Берёзовый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get(), "Вишнёвый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get(), "Кварцевый костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get(), "Багровый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get(), "Кварцевый костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get(), "Тропический кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get(), "Мангровый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get(), "Дубовый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get(), "Еловый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get(), "Искажённый кварцевый костёр");

    }
}
