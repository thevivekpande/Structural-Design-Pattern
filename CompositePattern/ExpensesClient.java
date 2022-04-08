package CompositePattern;

public class ExpensesClient {
	public static void main(String[] args) {
		
		Manager vivek=new Manager("vivek");
		SalesPerson pandey=new SalesPerson("pandey", vivek);
		SalesPerson virat=new SalesPerson("virat", vivek);
//		
//		SalesTeam team=new SalesTeam();
//		team.addManager(vivek);
//		team.addSalesPerson(pandey);
//		team.addSalesPerson(virat);
//		
//		payManager(vivek, 100);
//		paySalesPerson(pandey, 300);
//		payTeam(team, 200);
		
		SalesTeam team =new SalesTeam();
		team.addPayee(vivek);
		team.addPayee(pandey);
		team.addPayee(virat);
		
		payPayee(vivek, 100);
		payPayee(pandey, 300);
		payPayee(virat, 200);
		payPayee(team, 400);
		
	}
	
//	private static void payManager(Manager manager, int amount) {
//		System.out.println("Expenses have been requested.");
//		manager.payExpenses(amount);
//		System.out.println("Expenses have been paid\n");
//	}
//	
//	private static void paySalesperson(SalesPerson salesPerson, int amount) {
//		System.out.println("Expenses have been requested.");
//		salesPerson.payExpenses(amount);
//		System.out.println("Expenses have been paid\n");
//	}
//	
//	private static void payTeam(SalesTeam team, int amount) {
//		System.out.println("Expenses have been requested.");
//		team.payExpenses(amount);
//		System.out.println("Expenses have been paid\n");
//	}
	
	private static void payPayee(Payee payee, int amount) {
		System.out.println("Expenses have been requested.");
		payee.payExpenses(amount);
		System.out.println("Expenses have been paid.\n");
	}
}
