package e99999;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/** Simple fix to make drain an early game item */

public class drainRecipes
        implements Runnable {
            public void run() {
                GT_ModHandler.addCraftingRecipe(ItemList.Cover_Drain.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"BBB", "BPB", "BBB", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('B'), new ItemStack(Blocks.iron_bars, 1, 0) });
    }
}