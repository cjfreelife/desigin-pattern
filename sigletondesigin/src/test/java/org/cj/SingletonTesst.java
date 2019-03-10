package org.cj;

import org.junit.Test;

import java.io.*;

public class SingletonTesst {
    @Test
    public void testHungrySingleton() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testLazySingleton() {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }
        });
        thread2.start();
        System.out.println("end");
    }

    @Test
    public void testDoubleSingleton() {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
                System.out.println(instance);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
                System.out.println(instance);
            }
        });
        thread2.start();
        System.out.println("end");
    }

    @Test
    public void testInnerClassSingleton() {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println(instance);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println(instance);
            }
        });
        thread1.start();
        thread2.start();
        System.out.println("end");
    }

    @Test
    public void testSerialzableSingleton() {
        HungrySingleton instance = HungrySingleton.getInstance();
        try (FileOutputStream fileOutputStream = new FileOutputStream("testSerialzableSingleton");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            System.out.println(instance);
            objectOutputStream.writeObject(instance);
            FileInputStream fileInputStream = new FileInputStream("testSerialzableSingleton");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEnumSingleton() {
        Object instance1 = EnumSingleton.getInstance();
        Object instance2 = EnumSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testContainnerSingleton() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                ContainnerSingleton instance = ContainnerSingleton.getInstance("contain");
                System.out.println(instance);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                ContainnerSingleton instance = ContainnerSingleton.getInstance("contain");
                System.out.println(instance);
            }
        });
        thread1.start();
        thread2.start();
        System.out.println("end");
    }
}
