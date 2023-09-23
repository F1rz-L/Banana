package firzmc.banana.item;

import firzmc.banana.BananaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(BANANA);
    }

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(BananaMod.MOD_ID,name), item);
    }

    public static void registerModItems(){
        BananaMod.LOGGER.info("Registering Items for" + BananaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientItemGroup);
    }

}
