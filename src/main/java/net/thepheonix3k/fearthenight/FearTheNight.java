package net.thepheonix3k.fearthenight;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.thepheonix3k.fearthenight.entity.ModEntities;
import net.thepheonix3k.fearthenight.entity.custom.WendigoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FearTheNight implements ModInitializer {
	public static final String MOD_ID = "fearthenight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
		FabricDefaultAttributeRegistry.register(ModEntities.WENDIGO, WendigoEntity.createWendigoAttributes());
	}
}