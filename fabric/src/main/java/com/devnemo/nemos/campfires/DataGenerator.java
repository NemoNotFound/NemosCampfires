package com.devnemo.nemos.campfires;

import com.devnemo.nemos.campfires.datagen.BlockTagProvider;
import com.devnemo.nemos.campfires.datagen.LootTableProvider;
import com.devnemo.nemos.campfires.datagen.ModelProvider;
import com.devnemo.nemos.campfires.datagen.NemosCampfiresRecipeProvider;
import com.devnemo.nemos.campfires.datagen.lang.EnglishLanguageProvider;
import com.devnemo.nemos.campfires.datagen.lang.GermanLanguageProvider;
import com.devnemo.nemos.campfires.datagen.lang.RussianLanguageProvider;
import com.devnemo.nemos.campfires.datagen.lang.UkranianLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(GermanLanguageProvider::new);
        pack.addProvider(RussianLanguageProvider::new);
        pack.addProvider(UkranianLanguageProvider::new);
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(LootTableProvider::new);
        pack.addProvider(NemosCampfiresRecipeProvider::new);
        pack.addProvider(ModelProvider::new);
    }
}
