package org.lenoria.lenoriacore.custom.util;

public class CustomBlockID {
    final int MAX_ID = 120;

    int ID;

    public CustomBlockID(int ID) {
        if(ID > MAX_ID || ID < 0) {
            throw new IllegalArgumentException("Custom Block ID is out of the acceptable range (0-120).");
        } this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
