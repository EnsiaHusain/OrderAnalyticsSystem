package com.order.system.model;

public class Order {

    private int orderId;
    private String customerName;
    private String product;
    private String category;
    private double price;
    private int quantity;
    private String city;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Order(){

    }

    public Order(int orderId, String customerName, String product,
                 String category, double price, int quantity, String city) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Order { "+
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", city='" + city + '\'' +
                '}';
    }
}
