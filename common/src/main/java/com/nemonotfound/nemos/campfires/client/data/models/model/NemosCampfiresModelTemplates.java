package com.nemonotfound.nemos.campfires.client.data.models.model;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class NemosCampfiresModelTemplates {

    public static final ModelTemplate CAMPFIRE = create("template_campfire", TextureSlot.FIRE, TextureSlot.LIT_LOG, NemosCampfiresTextureSlot.LOG, TextureSlot.PARTICLE);
    public static final ModelTemplate CAMPFIRE_OFF = create("campfire_off", NemosCampfiresTextureSlot.LOG, TextureSlot.PARTICLE);

    private static ModelTemplate create(String string, TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/" + string)), Optional.empty(), textureSlots);
    }
}
