package io.github.Stonewall0210.underfabric;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WeaponMaterial implements ToolMaterial {

    public static final WeaponMaterial INSTANCE = new WeaponMaterial();

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
