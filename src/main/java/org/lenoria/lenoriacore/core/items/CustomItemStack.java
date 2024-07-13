package org.lenoria.lenoriacore.core.items;

import org.bukkit.inventory.ItemStack;

public class CustomItemStack<T extends AbstractCustomItem> {

    T customItem;

    ItemStack itemStack;

    public CustomItemStack(T customItem, ItemStack itemStack) {
        this.customItem = customItem;
        this.itemStack = itemStack;
    }

    public void save() {
        customItem.setPDC(
                itemStack.getItemMeta().getPersistentDataContainer()
        );
    }

    public void load() {

    }

    public T getCustomItem() {
        return customItem;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
