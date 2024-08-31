package org.example.bean;

import org.example.contract.BakeryItems;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Fish Bun");
    }
}
