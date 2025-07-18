package com.devnemo.nemos.campfires.datagen.lang;

import com.devnemo.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RussianLanguageProvider extends FabricLanguageProvider {

    public RussianLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), "Акациевый костёр");
        translationBuilder.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), "Акациевый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), "Берёзовый костёр");
        translationBuilder.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), "Берёзовый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), "Вишнёвый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), "Вишнёвый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), "Костёр из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), "Костёр душ из бледного дуба");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), "Багровый костёр");
        translationBuilder.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), "Багровый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), "Костёр из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), "Костёр душ из тёмного дуба");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), "Костёр из тропического дерева");
        translationBuilder.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), "Костёр душ из тропического дерева");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), "Мангровый костёр");
        translationBuilder.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), "Мангровый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), "Еловый костёр");
        translationBuilder.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), "Еловый костёр душ");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), "Искажённый костёр");
        translationBuilder.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), "Искажённый костёр душ");
    }
}
