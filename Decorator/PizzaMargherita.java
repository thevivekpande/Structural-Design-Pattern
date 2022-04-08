package Decorator;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza {

  ArrayList toppings = new ArrayList<String>();
  String name = "Margherita";

  public PizzaMargherita() {
    toppings.add("cheese");
    toppings.add("tomato");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }



}
