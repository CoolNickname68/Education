package com.cart.cart.controller;

import java.util.Set;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.cart.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
    public void addItem(@RequestParam @NotNull @NotEmpty Integer[] itemIds) {
        cartService.addItems(itemIds);
    }

    @GetMapping("/get")
    public Set<Integer> getItems() {
        return cartService.getItemIds();
    }
}

