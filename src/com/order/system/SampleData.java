package com.order.system;

import com.order.system.model.Order;

import java.util.List;

public class SampleData {

    public static List<Order> getSampleData(){
        return List.of(
                new Order(1, "John", "Laptop", "Electronics", 1200, 1, "Toronto"),
                new Order(2, "Alice", "Phone", "Electronics", 800, 1, "Toronto"),
                new Order(3, "Bob", "Shoes", "Fashion", 120, 2, "Vancouver"),
                new Order(4, "John", "T-shirt", "Fashion", 40, 3, "Toronto"),
                new Order(5, "Mary", "Blender", "Home", 150, 1, "Calgary"),
                new Order(6, "Alice", "Headphones", "Electronics", 200, 2, "Toronto"),
                new Order(7, "Cynthia", "Watch", "Electronics", 300, 3, "Vancouver"),
                new Order(8, "Tina", "TV", "Electronics", 800, 1, "London"),
                new Order(9, "Alice", "Headphones", "Electronics", 200, 2, "Toronto"),
                new Order(10, "Daniel", "Toaster", "Electronics", 200, 2, "Surrey"),
                new Order(11, "Smith", "Pants", "Fashion", 200, 2, "London"),
                new Order(12, "Bob", "Jeans", "Fashion", 200, 2, "Toronto"),
                new Order(13, "Ramen", "Electric Kettle", "Electronics", 200, 2, "Toronto"),
                new Order(14, "Kelly", "Refrigerator", "Electronics", 200, 2, "Edmonton"),
                new Order(15, "Jonah", "Washing Machine", "Electronics", 200, 2, "Yukon"),
                new Order(16, "Stacy", "Dishwasher", "Electronics", 200, 3, "Yukon"),
                new Order(17, "Brian", "Shoes", "Fashion", 200, 2, "Toronto"),
                new Order(18, "Garrett", "Hoodie", "Electronics", 200, 2, "Toronto"),
                new Order(19, "Seema", "Cap", "Fashion", 200, 5, "Edmonton"),
                new Order(20, "Alice", "Headphones", "Electronics", 200, 2, "Toronto")
        );
    }
}
