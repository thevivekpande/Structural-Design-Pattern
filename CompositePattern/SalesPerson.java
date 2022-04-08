package CompositePattern;

public class SalesPerson implements Payee {

	private String name;
	private Manager manager;
	
	public SalesPerson(String name, Manager manager) {
		this.name=name;
		this.manager=manager;
	}
	
	public void payExpenses(int amount) {
		// TODO Auto-generated method stub
		System.out.println(name+" has been paid $ "+amount);
	}

}
