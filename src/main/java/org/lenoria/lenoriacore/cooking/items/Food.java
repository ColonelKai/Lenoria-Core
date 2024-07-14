package org.lenoria.lenoriacore.cooking.items;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.lenoria.lenoriacore.LenoriaCore;
import org.lenoria.lenoriacore.core.items.AbstractCustomItem;
import org.lenoria.lenoriacore.core.util.data.StandardNamespacedKeys;

public class Food extends AbstractCustomItem {

    final static NamespacedKey NK_VARIANT_NAME = new NamespacedKey(LenoriaCore.getPlugin(), "food-variant");
    final static NamespacedKey NK_HUNGER = new NamespacedKey(LenoriaCore.getPlugin(), "food-hunger");
    final static NamespacedKey NK_SATURATION = new NamespacedKey(LenoriaCore.getPlugin(), "food-saturation");
    final static NamespacedKey NK_QUALITY = new NamespacedKey(LenoriaCore.getPlugin(), "food-quality");

    FoodVariant foodVariant;
    int quality;

    // TODO write a constructor which gets given a MetaData and constructs itself out of that? would be cool i think.

    @Override
    public void setPDC(PersistentDataContainer pdc) {
        pdc.set(StandardNamespacedKeys.ITEM_TYPE, PersistentDataType.STRING, "Food");
        pdc.set(NK_VARIANT_NAME, PersistentDataType.STRING, this.foodVariant.name);
        pdc.set(NK_HUNGER, PersistentDataType.INTEGER, this.foodVariant.hunger);
        pdc.set(NK_SATURATION, PersistentDataType.INTEGER, this.foodVariant.saturation);
        pdc.set(NK_QUALITY, PersistentDataType.INTEGER, this.quality);
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }
}
