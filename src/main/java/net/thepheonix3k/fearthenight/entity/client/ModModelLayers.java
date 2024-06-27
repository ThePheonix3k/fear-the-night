package net.thepheonix3k.fearthenight.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.thepheonix3k.fearthenight.FearTheNight;

public class ModModelLayers {
    public static final EntityModelLayer WENDIGO =
            new EntityModelLayer(new Identifier(FearTheNight.MOD_ID, "wendigo"), "main");
}
