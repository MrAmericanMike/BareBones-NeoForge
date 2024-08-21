package top.mramericanmike.barebones.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.mramericanmike.barebones.BareBones;

public class ModItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BareBones.MODID);

	public static final DeferredItem<Item> RAW_VERDINGO = ITEMS.register("raw_verdingo",
			() -> new Item(new Item.Properties()));

	public static final DeferredItem<Item> VERDINGO_GEM = ITEMS.register("verdingo_gem",
			() -> new Item(new Item.Properties()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
