package net.farpoproject.bilikova.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TucnytestOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("tucnytradeitem1", 1);
			entity.getPersistentData().putDouble("tucnytradeitem2", 1);
			entity.getPersistentData().putDouble("tucnytradeitem3", 1);
			entity.getPersistentData().putDouble("tucnytradecount1", 16);
			entity.getPersistentData().putDouble("tucnytradecount2", 5);
			entity.getPersistentData().putDouble("tucnytradecount3", 2);
		}
	}
}
