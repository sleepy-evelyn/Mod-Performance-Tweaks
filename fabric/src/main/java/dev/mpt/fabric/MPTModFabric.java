package dev.mpt.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import dev.mpt.MPTBlocks;
import dev.mpt.MPTMod;
import net.fabricmc.api.ModInitializer;

public class MPTModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MPTMod.init();
        MPTMod.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), MPTMod.NAME);

        // on fabric, Registrates must be explicitly finalized and registered.
        MPTBlocks.REGISTRATE.register();
    }
}
