package dev.mpt.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class MPTExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
