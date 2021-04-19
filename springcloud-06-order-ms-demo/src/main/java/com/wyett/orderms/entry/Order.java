package com.wyett.orderms.entry;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/7 18:33
 * @description: TODO
 */

public class Order {
    private long orderId;
    private String orderStatus;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
