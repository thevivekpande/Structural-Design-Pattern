package adapter;

public class Main {

  public static void main(String[] args) {
    CarPriceCalculator carPriceCalculator = new CarPriceCalculator("BMW", 5);
    printVehiclePrice(carPriceCalculator);

    TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
    printVehiclePrice(truckPriceCalculator);

    UKCarPriceCalculator UKCarPriceCalculator = new UKCarPriceCalculator("BMW", 5);
    Adapter adapter = new Adapter(UKCarPriceCalculator);
    printVehiclePrice(adapter);
  }

  public static void printVehiclePrice(PriceCalculator calculator) {
    String price = calculator.calculatePrice();
    System.out.println("The price of vehicle is: " + price);
  }

}
