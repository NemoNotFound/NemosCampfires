package com.nemonotfound.nemos.campfires.datagen;

import com.nemonotfound.nemos.campfires.world.level.block.NemosCampfiresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.add(NemosCampfiresBlocks.ACACIA_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.BIRCH_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.CHERRY_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.PALE_OAK_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.CRIMSON_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.DARK_OAK_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.JUNGLE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.MANGROVE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.SPRUCE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.WARPED_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.ACACIA_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.BIRCH_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CHERRY_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.PALE_OAK_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CRIMSON_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.DARK_OAK_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.JUNGLE_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.MANGROVE_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.SPRUCE_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.WARPED_SOUL_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.ACACIA_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.BIRCH_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.CHERRY_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.PALE_OAK_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.CRIMSON_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.DARK_OAK_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.JUNGLE_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.MANGROVE_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.OAK_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.SPRUCE_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.WARPED_COPPER_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.COPPER_NUGGET)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(NemosCampfiresBlocks.ACACIA_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.BIRCH_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CHERRY_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.PALE_OAK_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CRIMSON_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.DARK_OAK_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.JUNGLE_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.MANGROVE_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.OAK_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.SPRUCE_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.WARPED_REDSTONE_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.REDSTONE)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.ACACIA_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.BIRCH_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CHERRY_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.PALE_OAK_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CRIMSON_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.DARK_OAK_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.JUNGLE_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.MANGROVE_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.OAK_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.SPRUCE_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.WARPED_LAPIS_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.ACACIA_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.BIRCH_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CHERRY_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.PALE_OAK_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.CRIMSON_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.DARK_OAK_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.JUNGLE_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.MANGROVE_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.OAK_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.SPRUCE_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(NemosCampfiresBlocks.WARPED_QUARTZ_CAMPFIRE.get(), (Block block) -> this.createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.QUARTZ)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
    }
}
