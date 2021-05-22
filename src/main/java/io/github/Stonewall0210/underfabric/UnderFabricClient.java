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
        System.out.println("Registering UnderFabric client objects...");

        System.out.println("Registering UnderFabric Entity Renders...");
        // Entity Renders
        EntityRendererRegistry.INSTANCE.register(UnderFabric.NAPSTABLOOK_ENTITY_ENTITY_TYPE, (dispatcher, context) -> {
            return new napstablookRenderer(dispatcher);
        });

        System.out.println("Registered UnderFabric client objects!");
        System.out.println("Here's a hint from your new best friend!");
        System.out.println("Whatever you do, don't check the config");
        System.out.println("You might not find the result very... good");
        System.out.println("He he he...");
    }
}
