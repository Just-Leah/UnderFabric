package io.github.Stonewall0210.underfabric;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class ToyKnife extends Item {

    public ToyKnife(Settings settings) {
        super(settings);

    }

    @Override
    public void appendTooltip(ItemStack ToyKnife, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // formatted red text
        tooltip.add( new TranslatableText("item.underfabric.toy_knife.tooltip"));
    }
}