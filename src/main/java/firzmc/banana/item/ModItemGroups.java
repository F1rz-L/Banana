package firzmc.banana.item;

import firzmc.banana.BananaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BANANA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BananaMod.MOD_ID,"banana"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.banana"))
                    .icon(() -> new ItemStack(ModItems.BANANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BANANA);
                    }).build());

    public static void registerItemGroups(){
        BananaMod.LOGGER.info("Registering Item Groups for " + BananaMod.MOD_ID);
    }
}
