package io.github.Stonewall0210.underfabric.items.consumables;

import io.github.Stonewall0210.underfabric.UnderFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class niceCream extends Item{
    public niceCream(Item.Settings group) {
        super(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(UnderFabric.CONSUME_ITEM, 1.0F, 1.0F);
        playerEntity.setStackInHand(hand, new ItemStack(Items.AIR));
        playerEntity.heal(15);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
