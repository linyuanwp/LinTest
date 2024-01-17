package org.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private final int id;
    private final String description;
    private final List<LineItem> itemList;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
        itemList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
//        List<LineItem> itemList = new ArrayList<>();
        return itemList.stream()
                .mapToDouble(LineItem::getPrice)
                .sum();
    }

}
