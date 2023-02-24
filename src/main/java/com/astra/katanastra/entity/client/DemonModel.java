package com.astra.katanastra.entity.client;

import com.astra.katanastra.entity.custom.DemonEntity;
import com.astra.katanastra.katanastraMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DemonModel extends AnimatedGeoModel<DemonEntity> {
    @Override
    public Identifier getModelResource(DemonEntity object) {
        return new Identifier(katanastraMod.MODID, "geo/demon.geo.json");
    }

    @Override
    public Identifier getTextureResource(DemonEntity object) {
        return new Identifier(katanastraMod.MODID, "textures/entity/demon.png");
    }

    @Override
    public Identifier getAnimationResource(DemonEntity animatable) {
        return new Identifier(katanastraMod.MODID, "animations/demon.animation.json");
    }
}
