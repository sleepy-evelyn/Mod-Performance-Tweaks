package dev.mpt.config;

import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;

public class Configs {
    public static MPTConfig MPT = ConfigApiJava.registerAndLoadConfig(MPTConfig::new);

    public static void init() {}
}
