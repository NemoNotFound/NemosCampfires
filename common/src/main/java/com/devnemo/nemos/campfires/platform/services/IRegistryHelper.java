package com.devnemo.nemos.campfires.platform.services;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public interface IRegistryHelper {

    Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties);
    Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties);
    <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> creativeModeTab);
    CreativeModeTab.Builder createCreativeModeTab();
}
