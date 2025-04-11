
package com.example.wanderermod;

import com.example.wanderermod.entity.WandererEntity;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.entity.*;
import net.minecraft.entity.mob.PillagerEntity;

public class WandererMod implements ModInitializer {

    public static final String MOD_ID = "wanderermod";

    public static final EntityType<WandererEntity> WANDERER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "wanderer"),
            EntityType.Builder.create(WandererEntity::new, SpawnGroup.CREATURE)
                    .setDimensions(0.6F, 1.95F)
                    .maxTrackingRange(10)
                    .build()
    );

    @Override
    public void onInitialize() {
        System.out.println("Wanderer Mod Loaded!");
    }
}
