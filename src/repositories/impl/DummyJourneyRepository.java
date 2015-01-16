package repositories.impl;

import java.util.List;
import domain.*;
import repositories.IJourneyRepository;

public class DummyJourneyRepository implements IJourneyRepository {
	
	private DummyDb db;
	
	public DummyJourneyRepository(DummyDb db){
		super();
		this.db = db;
	}

	public void add(Journey entity) {
		db.journeys.add(entity);
	}


	public void update(Journey entity) {
	}

	public void delete(Journey entity) {
		db.journeys.remove(entity);
	}


	public Journey get(int id) {
		for (Journey f: db.journeys){
			if(f.getId() == id)
				return f;
		}
		return null;
	}

	public List<Journey> getAll() {
		return db.journeys;
	}

	public List<Journey> byTrain(Train train) {
		return byTrain(Train.getId());
	}

	public List<Journey> byTrain(String model) {
		for (Train p: db.trains){
			if(p.getModel() == model)
				return p.getJourneys();
		}
		return null;
	}

	public List<Journey> byTrain(int trainId) {
		for (Train p: db.trains){
			if(p.getId() == trainId)
				return p.getJourneys();
		}
		return null;
	}

	public Journey withPassenger(Passenger passenger) {
		for (Journey f: db.journeys){
			if(f.getPassengers().contains(passenger))
			return f;
		}
		return null;
	}

	public Journey withPassenger(String passengerSurname) {
		for (Journey f: db.journeys){
			for (Passenger p: f.getPassengers())
				if(p.getSurname() == passengerSurname)
					return f;
		}
		return null;
	}

	public Journey withPassenger(int passengerId) {
		for (Journey f: db.journeys){
			for (Passenger p: f.getPassengers())
				if(p.getId() == passengerId)
					return f;
		}
		return null;
	}

}
