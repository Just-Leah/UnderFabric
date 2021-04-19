package io.github.Stonewall0210.underfabric.items.consumables;

import io.github.Stonewall0210.underfabric.UnderFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class niceCream extends Item{
    public niceCream(Item.Settings group) {
        super(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(UnderFabric.CONSUME_ITEM, 1.0F, 1.0F);
        playerEntity.setStackInHand(hand, new ItemStack(Items.AIR));
        playerEntity.heal(15);
        Random rand = new Random();
        int flavourText = rand.nextInt(9);
        if (world.isClient){
            if (flavourText == 1){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.1"), false);
            }
            if (flavourText == 2){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.2"), false);
            }
            if (flavourText == 3){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.3"), false);
            }
            if (flavourText == 4){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.4"), false);
            }
            if (flavourText == 5){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.5"), false);
            }
            if (flavourText == 6){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.6"), false);
            }
            if (flavourText == 7){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.7"), false);
            }
            if (flavourText == 8){
                playerEntity.sendMessage(new TranslatableText("text.underfabric.nice_cream.use.8"), false);
            }
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
