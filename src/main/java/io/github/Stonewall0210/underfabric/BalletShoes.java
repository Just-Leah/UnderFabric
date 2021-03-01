package io.github.Stonewall0210.underfabric;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BalletShoes extends AxeItem {
    public BalletShoes(WeaponMaterial instance, int attackDamage, float attackSpeed, Item.Settings group) {
        super(WeaponMaterial.INSTANCE, 6, -1.5F, new Item.Settings().group(ItemGroup.SEARCH));

    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.ballet_shoes.tooltip1").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
        tooltip.add( new TranslatableText("item.underfabric.ballet_shoes.tooltip2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
    }
}
