package com.nemonotfound.nemos.campfires.client.data.models.model;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

import static com.nemonotfound.nemos.campfires.Constants.MOD_ID;

public class CampfiresModelTemplates {

    public static final ModelTemplate CAMPFIRE = createVanilla("template_campfire", TextureSlot.FIRE, TextureSlot.LIT_LOG, CampfiresTextureSlot.LOG, TextureSlot.PARTICLE);
    public static final ModelTemplate CAMPFIRE_OFF = createVanilla("campfire_off", CampfiresTextureSlot.LOG, TextureSlot.PARTICLE);
    public static final ModelTemplate COBBLESTONE_CAMPFIRE = createModded("template_cobblestone_campfire", TextureSlot.FIRE, CampfiresTextureSlot.CAMPFIRE_EMBER);
    public static final ModelTemplate COBBLESTONE_CAMPFIRE_OFF = createModded("template_cobblestone_campfire_off");

    private static ModelTemplate createVanilla(String path, TextureSlot... textureSlots) {
        return create("minecraft", path, textureSlots);
    }

    private static ModelTemplate createModded(String path, TextureSlot... textureSlots) {
        return create(MOD_ID, path, textureSlots);
    }

    private static ModelTemplate create(String namespace, String path, TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(namespace,"block/" + path)), Optional.empty(), textureSlots);
    }
}
