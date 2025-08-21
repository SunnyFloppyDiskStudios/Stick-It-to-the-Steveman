package net.sunnyflops.sittsm.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sunnyflops.sittsm.StickItToTheSteveman;

public class ModItems {
    // define items
    public static final Item ATTACK_BOX = registerItem("attack_box", new Item(new Item.Settings()));

    // register
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StickItToTheSteveman.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StickItToTheSteveman.LOGGER.info("Registering mod items for " + StickItToTheSteveman.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            // add items here
            entries.add(ATTACK_BOX);
        });
    }
}
