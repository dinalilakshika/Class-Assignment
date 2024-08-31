package org.example.bean;

import org.example.contract.BakeryItems;
import org.example.customAnnotation.CrispyChicken;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Chicken")
@CrispyChicken
public class ChickenRoll implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Chicken roll");
    }
}
