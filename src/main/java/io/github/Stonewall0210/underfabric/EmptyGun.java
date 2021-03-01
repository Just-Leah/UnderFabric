package io.github.Stonewall0210.underfabric;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public  class EmptyGun extends AxeItem {

public EmptyGun(WeaponMaterial instance, int attackDamage, float attackSpeed, Settings group) {
        super(WeaponMaterial.INSTANCE, 12, -3.9F, new Item.Settings().group(ItemGroup.SEARCH));
        }
}