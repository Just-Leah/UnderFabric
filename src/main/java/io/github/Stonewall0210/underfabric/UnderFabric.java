package io.github.Stonewall0210.underfabric;

import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
import io.github.Stonewall0210.underfabric.items.weapons.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UnderFabric implements ModInitializer {
	// Create items that are not weapons, weapons are done further down.
	public static final Item HEART_RED = new Item(new FabricItemSettings().group(ItemGroup.SEARCH));

	// Create blocks
	public static final Block RUINS_DEFAULT = new Block(FabricBlockSettings.of(Material.STONE));
	public static final Block RUINS_PATH = new Block(FabricBlockSettings.of(Material.STONE));
	public static final Block RUINS_BRICK = new Block(FabricBlockSettings.of(Material.STONE));
	public static final Block RUINS_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES));

	@Override
	public void onInitialize() {
		System.out.println("Registering UnderFabric objects:");

		System.out.println("Registering UnderFabric items...");
		// Register Items, Weapons are defined below, others are defined above
		Registry.register(Registry.ITEM, new Identifier("underfabric", "toy_knife"), TOY_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "heart_red"), HEART_RED);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "tough_glove"), TOUGH_GLOVE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ballet_shoes"), BALLET_SHOES);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "torn_notebook"), TORN_NOTEBOOK);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "burnt_pan"), BURNT_PAN);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "empty_gun"), EMPTY_GUN);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "worn_dagger"), WORN_DAGGER);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "real_knife"), REAL_KNIFE);

		System.out.println("Registering UnderFabric blocks...");
		// Register blocks
		Registry.register(Registry.BLOCK, new Identifier("underfabric", "ruins_default"), RUINS_DEFAULT);
		Registry.register(Registry.BLOCK, new Identifier("underfabric", "ruins_path"), RUINS_PATH);
		Registry.register(Registry.BLOCK, new Identifier("underfabric", "ruins_brick"), RUINS_BRICK);
		Registry.register(Registry.BLOCK, new Identifier("underfabric", "ruins_leaves"), RUINS_LEAVES);

		System.out.println("Registering UnderFabric block items...");
		// Register Items for Blocks registered above
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_default"), new BlockItem(RUINS_DEFAULT, new FabricItemSettings().group(ItemGroup.SEARCH)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_path"), new BlockItem(RUINS_PATH, new FabricItemSettings().group(ItemGroup.SEARCH)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_brick"), new BlockItem(RUINS_BRICK, new FabricItemSettings().group(ItemGroup.SEARCH)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_leaves"), new BlockItem(RUINS_LEAVES, new FabricItemSettings().group(ItemGroup.SEARCH)));

		System.out.println("Registered UnderFabric objects.");
	}

	// Create items to registered namespaces as per above
	// The settings here are overridden by the settings within the item class itself, modifications are done there
	public static ToolItem TOY_KNIFE = new ToyKnife(WeaponMaterial.INSTANCE, 2, -2.4F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem TOUGH_GLOVE = new ToughGlove(WeaponMaterial.INSTANCE, 4, -1F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem BALLET_SHOES = new BalletShoes(WeaponMaterial.INSTANCE, 6, -1.5F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem TORN_NOTEBOOK = new TornNotebook(WeaponMaterial.INSTANCE, 1, -0.5F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem BURNT_PAN = new BurntPan(WeaponMaterial.INSTANCE, 10, -3F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem EMPTY_GUN = new EmptyGun(WeaponMaterial.INSTANCE, 10, -3F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem WORN_DAGGER = new WornDagger(WeaponMaterial.INSTANCE, 15, -2.5F, new Item.Settings().group(ItemGroup.SEARCH));
	public static ToolItem REAL_KNIFE = new RealKnife(WeaponMaterial.INSTANCE, 99, -1F, new Item.Settings().group(ItemGroup.SEARCH));

	// Creates the creative tab items, they can otherwise be found at the bottom of the search tab, and nowhere else.
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier("underfabric", "creative_tab"))
			.icon(() -> new ItemStack(UnderFabric.HEART_RED))
			.appendItems(stacks -> {
				// Items
				stacks.add(new ItemStack(UnderFabric.HEART_RED));
				// Weapons
				stacks.add(new ItemStack(UnderFabric.TOY_KNIFE));
				stacks.add(new ItemStack(UnderFabric.TOUGH_GLOVE));
				stacks.add(new ItemStack(UnderFabric.BALLET_SHOES));
				stacks.add(new ItemStack(UnderFabric.TORN_NOTEBOOK));
				stacks.add(new ItemStack(UnderFabric.BURNT_PAN));
				stacks.add(new ItemStack(UnderFabric.EMPTY_GUN));
				stacks.add(new ItemStack(UnderFabric.WORN_DAGGER));
				stacks.add(new ItemStack(UnderFabric.REAL_KNIFE));
				// Blocks
				stacks.add(new ItemStack(UnderFabric.RUINS_DEFAULT));
				stacks.add(new ItemStack(UnderFabric.RUINS_PATH));
				stacks.add(new ItemStack(UnderFabric.RUINS_BRICK));
				stacks.add(new ItemStack(UnderFabric.RUINS_LEAVES));
			})
			.build();
}