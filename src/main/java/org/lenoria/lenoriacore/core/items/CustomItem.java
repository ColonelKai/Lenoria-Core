package org.lenoria.lenoriacore.core.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;

public interface CustomItem {

    void setPDC(PersistentDataContainer pdc);

    ItemStack getItemStack();
}
