/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elchocolapinanyfeatures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.elchocolapinanyfeatures.ElchocolapinanyfeaturesMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ElchocolapinanyfeaturesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElchocolapinanyfeaturesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ElchocolapinanyfeaturesModBlocks.BLOCK_DE_NUAGE.get().asItem());
		}
	}
}