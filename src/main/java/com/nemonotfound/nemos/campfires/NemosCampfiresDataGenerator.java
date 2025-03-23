package com.nemonotfound.nemos.campfires;

import com.nemonotfound.nemos.campfires.datagen.BlockTagProvider;
import com.nemonotfound.nemos.campfires.datagen.LootTableProvider;
import com.nemonotfound.nemos.campfires.datagen.ModRecipeProvider;
import com.nemonotfound.nemos.campfires.datagen.langdatagen.EnglishLanguageProvider;
import com.nemonotfound.nemos.campfires.datagen.langdatagen.GermanLanguageProvider;
import com.nemonotfound.nemos.campfires.datagen.langdatagen.RussianLanguageProvider;
import com.nemonotfound.nemos.campfires.datagen.langdatagen.UkranianLanguageProvider;
import com.nemonotfound.nemos.campfires.datagen.modelgen.ModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosCampfiresDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(GermanLanguageProvider::new);
		pack.addProvider(RussianLanguageProvider::new);
		pack.addProvider(UkranianLanguageProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
