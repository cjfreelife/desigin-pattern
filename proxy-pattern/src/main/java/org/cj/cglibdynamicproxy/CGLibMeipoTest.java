package org.cj.cglibdynamicproxy;

import org.cj.staticproxy.Son;

public class CGLibMeipoTest {
    public static void main(String[] args) {
        CGLibMeipo cgLibMeipo = new CGLibMeipo();
        Customer instance = (Customer) cgLibMeipo.getInstance(Customer.class);
        instance.findLove();

    }
}
