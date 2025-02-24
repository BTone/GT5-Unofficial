package gregtech.loaders.postload.recipes;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BuildCraftSilicon;
import static gregtech.api.util.GT_ModHandler.getModItem;
import static gregtech.api.util.GT_Recipe.GT_Recipe_Map.sPressRecipes;
import static gregtech.api.util.GT_RecipeBuilder.SECONDS;
import static gregtech.api.util.GT_RecipeBuilder.TICKS;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TierEU;
import gregtech.api.util.GT_OreDictUnificator;

public class FormingPressRecipes implements Runnable {

    @Override
    public void run() {
        if (BuildCraftSilicon.isModLoaded()) {
            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 1L),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 1))
                .duration(5 * SECONDS)
                .eut(TierEU.RECIPE_MV)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.WroughtIron, 1L),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 1))
                .duration(5 * SECONDS)
                .eut(TierEU.RECIPE_MV)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Gold, 1L),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 2))
                .duration(10 * SECONDS)
                .eut(TierEU.RECIPE_MV)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Diamond, 1L),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 3))
                .duration(5 * SECONDS)
                .eut(TierEU.RECIPE_HV)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.gem, Materials.EnderPearl, 1L),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 2L, 4))
                .duration(10 * SECONDS)
                .eut(TierEU.RECIPE_MV)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NetherQuartz, 1L),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 5))
                .duration(15 * SECONDS)
                .eut(TierEU.RECIPE_MV)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    new ItemStack(Items.comparator, 1, 32767),
                    getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 0))
                .itemOutputs(getModItem(BuildCraftSilicon.ID, "redstoneChipset", 1L, 6))
                .duration(15 * SECONDS)
                .eut(TierEU.RECIPE_MV)
                .addTo(sPressRecipes);
        }

        if (AppliedEnergistics2.isModLoaded()) {
            GT_Values.RA.stdBuilder()
                .itemInputs(
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 10),
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 0L, 13))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 16))
                .duration(10 * SECONDS)
                .eut(16)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CertusQuartz, 1L),
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 0L, 13))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 16))
                .duration(10 * SECONDS)
                .eut(16)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Diamond, 1L),
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 0L, 14))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 17))
                .duration(10 * SECONDS)
                .eut(16)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Gold, 1L),
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 0L, 15))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 18))
                .duration(10 * SECONDS)
                .eut(16)
                .addTo(sPressRecipes);

            GT_Values.RA.stdBuilder()
                .itemInputs(
                    GT_OreDictUnificator.get(OrePrefixes.plate, Materials.SiliconSG, 1L),
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 0L, 19))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 20))
                .duration(10 * SECONDS)
                .eut(16)
                .addTo(sPressRecipes);
        }

        GT_Values.RA.stdBuilder()
            .itemInputs(ItemList.Food_Dough_Sugar.get(4L), ItemList.Shape_Mold_Cylinder.get(0L))
            .itemOutputs(ItemList.Food_Raw_Cake.get(1L))
            .duration(19 * SECONDS + 4 * TICKS)
            .eut(4)
            .addTo(sPressRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(new ItemStack(Blocks.glass, 1, 32767), ItemList.Shape_Mold_Arrow.get(0L))
            .itemOutputs(ItemList.Arrow_Head_Glass_Emtpy.get(1L))
            .duration(3 * SECONDS + 4 * TICKS)
            .eut(4)
            .addTo(sPressRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Cupronickel, 1L),
                ItemList.Shape_Mold_Credit.get(0L))
            .itemOutputs(ItemList.Credit_Greg_Cupronickel.get(4L))
            .duration(5 * SECONDS)
            .eut(16)
            .addTo(sPressRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Brass, 1L),
                ItemList.Shape_Mold_Credit.get(0L))
            .itemOutputs(ItemList.Coin_Doge.get(4L))
            .duration(5 * SECONDS)
            .eut(16)
            .addTo(sPressRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 1L),
                ItemList.Shape_Mold_Credit.get(0L))
            .itemOutputs(ItemList.Credit_Iron.get(4L))
            .duration(5 * SECONDS)
            .eut(16)
            .addTo(sPressRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.WroughtIron, 1L),
                ItemList.Shape_Mold_Credit.get(0L))
            .itemOutputs(ItemList.Credit_Iron.get(4L))
            .duration(5 * SECONDS)
            .eut(16)
            .addTo(sPressRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Brick, 1L),
                ItemList.Shape_Mold_Ingot.get(0L))
            .itemOutputs(new ItemStack(Items.brick, 1, 0))
            .duration(5 * SECONDS)
            .eut(16)
            .addTo(sPressRecipes);
    }
}
