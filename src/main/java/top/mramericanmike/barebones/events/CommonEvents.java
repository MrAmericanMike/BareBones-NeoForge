package top.mramericanmike.barebones.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import top.mramericanmike.barebones.BareBones;

@EventBusSubscriber(modid = BareBones.MODID)
public class CommonEvents {
	@SubscribeEvent
	public static void onLivingJump(LivingEvent.LivingJumpEvent event) {
		Entity entity = event.getEntity();
		if (!entity.level().isClientSide()) {
			((LivingEntity) entity).heal(1);
		}
	}
}