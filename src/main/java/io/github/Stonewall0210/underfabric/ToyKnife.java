package io.github.Stonewall0210.underfabric;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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

public class ToyKnife extends SwordItem {

    public ToyKnife(WeaponMaterial instance, int attackDamage, float attackSpeed, Settings group) {
        super(WeaponMaterial.INSTANCE, 2, -2.4F, new Item.Settings().group(ItemGroup.SEARCH));
    }

    @Override
    public void appendTooltip(ItemStack ToyKnife, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.toy_knife.tooltip1").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
        tooltip.add( new TranslatableText("item.underfabric.toy_knife.tooltip2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
    }
}