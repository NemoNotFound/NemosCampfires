package com.nemonotfound.nemos.campfires.mixin;

import com.nemonotfound.nemos.campfires.data.CampfireAttachments;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ParticleEngine.class)
public abstract class ParticleEngineMixin {

    @Unique
    private static final int CAMPFIRE_SEARCH_DEPTH = 2;

    @Shadow
    protected ClientLevel level;

    @Inject(method = "makeParticle", at = @At("RETURN"))
    private <T extends ParticleOptions> void colorCampfireSmoke(
            T options,
            double x,
            double y,
            double z,
            double xa,
            double ya,
            double za,
            CallbackInfoReturnable<Particle> cir
    ) {
        if (!isCampfireSmoke(options)) {
            return;
        }

        Particle particle = cir.getReturnValue();
        if (!(particle instanceof SingleQuadParticle quadParticle)) {
            return;
        }

        DyeColor color = findSmokeColor(x, y, z);
        if (color != null) {
            applyColor(quadParticle, color);
        }
    }

    @Unique
    private static boolean isCampfireSmoke(ParticleOptions options) {
        return options == ParticleTypes.CAMPFIRE_COSY_SMOKE
                || options == ParticleTypes.CAMPFIRE_SIGNAL_SMOKE
                || options == ParticleTypes.SMOKE;
    }

    @Unique
    private @Nullable DyeColor findSmokeColor(double x, double y, double z) {
        int blockX = Mth.floor(x);
        int blockZ = Mth.floor(z);
        int particleY = Mth.floor(y);

        for (int offset = 0; offset <= CAMPFIRE_SEARCH_DEPTH; offset++) {
            BlockPos pos = new BlockPos(blockX, particleY - offset, blockZ);
            if (!(level.getBlockState(pos).getBlock() instanceof CampfireBlock)) {
                continue;
            }

            BlockEntity blockEntity = level.getBlockEntity(pos);

            if (blockEntity instanceof AttachmentTarget target) {
                return target.getAttached(CampfireAttachments.SMOKE_COLOR);
            }

            return null;
        }

        return null;
    }

    @Unique
    private static void applyColor(SingleQuadParticle particle, DyeColor color) {
        int rgb = color.getTextureDiffuseColor();
        particle.setColor(ARGB.redFloat(rgb), ARGB.greenFloat(rgb), ARGB.blueFloat(rgb));
    }
}
