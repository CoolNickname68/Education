package com.cart.cart.controller;
import java.util.Set;
import com.cart.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@RequestMapping("/order")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
    public void addItem(@RequestParam Integer[] itemIds) {
        cartService.addItems(itemIds);
    }

    @GetMapping("/get")
    public Set<Integer> getItems() {
        return cartService.getItemIds();
    }
}
