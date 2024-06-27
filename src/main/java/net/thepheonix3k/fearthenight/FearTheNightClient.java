package net.thepheonix3k.fearthenight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.thepheonix3k.fearthenight.entity.ModEntities;
import net.thepheonix3k.fearthenight.entity.client.ModModelLayers;
import net.thepheonix3k.fearthenight.entity.client.Wendigo;
import net.thepheonix3k.fearthenight.entity.client.WendigoRenderer;

public class FearTheNightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.WENDIGO, WendigoRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.WENDIGO, Wendigo::getTexturedModelData);

    }
}
