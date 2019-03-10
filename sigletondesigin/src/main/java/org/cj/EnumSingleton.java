package org.cj;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {
    INSTANCE;
    private static Object data = new Object();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        EnumSingleton.data = data;
    }

    public static Object getInstance() {
        return data;
    }

}
