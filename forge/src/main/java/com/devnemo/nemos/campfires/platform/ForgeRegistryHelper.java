package com.devnemo.nemos.campfires.platform;

import com.devnemo.nemos.campfires.Constants;
import com.devnemo.nemos.campfires.ForgeNemosCampfires;
import com.devnemo.nemos.campfires.platform.services.IRegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class ForgeRegistryHelper implements IRegistryHelper {

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return ForgeNemosCampfires.BLOCKS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.BLOCK, id))));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return ForgeNemosCampfires.ITEMS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.ITEM, id))));
    }

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> creativeModeTab) {
        return ForgeNemosCampfires.CREATIVE_TABS.register(id, creativeModeTab);
    }

    @Override
    public CreativeModeTab.Builder createCreativeModeTab() {
        return CreativeModeTab.builder();
    }

    private static <T> ResourceKey<T> createResourceKey(ResourceKey<Registry<T>> registryResourceKey, String id) {
        return ResourceKey.create(registryResourceKey, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, id));
    }
}
