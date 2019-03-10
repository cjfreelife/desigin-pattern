package org.cj;

import java.util.concurrent.ConcurrentHashMap;

public class ContainnerSingleton {

    private static ConcurrentHashMap<String, ContainnerSingleton> map = new ConcurrentHashMap();

    private ContainnerSingleton() {
    }

    public static ContainnerSingleton getInstance(String className) {
        synchronized (map) {
            if (!map.containsKey(className)) {
                ContainnerSingleton containnerSingleton = new ContainnerSingleton();
                map.put(className, containnerSingleton);
                return containnerSingleton;
            } else {
                return map.get(className);
            }
        }
    }
}
