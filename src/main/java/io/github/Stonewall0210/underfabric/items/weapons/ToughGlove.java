package io.github.Stonewall0210.underfabric.items.weapons;

import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ToughGlove extends AxeItem{

    public ToughGlove(WeaponMaterial instance, int attackDamage, float attackSpeed, Item.Settings group) {
        super(WeaponMaterial.INSTANCE, 4, -1F, new Item.Settings().group(ItemGroup.SEARCH));

    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.tough_glove.tooltip1").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
        tooltip.add( new TranslatableText("item.underfabric.tough_glove.tooltip2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
    }
}
