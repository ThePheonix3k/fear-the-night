package net.thepheonix3k.fearthenight.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.thepheonix3k.fearthenight.FearTheNight;
import net.thepheonix3k.fearthenight.entity.custom.WendigoEntity;

public class WendigoRenderer extends MobEntityRenderer<WendigoEntity, Wendigo<WendigoEntity>> {
    private static final Identifier TEXTURE = new Identifier(FearTheNight.MOD_ID, "fear-the-night/resources/assets/fear-the-night/textures/entity/wendigo.png");

    public WendigoRenderer(EntityRendererFactory.Context context) {
        super(context, new Wendigo<>(context.getPart(ModModelLayers.WENDIGO)), 0.8f);
    }

    @Override
    public Identifier getTexture(WendigoEntity entity) {
        return TEXTURE;
    }

}
