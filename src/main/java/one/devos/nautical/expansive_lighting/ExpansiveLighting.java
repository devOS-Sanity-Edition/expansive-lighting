package one.devos.nautical.expansive_lighting;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static one.devos.nautical.expansive_lighting.Registrar.VARIABLE_REDSTONE_LAMP;

public class ExpansiveLighting implements ModInitializer {
	public static final String MODID = "expansive_lighting";
	public static final Logger LOGGER = LoggerFactory.getLogger("Expansive Lighting");

	public static final ResourceKey<CreativeModeTab> ITEM_GROUP = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "expansive_lighting.tab"));
	public static final CreativeModeTab LIGHTING = FabricItemGroup.builder()
		.icon(() -> new ItemStack(VARIABLE_REDSTONE_LAMP))
		.title(Component.translatable("itemGroup.expansive_lighting.expansive_lighting_tab"))
		.build();

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());

		Registrar.init();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ITEM_GROUP, LIGHTING);
	}
}
