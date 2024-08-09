package com.cart.cart.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    private CartService cartService;

    @BeforeEach
    public void setUp() {
        cartService = new CartService();
    }

    @Test
    public void testAddItem() {
        cartService.addItem(1);
        Set<Integer> items = cartService.getItemIds();
        assertTrue(items.contains(1));
    }

    @Test
    public void testAddItems() {
        Integer[] itemsToAdd = {2, 3, 4};
        cartService.addItems(itemsToAdd);
        Set<Integer> items = cartService.getItemIds();
        assertTrue(items.contains(2));
        assertTrue(items.contains(3));
        assertTrue(items.contains(4));
    }

    @Test
    public void testGetItemIds() {
        cartService.addItem(5);
        Set<Integer> items = cartService.getItemIds();
        assertEquals(1, items.size());
        assertTrue(items.contains(5));
    }
}
