package dev.mpt.forge;

import dev.mpt.MPTBlocks;
import dev.mpt.MPTMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MPTMod.MOD_ID)
public class MPTModForge {
    public MPTModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MPTBlocks.REGISTRATE.registerEventListeners(eventBus);
        MPTMod.init();
    }
}
