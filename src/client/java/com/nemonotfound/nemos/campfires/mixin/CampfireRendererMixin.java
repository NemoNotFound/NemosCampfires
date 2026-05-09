package com.nemonotfound.nemos.campfires.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.nemonotfound.nemos.campfires.world.level.block.CobblestoneCampfireBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.CampfireRenderer;
import net.minecraft.client.renderer.blockentity.state.CampfireRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

@Mixin(CampfireRenderer.class)
public class CampfireRendererMixin {

    @Inject(method = "submit(Lnet/minecraft/client/renderer/blockentity/state/CampfireRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;translate(FFF)V", ordinal = 0, shift = At.Shift.AFTER))
    private void adaptHeightForCobblestoneCampfires(CampfireRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera, CallbackInfo ci) {
        Optional.ofNullable(Minecraft.getInstance().level)
                .ifPresent(level -> {
                    if (level.getBlockState(state.blockPos).getBlock() instanceof CobblestoneCampfireBlock) {
                        poseStack.translate(0, -0.06, 0);
                    }
                });
    }
}
