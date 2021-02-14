package io.github.Stonewall0210.underfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UnderFabric implements ModInitializer {
	// Create Items
	//  Weapons
	//   Toy Knife
	//public static final Item TOY_KNIFE = new Item(new FabricItemSettings());
	public static final Item HEART_RED = new Item(new FabricItemSettings().group(ItemGroup.MISC));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello UnderFabric world!");
		Registry.register(Registry.ITEM, new Identifier("underfabric", "toy_knife"), TOY_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "heart_red"), HEART_RED);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "tough_glove"), TOUGH_GLOVE);
	}

	public static ToolItem TOY_KNIFE = new SwordItem(WeaponMaterial.INSTANCE, 2, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem TOUGH_GLOVE = new CustomAxeItem(WeaponMaterial.INSTANCE, 4, -1F, new Item.Settings().group(ItemGroup.COMBAT));

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier("underfabric", "creative_tab"))
			.icon(() -> new ItemStack(UnderFabric.HEART_RED))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(UnderFabric.HEART_RED));
				stacks.add(new ItemStack(UnderFabric.TOY_KNIFE));
				stacks.add(new ItemStack(UnderFabric.TOUGH_GLOVE));
			})
			.build();
}