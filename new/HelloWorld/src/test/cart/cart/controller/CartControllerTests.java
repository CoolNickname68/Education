package com.cart.cart.controller;

import com.cart.cart.service.CartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CartController.class)
public class CartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CartService cartService;

    @BeforeEach
    public void setUp() {
        cartService = new CartService();
    }

    @Test
    public void testAddItem() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/order/add")
                .param("itemIds", "1"))
                .andExpect(status().isOk());

        Set<Integer> items = cartService.getItemIds();
        assertTrue(items.contains(1));
    }

    @Test
    public void testGetItems() throws Exception {
        cartService.addItem(1);
        mockMvc.perform(MockMvcRequestBuilders.get("/order/get"))
                .andExpect(status().isOk());

        Set<Integer> items = cartService.getItemIds();
        assertTrue(items.contains(1));
    }
}

