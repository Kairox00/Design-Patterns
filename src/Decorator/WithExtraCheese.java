package Decorator;

import java.util.ArrayList;

public class WithExtraCheese implements Pizza{
    Pizza pizza;
    ArrayList toppings;

    public WithExtraCheese(Pizza pizza){
        this.pizza = pizza;
        toppings = pizza.getToppings();
        toppings.add("extra cheese");
    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
