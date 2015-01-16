package repositories;

import java.util.List;
import domain.*;

public interface IPassengerRepository extends IRepository<Passenger> {
	
	public Passenger withTicket(Ticket ticket);
	public Passenger withTicket(String ticketNumber);
	public Passenger withTicket(int ticketId);
	
	public Passenger withLuggage(Luggage luggage);
	public Passenger withLuggage(String luggageType);
	public Passenger withLuggage(int luggageId);
	
	public List<Passenger> ofFlight(Journey journey);
	public List<Passenger> ofFlight(String destination);
	public List<Passenger> ofFlight(int journeyId);

}
