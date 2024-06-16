
package com.example.g3xbk;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null; // Server-side GUI is not needed for this mod
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        ItemStack itemStack = player.getHeldItemMainhand();
        if (itemStack != null && itemStack.getItem() instanceof ItemNBTEditor) {
            return new NBTEditorGui(itemStack);
        }
        return null;
    }
}
