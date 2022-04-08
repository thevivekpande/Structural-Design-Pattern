package flyWeight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicketBookingSystem {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Ticket ticket;
		
		for(int i=0;i<10;i++) {
			System.out.println("Enter ticket type, name and fare.");
			String[] stringList=br.readLine().split(" ");
			ticket = TicketFactory.getTicket(stringList[0], stringList[1], Integer.parseInt(stringList[2]));
			ticket.printTicket();
		}

	}

}
