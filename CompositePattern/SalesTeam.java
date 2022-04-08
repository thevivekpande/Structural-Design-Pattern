package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
//	private List<Manager>  managers=new ArrayList<>();
//	private List<SalesPerson> salesPeople=new ArrayList<>();
	private List<Payee> payees=new ArrayList<>();
	
//	void addManager(Manager manager) {
//		managers.add(manager);
//	}
	
	void addPayee(Payee payee) {
		payees.add(payee);
	}
//	
//	void addSalesPerson(SalesPerson salesPerson) {
//		salesPeople.add(salesPerson);
//	}
//	
	public void payExpenses(int amount) {
//		managers.forEach(manager -> manager.payExpenses(amount));
//		salesPeople.forEach(salesPerson ->salesPerson.payExpenses(amount));
		payees.forEach(payee -> payee.payExpenses(amount));
	}
}
