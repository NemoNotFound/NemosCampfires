package com.nemonotfound.nemos.campfires.client.data.models.model;

import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemos.campfires.Constants.MOD_ID;
import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;

public class NemosCampfiresTextureMapping {

    public static TextureMapping campfire(Block campfireVariant, Block campfire) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(campfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, getBlockTexture(campfire, "_fire"))
                .put(NemosCampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping copperCampfire(Block copperCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(copperCampfireVariant, campfireVariant, "copper_campfire_fire");
    }

    public static TextureMapping redstoneCampfire(Block copperCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(copperCampfireVariant, campfireVariant, "redstone_campfire_fire");
    }

    public static TextureMapping lapisCampfire(Block copperCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(copperCampfireVariant, campfireVariant, "lapis_campfire_fire");
    }

    public static TextureMapping quartzCampfire(Block copperCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(copperCampfireVariant, campfireVariant, "quartz_campfire_fire");
    }

    private static TextureMapping customFlameCampfire(Block customFlameCampfireVariant, Block campfireVariant, String firePath) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(customFlameCampfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + firePath))
                .put(NemosCampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping soulCampfire(Block soulCampfireVariant, Block campfireVariant, Block campfire) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(soulCampfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, getBlockTexture(campfire, "_fire"))
                .put(NemosCampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping campfireOff(Block campfireVariant) {
        return new TextureMapping()
                .put(NemosCampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }
}
