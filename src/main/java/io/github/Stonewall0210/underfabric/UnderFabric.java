package io.github.Stonewall0210.underfabric;

import io.github.Stonewall0210.underfabric.blocks.savePoint;
import io.github.Stonewall0210.underfabric.items.WeaponMaterial;
import io.github.Stonewall0210.underfabric.items.weapons.*;
import io.github.Stonewall0210.underfabric.items.consumeables.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class UnderFabric implements ModInitializer {
	// Create items that are not weapons, weapons are done further down.
	public static final Item HEART_RED = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item BANDAGE_CONSUMABLE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final monsterCandy MONSTER_CANDY = new monsterCandy(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item SPIDER_DONUT = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item SPIDER_CIDER = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item BSCOTCH_PIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item SNAIL_PIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item SNOWMAN_PIECE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item NICE_CREAM = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item BISICLE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item UNISICLE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item CINNAMON_BUNNY = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item ASTRONAUT_FOOD = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item CRAB_APPLE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item SEA_TEA = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item ABANDONED_QUICHE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item TEMMIE_FLAKES = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item DOG_SALAD = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item INSTANT_NOODLES = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item HOT_DOG = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item HOT_CAT = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item JUNK_FOOD = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item HUSH_PUPPY = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item STARFAIT = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item GLAMBURGER = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item LEGENDARY_HERO = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item FACE_STEAK = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item POPATO_CHISPS = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item BAD_MEMORY = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item LAST_DREAM = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item PUPPY_ICE_CREAM = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item PUMPKIN_RINGS = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item ROCK_CANDY = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item CROQUET_ROLL = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item GHOST_FRUIT = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item STOIC_ONION = new Item(new FabricItemSettings().group(ItemGroup.FOOD));

	// Create blocks
	public static final Block RUINS_DEFAULT = new Block(FabricBlockSettings.of(Material.STONE).strength(1.3f));
	public static final Block RUINS_PATH = new Block(FabricBlockSettings.of(Material.STONE).strength(1.2f));
	public static final Block RUINS_BRICK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.7f));
	public static final Block RUINS_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES).strength(0.3f));
	public static final Block SAVE_POINT = new savePoint(FabricBlockSettings.of(Material.AIR).strength(18000000f));

	//Create sounds
	public static final Identifier CONSUME_ITEM_ID = new Identifier("underfabric:item.consume");
	public static SoundEvent CONSUME_ITEM = new SoundEvent(CONSUME_ITEM_ID);

	@Override
	public void onInitialize() {
		System.out.println("Registering UnderFabric objects:");

		System.out.println("Registering UnderFabric items...");
		// Register Items
		Registry.register(Registry.ITEM, new Identifier("underfabric", "heart_red"), HEART_RED);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "bandage_consumable"), BANDAGE_CONSUMABLE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "monster_candy"), MONSTER_CANDY);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "spider_donut"), SPIDER_DONUT);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "spider_cider"), SPIDER_CIDER);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "bscotch_pie"), BSCOTCH_PIE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "snail_pie"), SNAIL_PIE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "snowman_piece"), SNOWMAN_PIECE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "nice_cream"), NICE_CREAM);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "bisicle"), BISICLE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "unisicle"), UNISICLE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "cinnamon_bunny"), CINNAMON_BUNNY);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "astronaut_food"), ASTRONAUT_FOOD);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "crab_apple"), CRAB_APPLE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "sea_tea"), SEA_TEA);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "abandoned_quiche"), ABANDONED_QUICHE);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "temmie_flakes"), TEMMIE_FLAKES);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "dog_salad"), DOG_SALAD);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "instant_noodles"), INSTANT_NOODLES);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "hot_dog"), HOT_DOG);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "hot_cat"), HOT_CAT);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "junk_food"), JUNK_FOOD);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "hush_puppy"), HUSH_PUPPY);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "starfait"), STARFAIT);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "glamburger"), GLAMBURGER);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "legendary_hero"), LEGENDARY_HERO);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "face_steak"), FACE_STEAK);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "popato_chisps"), POPATO_CHISPS);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "bad_memory"), BAD_MEMORY);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "last_dream"), LAST_DREAM);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "puppy_ice_cream"), PUPPY_ICE_CREAM);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "pumpkin_rings"), PUMPKIN_RINGS);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "rock_candy"), ROCK_CANDY);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "croquet_roll"), CROQUET_ROLL);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ghost_fruit"), GHOST_FRUIT);
		Registry.register(Registry.ITEM, new Identifier("underfabric", "stoic_onion"), STOIC_ONION);

		System.out.println("Registering UnderFabric weapons...");
		//Register Weapons
		Registry.register(Registry.ITEM, new Identifier("underfabric", "toy_knife"), TOY_KNIFE);
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
		Registry.register(Registry.BLOCK, new Identifier("underfabric", "save_point"), SAVE_POINT);

		System.out.println("Registering UnderFabric block items...");
		// Register Items for Blocks registered above
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_default"), new BlockItem(RUINS_DEFAULT, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_path"), new BlockItem(RUINS_PATH, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_brick"), new BlockItem(RUINS_BRICK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "ruins_leaves"), new BlockItem(RUINS_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.ITEM, new Identifier("underfabric", "save_point"), new BlockItem(SAVE_POINT, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		System.out.println("Registering UnderFabric sounds...");
		// Register sounds
		Registry.register(Registry.SOUND_EVENT, UnderFabric.CONSUME_ITEM_ID, CONSUME_ITEM);

		// Ascii art!
		System.out.println("Registered UnderFabric objects.");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("░░░░██░░████████░░██░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("░░██░░██░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("░░██░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("░░██░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("██░░░░██░░░░██░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░");
		System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░░░░░░░░░");
		System.out.println("██░░░░░░████░░░░░░░░░░░░░░░░░░██████████████░░");
		System.out.println("██░░██░░██░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░██");
		System.out.println("██░░░░████████░░░░░░░░░░░░░░░░░░░░░░░░██████░░");
		System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░");
		System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░");
		System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░");
		System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░");
		System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░");
		System.out.println("░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░");
		System.out.println("░░██░░░░████░░░░████████░░░░████░░░░██░░░░░░░░");
		System.out.println("░░██░░░░████░░██░░░░░░██░░██░░██░░░░██░░░░░░░░");
		System.out.println("░░██░░██░░░░██░░░░░░░░░░██░░░░██░░██░░░░░░░░░░");
		System.out.println("░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░");
		System.out.println("Arf Arf!");
	}

	// Create items to registered namespaces as per above
	// The settings here are overridden by the settings within the item class itself, modifications are done there
	public static ToolItem TOY_KNIFE = new ToyKnife(WeaponMaterial.INSTANCE, 2, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem TOUGH_GLOVE = new ToughGlove(WeaponMaterial.INSTANCE, 4, -1F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem BALLET_SHOES = new BalletShoes(WeaponMaterial.INSTANCE, 6, -1.5F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem TORN_NOTEBOOK = new TornNotebook(WeaponMaterial.INSTANCE, 1, -0.5F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem BURNT_PAN = new BurntPan(WeaponMaterial.INSTANCE, 10, -3F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem EMPTY_GUN = new EmptyGun(WeaponMaterial.INSTANCE, 10, -3F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem WORN_DAGGER = new WornDagger(WeaponMaterial.INSTANCE, 15, -2.5F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem REAL_KNIFE = new RealKnife(WeaponMaterial.INSTANCE, 99, -1F, new Item.Settings().group(ItemGroup.COMBAT));

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
				// Consumables
				stacks.add(new ItemStack(UnderFabric.BANDAGE_CONSUMABLE));
				stacks.add(new ItemStack(UnderFabric.MONSTER_CANDY));
				stacks.add(new ItemStack(UnderFabric.SPIDER_DONUT));
				stacks.add(new ItemStack(UnderFabric.SPIDER_CIDER));
				stacks.add(new ItemStack(UnderFabric.BSCOTCH_PIE));
				stacks.add(new ItemStack(UnderFabric.SNAIL_PIE));
				stacks.add(new ItemStack(UnderFabric.SNOWMAN_PIECE));
				stacks.add(new ItemStack(UnderFabric.NICE_CREAM));
				stacks.add(new ItemStack(UnderFabric.BISICLE));
				stacks.add(new ItemStack(UnderFabric.UNISICLE));
				stacks.add(new ItemStack(UnderFabric.CINNAMON_BUNNY));
				stacks.add(new ItemStack(UnderFabric.ASTRONAUT_FOOD));
				stacks.add(new ItemStack(UnderFabric.CRAB_APPLE));
				stacks.add(new ItemStack(UnderFabric.SEA_TEA));
				stacks.add(new ItemStack(UnderFabric.ABANDONED_QUICHE));
				stacks.add(new ItemStack(UnderFabric.TEMMIE_FLAKES));
				stacks.add(new ItemStack(UnderFabric.DOG_SALAD));
				stacks.add(new ItemStack(UnderFabric.INSTANT_NOODLES));
				stacks.add(new ItemStack(UnderFabric.HOT_DOG));
				stacks.add(new ItemStack(UnderFabric.HOT_CAT));
				stacks.add(new ItemStack(UnderFabric.JUNK_FOOD));
				stacks.add(new ItemStack(UnderFabric.HUSH_PUPPY));
				stacks.add(new ItemStack(UnderFabric.STARFAIT));
				stacks.add(new ItemStack(UnderFabric.GLAMBURGER));
				stacks.add(new ItemStack(UnderFabric.LEGENDARY_HERO));
				stacks.add(new ItemStack(UnderFabric.FACE_STEAK));
				stacks.add(new ItemStack(UnderFabric.POPATO_CHISPS));
				stacks.add(new ItemStack(UnderFabric.BAD_MEMORY));
				stacks.add(new ItemStack(UnderFabric.LAST_DREAM));
				stacks.add(new ItemStack(UnderFabric.PUPPY_ICE_CREAM));
				stacks.add(new ItemStack(UnderFabric.PUMPKIN_RINGS));
				stacks.add(new ItemStack(UnderFabric.ROCK_CANDY));
				stacks.add(new ItemStack(UnderFabric.CROQUET_ROLL));
				stacks.add(new ItemStack(UnderFabric.GHOST_FRUIT));
				stacks.add(new ItemStack(UnderFabric.STOIC_ONION));
				// Blocks
				stacks.add(new ItemStack(UnderFabric.RUINS_DEFAULT));
				stacks.add(new ItemStack(UnderFabric.RUINS_PATH));
				stacks.add(new ItemStack(UnderFabric.RUINS_BRICK));
				stacks.add(new ItemStack(UnderFabric.RUINS_LEAVES));
			})
			.build();
}