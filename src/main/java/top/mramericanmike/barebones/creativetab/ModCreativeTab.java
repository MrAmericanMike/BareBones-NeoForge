package top.mramericanmike.barebones.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.mramericanmike.barebones.BareBones;
import top.mramericanmike.barebones.block.ModBlocks;
import top.mramericanmike.barebones.item.ModItems;

public class ModCreativeTab {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BareBones.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BAREBONES_TAB =
			CREATIVE_MODE_TAB.register("barebones_tab", () -> CreativeModeTab.builder()
					.title(Component.translatable("itemGroup.barebones"))
					.withTabsBefore(CreativeModeTabs.COMBAT)
					.icon(() -> ModItems.VERDINGO_GEM.get().getDefaultInstance())
					.displayItems((parameters, output) -> {
						ModBlocks.BLOCKS.getEntries().forEach(holder -> {
							output.accept(holder.get());
						});
						ModItems.ITEMS.getEntries().forEach(holder -> {
							output.accept(holder.get());
						});
//						output.accept(ModItems.RAW_VERDINGO);
//						output.accept(ModItems.VERDINGO_GEM);
//						output.accept(ModBlocks.VERDINGO_ORE);
//						output.accept(ModBlocks.VERDINGO_BLOCK);
					}).build());

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}

}
