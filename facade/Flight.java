package facade;

import java.time.LocalDate;

public class Flight {
	
	public void bookOutWardJourney(LocalDate startDate) {
		// TODO Auto-generated method stub
		System.out.println("OutWard Flight has been booked for "+startDate+".");
	}

	public void bookReturnJourney(LocalDate endDate) {
		// TODO Auto-generated method stub
		System.out.println("Return Flight has been booked for "+endDate);
	}

}
