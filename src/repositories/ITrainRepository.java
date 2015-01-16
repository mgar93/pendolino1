package repositories;

import domain.*;

public interface ITrainRepository extends IRepository<Train> {
	
	public Train ofFlight(Journey journey);
	public Train ofFlight(String journeyTo);
	public Train ofFlight(int journeyId);

}
