package io.github.Stonewall0210.underfabric.items.weapons;

import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
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

public  class EmptyGun extends AxeItem {

public EmptyGun(WeaponMaterial instance, int attackDamage, float attackSpeed, Settings group) {
        super(WeaponMaterial.INSTANCE, 12, -3.2F, new Item.Settings().group(ItemGroup.SEARCH));
        }

        @Override
        public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
                // formatted red text
                tooltip.add( new TranslatableText("item.underfabric.empty_gun.tooltip1").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
                tooltip.add( new TranslatableText("item.underfabric.empty_gun.tooltip2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
        }
}