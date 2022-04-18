package gregtech.common.covers;

import appeng.facade.IFacadeItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GT_Cover_FacadeAE extends GT_Cover_FacadeBase {
	@Override
	protected Block getTargetBlock(ItemStack aFacadeStack) {
		if(aFacadeStack == null) return null;
		final Item item = aFacadeStack.getItem();
		if (!(item instanceof IFacadeItem)) return null;
		return ((IFacadeItem) item).getBlock(aFacadeStack);
	}

	@Override
	protected int getTargetMeta(ItemStack aFacadeStack) {
		if(aFacadeStack == null) return 0;
		final Item item = aFacadeStack.getItem();
		if (!(item instanceof IFacadeItem)) return 0;
		return ((IFacadeItem) item).getMeta(aFacadeStack);
	}

	@Override
	protected ItemStack getDisplayStackImpl(int aCoverID, FacadeData aCoverVariable) {
		return aCoverVariable.mStack;
	}
}
