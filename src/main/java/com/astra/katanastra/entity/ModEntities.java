package com.astra.katanastra.entity;

import com.astra.katanastra.entity.custom.DemonEntity;
import com.astra.katanastra.katanastraMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<DemonEntity> DEMON = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(katanastraMod.MODID,"demon"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DemonEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f,1.5f)).build());
}
