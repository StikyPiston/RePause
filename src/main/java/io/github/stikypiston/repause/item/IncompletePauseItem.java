
package io.github.stikypiston.repause.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IncompletePauseItem extends Item {
	public IncompletePauseItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
