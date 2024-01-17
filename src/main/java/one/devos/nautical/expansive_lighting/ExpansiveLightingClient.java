package one.devos.nautical.expansive_lighting;

import net.minecraft.client.renderer.RenderType;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class ExpansiveLightingClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.WHITE_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.LIGHT_GRAY_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.GRAY_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.BLACK_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.BROWN_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.RED_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.ORANGE_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.YELLOW_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.LIME_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.GREEN_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.CYAN_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.LIGHT_BLUE_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.BLUE_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.PURPLE_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.MAGENTA_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.PINK_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.WHITE_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.LIGHT_GRAY_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.GRAY_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.BLACK_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.BROWN_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.RED_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.ORANGE_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.YELLOW_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.LIME_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.GREEN_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.CYAN_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.LIGHT_BLUE_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.BLUE_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.PURPLE_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.MAGENTA_WALL_TORCH);
		BlockRenderLayerMap.put(RenderType.cutout(), Registrar.PINK_WALL_TORCH);
	}
}
