package top.mramericanmike.barebones;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import top.mramericanmike.barebones.block.ModBlocks;
import top.mramericanmike.barebones.config.Config;
import top.mramericanmike.barebones.creativetab.ModCreativeTab;
import top.mramericanmike.barebones.item.ModItems;

@Mod(BareBones.MODID)
public class BareBones {
	public static final String MODID = "barebones";

	public BareBones(IEventBus modEventBus, ModContainer modContainer) {
		modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

		ModItems.register(modEventBus);
		ModBlocks.register(modEventBus);
		ModCreativeTab.register(modEventBus);
	}
}
