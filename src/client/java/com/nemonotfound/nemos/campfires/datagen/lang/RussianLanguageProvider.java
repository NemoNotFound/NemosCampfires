package com.nemonotfound.nemos.campfires.datagen.lang;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class RussianLanguageProvider extends FabricLanguageProvider {

    public RussianLanguageProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE, "Акациевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE, "Берёзовый костёр");
        translationBuilder.add(Blocks.CAMPFIRE, "Дубовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE, "Вишнёвый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE, "Костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE, "Багровый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE, "Костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE, "Костёр из тропического дерева");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE, "Костёр душ из тропического дерева");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE, "Мангровый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE, "Еловый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE, "Искажённый костёр");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_CAMPFIRE, "Костёр из булыжника");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE, "Акациевый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE, "Берёзовый костёр душ");
        translationBuilder.add(Blocks.SOUL_CAMPFIRE, "Дубовый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE, "Вишнёвый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE, "Костёр душ из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE, "Багровый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE, "Костёр душ из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE, "Мангровый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE, "Еловый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE, "Искажённый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_SOUL_CAMPFIRE, "Костёр душ из булыжника");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE, "Акациевый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE, "Берёзовый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE, "Вишнёвый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE, "Медный костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE, "Багровый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE, "Медный костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE, "Мангровый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE, "Дубовый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE, "Еловый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE, "Искажённый медный костёр");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_COPPER_CAMPFIRE, "Медный костёр из булыжника");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE, "Акациевый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE, "Берёзовый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE, "Вишнёвый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE, "Редстоуновый костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE, "Багровый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE, "Редстоуновый костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE, "Тропический редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE, "Мангровый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE, "Дубовый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE, "Еловый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE, "Искажённый редстоуновый костёр");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_REDSTONE_CAMPFIRE, "Редстоуновый костёр из булыжника");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE, "Акациевый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE, "Берёзовый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE, "Вишнёвый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE, "Лазуритовый костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE, "Багровый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE, "Лазуритовый костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE, "Тропический лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE, "Мангровый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE, "Дубовый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE, "Еловый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE, "Искажённый лазуритовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_LAPIS_CAMPFIRE, "Лазуритовый костёр из булыжника");

        translationBuilder.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE, "Акациевый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE, "Берёзовый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE, "Вишнёвый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE, "Кварцевый костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE, "Багровый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE, "Кварцевый костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE, "Тропический кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE, "Мангровый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE, "Дубовый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE, "Еловый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE, "Искажённый кварцевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.COBBLESTONE_QUARTZ_CAMPFIRE, "Кварцевый костёр из булыжника");
    }
}
