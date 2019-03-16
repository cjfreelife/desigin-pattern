package org.cj.jdkdynamicproxy;

import org.cj.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {
    private Person person;

    /**
     * 通过jdk—reflector.Proxy 根据接口生产一个实现该接口的类，里面包含类里的所有方法
     *
     * @param target
     * @return
     */
    public Object getInstance(Person target) {

        person = target;
        Class<? extends Person> clz = target.getClass();
        Object o = Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
        return o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.person, args);
        after();
        return invoke;
    }


    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }
}
