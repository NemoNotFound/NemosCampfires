package com.nemonotfound.nemos.campfires.world.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.campfires.NemosCampfires.MOD_ID;

public class CampfiresCreativeModeTabs {

    public static void init() {
        var creativeModeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> new ItemStack(NemosCampfiresItems.SPRUCE_CAMPFIRE))
                .displayItems((_, output) -> {
                    output.accept(NemosCampfiresItems.SPRUCE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.BIRCH_CAMPFIRE);
                    output.accept(NemosCampfiresItems.JUNGLE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.ACACIA_CAMPFIRE);
                    output.accept(NemosCampfiresItems.DARK_OAK_CAMPFIRE);
                    output.accept(NemosCampfiresItems.MANGROVE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CHERRY_CAMPFIRE);
                    output.accept(NemosCampfiresItems.PALE_OAK_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CRIMSON_CAMPFIRE);
                    output.accept(NemosCampfiresItems.WARPED_CAMPFIRE);
                    output.accept(NemosCampfiresItems.COBBLESTONE_CAMPFIRE);

                    output.accept(NemosCampfiresItems.OAK_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.SPRUCE_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.BIRCH_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.JUNGLE_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.ACACIA_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.DARK_OAK_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.MANGROVE_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CHERRY_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.PALE_OAK_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CRIMSON_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.WARPED_COPPER_CAMPFIRE);
                    output.accept(NemosCampfiresItems.COBBLESTONE_COPPER_CAMPFIRE);

                    output.accept(NemosCampfiresItems.OAK_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.SPRUCE_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.BIRCH_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.JUNGLE_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.ACACIA_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.DARK_OAK_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.MANGROVE_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CHERRY_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.PALE_OAK_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CRIMSON_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.WARPED_REDSTONE_CAMPFIRE);
                    output.accept(NemosCampfiresItems.COBBLESTONE_REDSTONE_CAMPFIRE);

                    output.accept(NemosCampfiresItems.OAK_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.SPRUCE_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.BIRCH_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.JUNGLE_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.ACACIA_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.DARK_OAK_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.MANGROVE_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CHERRY_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.PALE_OAK_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CRIMSON_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.WARPED_LAPIS_CAMPFIRE);
                    output.accept(NemosCampfiresItems.COBBLESTONE_LAPIS_CAMPFIRE);

                    output.accept(NemosCampfiresItems.OAK_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.SPRUCE_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.BIRCH_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.JUNGLE_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.ACACIA_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.DARK_OAK_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.MANGROVE_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CHERRY_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.PALE_OAK_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CRIMSON_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.WARPED_QUARTZ_CAMPFIRE);
                    output.accept(NemosCampfiresItems.COBBLESTONE_QUARTZ_CAMPFIRE);

                    output.accept(NemosCampfiresItems.SPRUCE_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.BIRCH_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.JUNGLE_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.ACACIA_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.DARK_OAK_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.MANGROVE_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CHERRY_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.PALE_OAK_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.CRIMSON_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.WARPED_SOUL_CAMPFIRE);
                    output.accept(NemosCampfiresItems.COBBLESTONE_SOUL_CAMPFIRE);
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
