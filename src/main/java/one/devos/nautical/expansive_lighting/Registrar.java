package one.devos.nautical.expansive_lighting;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import one.devos.nautical.expansive_lighting.blocks.VariableRedstoneLampBlock;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import static net.minecraft.world.level.block.Blocks.TORCH;
import static net.minecraft.world.level.block.Blocks.WALL_TORCH;
import static one.devos.nautical.expansive_lighting.ExpansiveLighting.ITEM_GROUP;
import static one.devos.nautical.expansive_lighting.ExpansiveLighting.MODID;

public class Registrar {
	public static final Block VARIABLE_REDSTONE_LAMP = registerBlock("variable_redstone_lamp", new VariableRedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).isValidSpawn(Blocks::always).lightLevel(VariableRedstoneLampBlock.LIGHT_EMISSION)));

	//Torches
	public static final Block WHITE_TORCH = registerBlockNoItem("white_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block LIGHT_GRAY_TORCH = registerBlockNoItem("light_gray_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block GRAY_TORCH = registerBlockNoItem("gray_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block BLACK_TORCH = registerBlockNoItem("black_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block BROWN_TORCH = registerBlockNoItem("brown_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block RED_TORCH = registerBlockNoItem("red_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block ORANGE_TORCH = registerBlockNoItem("orange_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block YELLOW_TORCH = registerBlockNoItem("yellow_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block LIME_TORCH = registerBlockNoItem("lime_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block GREEN_TORCH = registerBlockNoItem("green_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block CYAN_TORCH = registerBlockNoItem("cyan_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block LIGHT_BLUE_TORCH = registerBlockNoItem("light_blue_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block BLUE_TORCH = registerBlockNoItem("blue_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block PURPLE_TORCH = registerBlockNoItem("purple_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block MAGENTA_TORCH = registerBlockNoItem("magenta_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));
	public static final Block PINK_TORCH = registerBlockNoItem("pink_torch", new TorchBlock(BlockBehaviour.Properties.copy(TORCH), ParticleTypes.FLAME));

	//Wall Torches
	public static final Block WHITE_WALL_TORCH = registerBlockNoItem("white_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block LIGHT_GRAY_WALL_TORCH = registerBlockNoItem("light_gray_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block GRAY_WALL_TORCH = registerBlockNoItem("gray_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block BLACK_WALL_TORCH = registerBlockNoItem("black_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block BROWN_WALL_TORCH = registerBlockNoItem("brown_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block RED_WALL_TORCH = registerBlockNoItem("red_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block ORANGE_WALL_TORCH = registerBlockNoItem("orange_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block YELLOW_WALL_TORCH = registerBlockNoItem("yellow_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block LIME_WALL_TORCH = registerBlockNoItem("lime_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block GREEN_WALL_TORCH = registerBlockNoItem("green_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block LIGHT_BLUE_WALL_TORCH = registerBlockNoItem("light_blue_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block CYAN_WALL_TORCH = registerBlockNoItem("cyan_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block BLUE_WALL_TORCH = registerBlockNoItem("blue_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block PURPLE_WALL_TORCH = registerBlockNoItem("purple_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block MAGENTA_WALL_TORCH = registerBlockNoItem("magenta_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));
	public static final Block PINK_WALL_TORCH = registerBlockNoItem("pink_wall_torch", new WallTorchBlock(BlockBehaviour.Properties.copy(WALL_TORCH), ParticleTypes.FLAME));

	//God I hate torches so fucking much
	public static final Item WHITE_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(WHITE_TORCH, WHITE_WALL_TORCH, new Item.Properties(), Direction.DOWN), WHITE_TORCH);
	public static final Item LIGHT_GRAY_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(LIGHT_GRAY_TORCH, LIGHT_GRAY_WALL_TORCH, new Item.Properties(), Direction.DOWN), LIGHT_GRAY_TORCH);
	public static final Item GRAY_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(GRAY_TORCH, GRAY_WALL_TORCH, new Item.Properties(), Direction.DOWN), GRAY_TORCH);
	public static final Item BLACK_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(BLACK_TORCH, BLACK_WALL_TORCH, new Item.Properties(), Direction.DOWN), BLACK_TORCH);
	public static final Item BROWN_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(BROWN_TORCH, BROWN_WALL_TORCH, new Item.Properties(), Direction.DOWN), BROWN_TORCH);
	public static final Item RED_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(RED_TORCH, RED_WALL_TORCH, new Item.Properties(), Direction.DOWN), RED_TORCH);
	public static final Item ORANGE_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(ORANGE_TORCH, ORANGE_WALL_TORCH, new Item.Properties(), Direction.DOWN), ORANGE_TORCH);
	public static final Item YELLOW_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(YELLOW_TORCH, YELLOW_WALL_TORCH, new Item.Properties(), Direction.DOWN), YELLOW_TORCH);
	public static final Item LIME_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(LIME_TORCH, LIME_WALL_TORCH, new Item.Properties(), Direction.DOWN), LIME_TORCH);
	public static final Item GREEN_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(GREEN_TORCH, GREEN_WALL_TORCH, new Item.Properties(), Direction.DOWN), GREEN_TORCH);
	public static final Item CYAN_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(CYAN_TORCH, CYAN_WALL_TORCH, new Item.Properties(), Direction.DOWN), CYAN_TORCH);
	public static final Item LIGHT_BLUE_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(LIGHT_BLUE_TORCH, LIGHT_BLUE_WALL_TORCH, new Item.Properties(), Direction.DOWN), LIGHT_BLUE_TORCH);
	public static final Item BLUE_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(BLUE_TORCH, BLUE_WALL_TORCH, new Item.Properties(), Direction.DOWN), BLUE_TORCH);
	public static final Item PURPLE_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(PURPLE_TORCH, PURPLE_WALL_TORCH, new Item.Properties(), Direction.DOWN), PURPLE_TORCH);
	public static final Item MAGENTA_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(MAGENTA_TORCH, MAGENTA_WALL_TORCH, new Item.Properties(), Direction.DOWN), MAGENTA_TORCH);
	public static final Item PINK_TORCH_ITEM = registerBlockItem((BlockItem) new StandingAndWallBlockItem(PINK_TORCH, PINK_WALL_TORCH, new Item.Properties(), Direction.DOWN), PINK_TORCH);

	public static Block registerBlock(String name, Block block) {
		BlockItem item = new BlockItem(block, new QuiltItemSettings());
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
			content.accept(item);
		});
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), item);
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
	}
	public static Block registerBlockNoItem(String name, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
	}
	public static Item registerBlockItem(BlockItem blockItem, Block block) {
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
			content.accept(blockItem);
		});
		return Registry.register(BuiltInRegistries.ITEM, BuiltInRegistries.BLOCK.getKey(block), blockItem);
	}


	public static void init() {}

}
