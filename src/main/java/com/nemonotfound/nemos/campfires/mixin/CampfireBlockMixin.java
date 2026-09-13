package com.nemonotfound.nemos.campfires.mixin;

import com.nemonotfound.nemos.campfires.data.CampfireAttachments;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CampfireBlock.class)
public abstract class CampfireBlockMixin {

    @Inject(method = "useItemOn", at = @At("HEAD"), cancellable = true)
    private void dyeSmoke(
            ItemStack itemStack,
            BlockState state,
            Level level,
            BlockPos pos,
            Player player,

            InteractionHand hand,
            BlockHitResult hitResult,
            CallbackInfoReturnable<InteractionResult> cir
    ) {
        DyeColor color = itemStack.get(DataComponents.DYE);
        BlockEntity blockEntity = level.getBlockEntity(pos);

        if (color == null || !state.getValue(CampfireBlock.LIT) || !(blockEntity instanceof AttachmentTarget target)
                || target.getAttached(CampfireAttachments.SMOKE_COLOR) == color) {
            return;
        }

        level.playSound(player, pos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);

        if (!level.isClientSide()) {
            target.setAttached(CampfireAttachments.SMOKE_COLOR, color);
            blockEntity.setChanged();

            if (!player.isCreative()) {
                itemStack.shrink(1);
            }
        }

        cir.setReturnValue(InteractionResult.SUCCESS);
    }

    @Inject(method = "dowse", at = @At("HEAD"))
    private static void removeSmokeColor(Entity entity, LevelAccessor level, BlockPos pos, BlockState state,
                                         CallbackInfo ci) {
        BlockEntity blockEntity = level.getBlockEntity(pos);

        if (blockEntity instanceof AttachmentTarget target
                && target.removeAttached(CampfireAttachments.SMOKE_COLOR) != null) {
            blockEntity.setChanged();
        }
    }
}
