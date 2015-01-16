package repositories;

import domain.*;

public interface ITicketRepository extends IRepository<Ticket> {
	
	public Ticket ofPassenger(Passenger passenger);
	public Ticket ofPassenger(String name);
	public Ticket ofPassenger(int passengerId);

}
