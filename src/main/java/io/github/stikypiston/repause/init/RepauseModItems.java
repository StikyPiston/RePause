
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.repause.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Item;

import io.github.stikypiston.repause.item.ResumeItem;
import io.github.stikypiston.repause.item.PauseItem;
import io.github.stikypiston.repause.item.IncompleteResumeItem;
import io.github.stikypiston.repause.item.IncompletePauseItem;
import io.github.stikypiston.repause.item.FreezeGrenadeItem;
import io.github.stikypiston.repause.RepauseMod;

public class RepauseModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RepauseMod.MODID);
	public static final DeferredHolder<Item, Item> PAUSE = REGISTRY.register("pause", PauseItem::new);
	public static final DeferredHolder<Item, Item> RESUME = REGISTRY.register("resume", ResumeItem::new);
	public static final DeferredHolder<Item, Item> INCOMPLETE_RESUME = REGISTRY.register("incomplete_resume", IncompleteResumeItem::new);
	public static final DeferredHolder<Item, Item> INCOMPLETE_PAUSE = REGISTRY.register("incomplete_pause", IncompletePauseItem::new);
	public static final DeferredHolder<Item, Item> FREEZE_GRENADE = REGISTRY.register("freeze_grenade", FreezeGrenadeItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
