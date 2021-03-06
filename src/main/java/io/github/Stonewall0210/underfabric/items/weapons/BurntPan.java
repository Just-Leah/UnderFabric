package io.github.Stonewall0210.underfabric.items.weapons;

import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BurntPan extends AxeItem {
    public BurntPan(WeaponMaterial instance, int attackDamage, float attackSpeed, Item.Settings group) {
        super(WeaponMaterial.INSTANCE, 9, -3F, new Item.Settings().group(ItemGroup.SEARCH));

    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.burnt_pan.tooltip").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
    }
}
