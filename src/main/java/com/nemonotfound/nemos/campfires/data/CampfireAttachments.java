package com.nemonotfound.nemos.campfires.data;

import com.nemonotfound.nemos.campfires.NemosCampfires;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DyeColor;

public final class CampfireAttachments {

    public static final AttachmentType<DyeColor> SMOKE_COLOR = AttachmentRegistry.create(
            Identifier.fromNamespaceAndPath(NemosCampfires.MOD_ID, "smoke_color"),
            builder -> builder
                    .persistent(DyeColor.CODEC)
                    .syncWith(DyeColor.STREAM_CODEC, AttachmentSyncPredicate.all())
    );

    private CampfireAttachments() {
    }

    public static void init() {
    }
}
