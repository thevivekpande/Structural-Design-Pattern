package CompositePattern;

public class Manager implements Payee{
	private String name;
	
	public Manager(String name) {
		this.name=name;
	}
	
	public void payExpenses(int amount) {
		System.out.println(name+"has been paid $"+amount);
	}
}
