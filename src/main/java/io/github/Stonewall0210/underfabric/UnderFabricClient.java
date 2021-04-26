package io.github.Stonewall0210.underfabric;

import io.github.Stonewall0210.underfabric.entities.characters.napstablookRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class UnderFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(UnderFabric.NAPSTABLOOK_ENTITY_ENTITY_TYPE, (dispatcher, context) -> {
            return new napstablookRenderer(dispatcher);
        });
    }
}
