package com.cart.cart.model;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private Set<Integer> itemIds = new HashSet<>();

    public void addItem(Integer itemId) {
        itemIds.add(itemId);
    }

    public Set<Integer> getItemIds() {
        return itemIds;
    }
}
