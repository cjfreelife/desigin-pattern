package org.cj.strategy;

public class WechatPay extends PayMent {
    public String getName() {
        return "微信支付";
    }

    public double queryBalance() {
        return 300;
    }
}
