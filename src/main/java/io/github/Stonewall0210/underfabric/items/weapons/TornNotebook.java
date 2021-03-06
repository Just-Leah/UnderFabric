package io.github.Stonewall0210.underfabric.items.weapons;

import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class TornNotebook extends AxeItem {
    public TornNotebook(WeaponMaterial instance, int attackDamage, float attackSpeed, Settings group) {
        super(WeaponMaterial.INSTANCE, 1, -0.5F, new Item.Settings().group(ItemGroup.SEARCH));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.torn_notebook.tooltip").formatted(Formatting.ITALIC).formatted(Formatting.DARK_PURPLE));
    }
}
