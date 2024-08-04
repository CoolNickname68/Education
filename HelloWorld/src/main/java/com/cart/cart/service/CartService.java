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
        cart.addItem(itemId);
    }

    public void addItems(Integer[] itemIds) {
        for (Integer itemId : itemIds) {
            cart.addItem(itemId);
        }
    }

    public Set<Integer> getItemIds() {
        return cart.getItemIds();
    }
}
