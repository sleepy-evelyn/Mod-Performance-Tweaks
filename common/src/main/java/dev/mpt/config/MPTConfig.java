package dev.mpt.config;

import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.config.ConfigSection;
import net.minecraft.resources.ResourceLocation;

import static dev.mpt.MPTMod.MOD_ID;

public class MPTConfig extends Config {

    public MPTConfig() {
        super(new ResourceLocation(MOD_ID, "mpt_config"));
    }

    public CreateSection createSection = new CreateSection();

    public static class CreateSection extends ConfigSection {
        public CreateSection() {
            super();
        }

        public boolean disableTrainCollisions = false;
    }

    @Override
    public int defaultPermLevel() {
        return 4;
    }
}
