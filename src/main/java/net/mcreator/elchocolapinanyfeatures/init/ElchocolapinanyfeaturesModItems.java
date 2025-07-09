/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elchocolapinanyfeatures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.elchocolapinanyfeatures.item.CacaItem;
import net.mcreator.elchocolapinanyfeatures.ElchocolapinanyfeaturesMod;

import java.util.function.Function;

public class ElchocolapinanyfeaturesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ElchocolapinanyfeaturesMod.MODID);
	public static final DeferredItem<Item> CACA = register("caca", CacaItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}