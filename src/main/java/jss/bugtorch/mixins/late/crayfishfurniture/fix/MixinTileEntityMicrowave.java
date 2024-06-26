package jss.bugtorch.mixins.late.crayfishfurniture.fix;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.mrcrayfish.furniture.tileentity.TileEntityMicrowave;

@Mixin(value = TileEntityMicrowave.class)
public abstract class MixinTileEntityMicrowave {

    /**
     * @author jss2a98aj
     * @reason Stop crashing vanilla and modded content that looks for ISidedInventory.
     */
    @Overwrite
    public int[] getAccessibleSlotsFromSide(int side) {
        return new int[] {};
    }

}
