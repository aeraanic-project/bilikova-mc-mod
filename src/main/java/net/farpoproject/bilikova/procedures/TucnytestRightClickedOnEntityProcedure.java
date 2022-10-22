package net.farpoproject.bilikova.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.farpoproject.bilikova.world.inventory.TucnytradingguyMenu;

import io.netty.buffer.Unpooled;

public class TucnytestRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.getPersistentData().putDouble("tucnyplayertradecount1", (entity.getPersistentData().getDouble("tucnytradecount1")));
		sourceentity.getPersistentData().putDouble("tucnyplayertradecount2", (entity.getPersistentData().getDouble("tucnytradecount2")));
		sourceentity.getPersistentData().putDouble("tucnyplayertradecount3", (entity.getPersistentData().getDouble("tucnytradecount3")));
		sourceentity.getPersistentData().putDouble("tucnyplayertradeitem1", (entity.getPersistentData().getDouble("tucnytradeitem1")));
		sourceentity.getPersistentData().putDouble("tucnyplayertradeitem2", (entity.getPersistentData().getDouble("tucnytradeitem2")));
		sourceentity.getPersistentData().putDouble("tucnyplayertradeitem2", (entity.getPersistentData().getDouble("tucnytradeitem2")));
		sourceentity.getPersistentData().putDouble("tucnyplayertradepage", 1);
		{
			if (sourceentity instanceof ServerPlayer _ent) {
				BlockPos _bpos = new BlockPos(x, y, z);
				NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return new TextComponent("Tucnytradingguy");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TucnytradingguyMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
