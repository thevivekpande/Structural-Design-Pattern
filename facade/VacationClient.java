package facade;

import java.time.LocalDate;

public class VacationClient {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2022, 2, 22);
		LocalDate endDate = LocalDate.of(2022, 2, 28);
	
		VacationFacade facade=new VacationFacade();
		facade.book(startDate, endDate);
	}
}
