package com.cart.cart.service;

import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.cart.cart.model.Cart;

@Service
@SessionScope
public class CartService {
    private final Cart cart = new Cart();

    public void addItem(Integer itemId) {
        if (itemId == null || itemId <= 0) {
            throw new IllegalArgumentException("Invalid item ID: " + itemId);
        }
        cart.addItem(itemId);
    }

    public void addItems(Integer[] itemIds) {
        if (itemIds == null || itemIds.length == 0) {
            throw new IllegalArgumentException("Item IDs cannot be null or empty");
        }
        for (Integer itemId : itemIds) {
            addItem(itemId);  // Reuse the addItem method to ensure validation
        }
    }

    public Set<Integer> getItemIds() {
        return cart.getItemIds();
    }
}
