package org.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    public void shouldBeAbleToCreateANewOrder() {
        Order order = new Order(23);
        assertNotNull(order);

    }



}