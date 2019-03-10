package org.cj;

public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
