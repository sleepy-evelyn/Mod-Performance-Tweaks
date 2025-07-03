package dev.mpt;

import com.simibubi.create.Create;
import dev.mpt.config.Configs;
import me.fzzyhmstrs.fzzy_config.util.PlatformApi;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MPTMod {
    public static final String MOD_ID = "mpt";
    public static final String NAME = "Mod Performance Tweaks";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        //LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, MPTExpectPlatform.platformName());
        MPTBlocks.init(); // hold registrate in a separate class to avoid loading early on forge

        Configs.init();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
