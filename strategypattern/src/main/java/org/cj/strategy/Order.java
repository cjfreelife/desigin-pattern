package org.cj.strategy;

public class Order {
    private String orderNo;
    private double price;

    public Order(String orderNo, double price) {
        this.orderNo = orderNo;
        this.price = price;
    }

    public PayState pay(String payKey) {
        PayMent payStrategy = PayStrategy.getPayStrategy(payKey);
        PayState pay = payStrategy.pay(orderNo, price);
        return pay;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
