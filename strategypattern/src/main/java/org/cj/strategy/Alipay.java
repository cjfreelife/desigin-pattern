package org.cj.strategy;

public class Alipay extends PayMent {
    public String getName() {
        return "支付宝";
    }

    public double queryBalance() {
        return 200;
    }
}
