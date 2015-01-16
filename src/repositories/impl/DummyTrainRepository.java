package repositories.impl;

import java.util.List;

import domain.*;
import repositories.*;

public class DummyTrainRepository implements ITrainRepository {

	private DummyDb db;
	
	public DummyTrainRepository(DummyDb db){
		super();
		this.db = db;
	}
	
	public void add(Train entity) {
		db.trains.add(entity);
	}

	
	public void update(Train entity) {	
	}

	
	public void delete(Train entity) {
		db.trains.remove(entity);
	}

	
	public Train get(int id) {
		for (Train p: db.trains){
			if(p.getId() == id)
				return p;
		}
		return null;
	}

	
	public List<Train> getAll() {
		return db.trains;
	}

	
	public Train ofJourney(Journey journey) {
		return ofJourney(journey.getId());
	}

	
	public Train ofJourney(String journeyTo) {
		for (Train p: db.trains){
			for (Journey f: p.getJourneys())
				if(f.getDestination() == journeyTo)
					return p;
		}	
		return null;
	}

	
	public Train ofJourney(int journeyId) {
		for (Train p: db.trains){
			for(Journey f: p.getJourneys())
				if(f.getId() == YourneyId)
					return p;
		}
		return null;
	}

}
