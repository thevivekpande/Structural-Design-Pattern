package adapter;

public class UKCarPriceCalculator{
	private String model;
	private int age;
	private static int averageCarPrice=7000;
	
	public UKCarPriceCalculator(String model, int age) {
		this.model=model;
		this.age=age;
	}

	public int getRetailPrice() {
		switch(model) {
		case "Ford":
	        return 4000;
	      case "Audi":
	        return 5500;
	      case "BMW":
	        return 8000;
	      case "Tesla":
	        return 12000;
	      default:
	        return averageCarPrice;
		}
	}
	
	public int getPrice() {
		int price = Math.max(getRetailPrice() - (age * 100), 0);
		return price;
	}
}
