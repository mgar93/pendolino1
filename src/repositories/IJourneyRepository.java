package repositories;

import java.util.List;
import domain.*;

public interface IJourneyRepository extends IRepository<Journey> {
	
	public List<Journey> byTrain(Train plane);
	public List<Journey> byTrain(String model);
	public List<Journey> byTrain(int planeId);
	
	public Journey withPassenger(Passenger passenger);
	public Journey withPassenger(String passengerSurname);
	public Journey withPassenger(int passengerId);
	
	
}
