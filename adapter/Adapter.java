package adapter;

public class Adapter implements PriceCalculator {

  UKCarPriceCalculator calculator;

  public Adapter(UKCarPriceCalculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public String calculatePrice() {
    return calculator.getPrice() + "GBP";
  }
}
