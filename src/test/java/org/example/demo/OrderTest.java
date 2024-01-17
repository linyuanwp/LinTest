package org.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    public void shouldBeAbleToCreateANewOrder() {
        String desc = "Description";
        Order order = new Order(23, desc);
        assertNotNull(order);
        assertEquals(desc, order.getDescription());

    }



}