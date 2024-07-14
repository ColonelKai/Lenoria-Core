package org.lenoria.lenoriacore.core.util.data;

import org.bukkit.persistence.PersistentDataContainer;

public interface PersistentlySaved {
    public void save();

    public void load();
}
