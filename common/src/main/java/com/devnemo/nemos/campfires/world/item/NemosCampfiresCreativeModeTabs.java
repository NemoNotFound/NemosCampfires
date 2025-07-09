package com.devnemo.nemos.campfires.world.item;

import com.devnemo.nemos.campfires.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static com.devnemo.nemos.campfires.Constants.MOD_ID;

public class NemosCampfiresCreativeModeTabs {

    public static Supplier<CreativeModeTab> NEMOS_COPPER = Services.REGISTRY_HELPER.registerCreativeModeTab(MOD_ID, () -> Services.REGISTRY_HELPER.createCreativeModeTab()
            .title(Component.translatable("itemGroup." + MOD_ID))
            .icon(() -> new ItemStack(NemosCampfiresItems.SPRUCE_CAMPFIRE.get()))
            .displayItems((parameters, output) -> {
                output.accept(NemosCampfiresItems.SPRUCE_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.SPRUCE_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.BIRCH_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.BIRCH_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.JUNGLE_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.JUNGLE_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.ACACIA_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.ACACIA_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.DARK_OAK_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.DARK_OAK_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.MANGROVE_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.MANGROVE_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.CHERRY_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.CHERRY_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.PALE_OAK_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.PALE_OAK_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.CRIMSON_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.CRIMSON_SOUL_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.WARPED_CAMPFIRE.get());
                output.accept(NemosCampfiresItems.WARPED_SOUL_CAMPFIRE.get());
            })
            .build());

    public static void init() {}
}
