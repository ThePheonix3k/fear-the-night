package net.thepheonix3k.fearthenight.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thepheonix3k.fearthenight.FearTheNight;
import net.thepheonix3k.fearthenight.entity.custom.WendigoEntity;

public class ModEntities {
    public static final EntityType<WendigoEntity> WENDIGO = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FearTheNight.MOD_ID, "wendigo"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WendigoEntity::new).dimensions(EntityDimensions.fixed(1f,1f)).build());
}
