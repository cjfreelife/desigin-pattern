package org.cj.strategy;

/**
 * 策略模式，根据不同的需求获取不同算法
 */
public abstract class PayMent {
    public abstract String getName();

    public abstract double queryBalance();

    public PayState pay(String uid, double amount) {
        if (this.queryBalance() > amount) {
            return new PayState(200, "支付成功", "支付金额为" + amount);
        }
        return new PayState(500, "支付失败", "账户余额为" + this.queryBalance() + ",需要金额为:" + amount);
    }
}
