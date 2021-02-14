package io.github.Stonewall0210.underfabric;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ToughGlove {
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.tough_glove.tooltip") );
    }
}
