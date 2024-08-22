package top.mramericanmike.barebones.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.mramericanmike.barebones.BareBones;
import top.mramericanmike.barebones.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BareBones.MODID);


	public static final DeferredBlock<Block> VERDINGO_ORE = registerBlock("verdingo_ore",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE)));

	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
		DeferredBlock<T> registeredBlock = BLOCKS.register(name, block);
		registerBlockItem(name, registeredBlock);
		return registeredBlock;
	}

	private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}