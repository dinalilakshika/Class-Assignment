
package org.example.user;
import jakarta.annotation.PostConstruct;
import org.example.contract.BakeryItems;
import org.example.customAnnotation.CrispyChicken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private BakeryItems bakeryItems;

    public Mahesh(){
        System.out.println(bakeryItems);
    }

    @Autowired
    @Qualifier("Chicken")
    @CrispyChicken
    public void setBakeryItems(BakeryItems bakeryItems){
        this.bakeryItems = bakeryItems;
    }

    @PostConstruct
    public void init(){
        bakeryItems.eat();
    }

}
