package name.record_mod;

import name.record_mod.mixin.ExampleMixin;
import name.record_mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecordMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "record-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("record-mod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItem();
	}
}