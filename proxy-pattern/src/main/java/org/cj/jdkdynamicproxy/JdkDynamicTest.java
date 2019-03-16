package org.cj.jdkdynamicproxy;

import org.cj.staticproxy.Person;
import org.cj.staticproxy.Son;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JdkDynamicTest {
    @Test
    public void testJDKDynamic() {
        Son son = new Son();
        Object instance = new JDKMeipo().getInstance(son);
        Method findLove = null;
        try {
            findLove = instance.getClass().getMethod("findLove", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            findLove.invoke(instance, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(1 << 29);
//        System.out.println(instance);
//        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//        FileOutputStream os = null;
//        try {
//            os = new FileOutputStream("D://$Proxy0.class");
//            os.write(bytes);
//            os.close();;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
