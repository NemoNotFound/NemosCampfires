package com.nemonotfound.nemos.campfires.client.data.models.model;

import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemos.campfires.Constants.MOD_ID;
import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;

public class CampfiresTextureMapping {

    public static TextureMapping campfire(Block campfireVariant, Block campfire) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(campfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, getBlockTexture(campfire, "_fire"))
                .put(CampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping cobblestoneCampfire() {
        return new TextureMapping()
                .put(CampfiresTextureSlot.CAMPFIRE_EMBER, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/campfire_ember"))
                .put(TextureSlot.FIRE, ResourceLocation.withDefaultNamespace("block/campfire_fire"));
    }

    public static TextureMapping copperCampfire(Block copperCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(copperCampfireVariant, campfireVariant, "copper_campfire_fire");
    }

    public static TextureMapping redstoneCampfire(Block redstoneCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(redstoneCampfireVariant, campfireVariant, "redstone_campfire_fire");
    }

    public static TextureMapping lapisCampfire(Block lapisCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(lapisCampfireVariant, campfireVariant, "lapis_campfire_fire");
    }

    public static TextureMapping quartzCampfire(Block quartzCampfireVariant, Block campfireVariant) {
        return customFlameCampfire(quartzCampfireVariant, campfireVariant, "quartz_campfire_fire");
    }

    public static TextureMapping cobblestoneCopperCampfire() {
        return customFlameCobblestoneCampfire("copper_campfire_ember", "copper_campfire_fire");
    }

    public static TextureMapping cobblestoneRedstoneCampfire() {
        return customFlameCobblestoneCampfire("redstone_campfire_ember", "redstone_campfire_fire");
    }

    public static TextureMapping cobblestoneLapisCampfire() {
        return customFlameCobblestoneCampfire("lapis_campfire_ember", "lapis_campfire_fire");
    }

    public static TextureMapping cobblestoneQuartzCampfire() {
        return customFlameCobblestoneCampfire("quartz_campfire_ember", "quartz_campfire_fire");
    }

    public static TextureMapping soulCampfire(Block soulCampfireVariant, Block campfireVariant, Block campfire) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(soulCampfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, getBlockTexture(campfire, "_fire"))
                .put(CampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping cobblestoneSoulCampfire() {
        return new TextureMapping()
                .put(CampfiresTextureSlot.CAMPFIRE_EMBER, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/soul_campfire_ember"))
                .put(TextureSlot.FIRE, ResourceLocation.withDefaultNamespace("block/soul_campfire_fire"));
    }

    public static TextureMapping campfireOff(Block campfireVariant) {
        return new TextureMapping()
                .put(CampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    private static TextureMapping customFlameCampfire(Block customFlameCampfireVariant, Block campfireVariant, String firePath) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(customFlameCampfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + firePath))
                .put(CampfiresTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    private static TextureMapping customFlameCobblestoneCampfire(String campfireEmberPath, String firePath) {
        return new TextureMapping()
                .put(CampfiresTextureSlot.CAMPFIRE_EMBER, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + campfireEmberPath))
                .put(TextureSlot.FIRE, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + firePath));
    }
}
