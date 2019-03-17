package org.cj.strategy;

public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("123", 250);
        PayState alipay = order.pay("wechat");
        System.out.println(alipay);
    }
}
