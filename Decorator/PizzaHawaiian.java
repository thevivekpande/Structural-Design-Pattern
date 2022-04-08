package Decorator;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {

  ArrayList toppings = new ArrayList<String>();
  String name = "Hawaiiian";

  public PizzaHawaiian() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("ham");
    toppings.add("pineapple");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}
