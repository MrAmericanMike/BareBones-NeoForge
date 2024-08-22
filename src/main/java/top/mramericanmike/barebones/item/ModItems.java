package top.mramericanmike.barebones.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.mramericanmike.barebones.BareBones;

public class ModItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BareBones.MODID);

	public static final DeferredItem<Item> RAW_VERDINGO = ITEMS.registerSimpleItem("raw_verdingo",
			new Item.Properties());

	public static final DeferredItem<Item> VERDINGO_GEM = ITEMS.registerSimpleItem("verdingo_gem",
			new Item.Properties());

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
