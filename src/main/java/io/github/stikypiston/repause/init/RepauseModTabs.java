
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.repause.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.stikypiston.repause.RepauseMod;

public class RepauseModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RepauseMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RE_PAUSE = REGISTRY.register("re_pause",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.repause.re_pause")).icon(() -> new ItemStack(Items.CLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(RepauseModItems.PAUSE.get());
				tabData.accept(RepauseModItems.RESUME.get());
				tabData.accept(RepauseModItems.FREEZE_GRENADE.get());
			})

					.build());
}
