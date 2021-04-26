package io.github.Stonewall0210.underfabric.entities.characters;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class napstablookRenderer extends MobEntityRenderer<napstablookEntity, napstablookModel> {

    public napstablookRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new napstablookModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(napstablookEntity entity) {
        return new Identifier("underfabric", "textures/entity/napstablook/napstablook.png");
    }
}