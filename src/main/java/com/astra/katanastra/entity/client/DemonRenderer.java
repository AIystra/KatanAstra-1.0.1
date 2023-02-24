package com.astra.katanastra.entity.client;

import com.astra.katanastra.entity.custom.DemonEntity;
import com.astra.katanastra.katanastraMod;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DemonRenderer extends GeoEntityRenderer<DemonEntity> {
    public DemonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DemonModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(DemonEntity instance) {
        return new Identifier(katanastraMod.MODID, "textures/entity/demon.png");
    }

    @Override
    public RenderLayer getRenderType(DemonEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
