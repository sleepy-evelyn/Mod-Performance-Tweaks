package dev.mpt.fabric.mixin;

import com.simibubi.create.content.trains.entity.Train;
import com.simibubi.create.foundation.utility.Pair;
import dev.mpt.config.Configs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = Train.class, remap = false)
public abstract class TrainMixin {

    @Shadow public abstract Pair<Train, Vec3> findCollidingTrain(Level level, Vec3 start, Vec3 end, ResourceKey<Level> dimension);

    @Redirect(
            method="collideWithOtherTrains",
            at=@At(
                    value = "INVOKE",
                    target = "Lcom/simibubi/create/content/trains/entity/Train;findCollidingTrain(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/resources/ResourceKey;)Lcom/simibubi/create/foundation/utility/Pair;"
            )
    )
    private Pair<Train, Vec3> mpt$removeTrainCollisions(Train instance, Level level, Vec3 start, Vec3 end, ResourceKey<Level> dimension) {
        if (Configs.MPT.createSection.disableTrainCollisions)
            return null;
        else
            return findCollidingTrain(level, start, end, dimension);
    }
}
