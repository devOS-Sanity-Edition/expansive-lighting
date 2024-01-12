package one.devos.nautical.expansive_lighting;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpansiveLighting implements ModInitializer {
	public static final String MODID = "expansive-lighting";
	public static final Logger LOGGER = LoggerFactory.getLogger("Example");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());
	}
}
