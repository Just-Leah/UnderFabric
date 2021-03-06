package io.github.Stonewall0210.underfabric.items.weapons;

import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class RealKnife extends SwordItem {
    public RealKnife(WeaponMaterial instance, int attackDamage, float attackSpeed, Settings group) {
        super(WeaponMaterial.INSTANCE, 99, -1F, new Item.Settings().group(ItemGroup.SEARCH));
    }

    @Override
    public void appendTooltip(ItemStack ToyKnife, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.real_knife.tooltip").formatted(Formatting.ITALIC).formatted(Formatting.RED));
    }
}
