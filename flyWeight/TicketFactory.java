package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class TicketFactory {
	private static Map<String, Ticket> ticketMap = new HashMap<String, Ticket>();
	
	public static Ticket getTicket(String type, String name, int fare) {
		Ticket ticket;
		
		if(ticketMap.containsKey(type)) {
			ticket = ticketMap.get(type);
		}else {
			ticket=new RailwayTicket(type);
			ticketMap.put(type, ticket);
		}
		
		ticket.setName(name);
		ticket.setFare(fare);
		
		return ticket;
	}
}
