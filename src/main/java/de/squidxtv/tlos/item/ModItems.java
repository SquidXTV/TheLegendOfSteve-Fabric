package de.squidxtv.tlos.item;

import de.squidxtv.tlos.TheLegendOfSteve;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HEAL_SPELL = registerItem("heal_spell", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TheLegendOfSteve.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TheLegendOfSteve.LOGGER.info("Registering Mod Items for " + TheLegendOfSteve.MOD_ID);
    }
}
