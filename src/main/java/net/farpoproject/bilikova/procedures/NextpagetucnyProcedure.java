package net.farpoproject.bilikova.procedures;

import net.minecraft.world.entity.Entity;

public class NextpagetucnyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("tucnyplayertradepage") == 1) {
			entity.getPersistentData().putDouble("tucnyplayertradepage", 2);
		} else if (entity.getPersistentData().getDouble("tucnyplayertradepage") == 2) {
			entity.getPersistentData().putDouble("tucnyplayertradepage", 3);
		}
	}
}
