package io.github.Stonewall0210.underfabric.entities.characters;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class napstablook extends PathAwareEntity {

    public napstablook(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void playSpawnEffects() {
        super.playSpawnEffects();
    }
}