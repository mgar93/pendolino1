package repositories;

import java.util.List;
import domain.*;

public interface ILuggageRepository extends IRepository<Luggage> {
	
	public List<Luggage> ofPassenger(Passenger passenger);
	public List<Luggage> ofPassenger(String name);
	public List<Luggage> ofPassenger(int passengerId);
	
}
