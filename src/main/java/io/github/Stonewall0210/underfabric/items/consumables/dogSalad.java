package io.github.Stonewall0210.underfabric.items.consumables;

import io.github.Stonewall0210.underfabric.UnderFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import java.util.Random;

public class dogSalad extends Item{
    public dogSalad(Item.Settings group) {
        super(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(UnderFabric.CONSUME_ITEM, 1.0F, 1.0F);
        playerEntity.setStackInHand(hand, new ItemStack(Items.AIR));
        Random rand = new Random();
        int healAmount = rand.nextInt(5);
        if (healAmount == 1) {
            playerEntity.heal(2);
            playerEntity.sendMessage(new TranslatableText("text.underfabric.dog_salad.use.2"),false);
        }
        else if (healAmount == 2){
            playerEntity.heal(10);
            playerEntity.sendMessage(new TranslatableText("text.underfabric.dog_salad.use.10"),false);
        }
        else if (healAmount == 3){
            playerEntity.heal(30);
            playerEntity.sendMessage(new TranslatableText("text.underfabric.dog_salad.use.30"),false);
        }
        else if (healAmount == 4){
            playerEntity.setHealth(playerEntity.getMaxHealth());
            playerEntity.sendMessage(new TranslatableText("text.underfabric.dog_salad.use.max"),false);
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
