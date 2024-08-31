package org.example.bean;

import org.example.contract.BakeryItems;
import org.example.context.annotation.Primary;
import org.example.stereotype.Component;

@Component
@Primary
public class FishPastry implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Fish Pastry");
    }
}
