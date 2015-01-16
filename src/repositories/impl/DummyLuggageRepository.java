package repositories.impl;

import java.util.List;

import domain.*;
import repositories.*;

public class DummyLuggageRepository implements ILuggageRepository {

	private DummyDb db;
	
	public DummyLuggageRepository(DummyDb db){
		super();
		this.db = db;
	}

	public void add(Luggage entity) {
		db.luggages.add(entity);
		
	}

	
	public void update(Luggage entity) {
		
	}

	
	public void delete(Luggage entity) {
		db.luggages.remove(entity);
		
	}

	
	public Luggage get(int id) {
		for (Luggage l: db.luggages){
			if(l.getId() == id)
				return l;
		}
		return null;
	}

	
	public List<Luggage> getAll() {
		return db.luggages;
	}

	public List<Luggage> ofPassenger(Passenger passenger) {
		return ofPassenger(passenger.getId());
		}
	
	public List<Luggage> ofPassenger(String name) {
		for (Passenger p: db.passengers){
			if(p.getSurname() == name)
				return p.getLuggages();
		}
		return null;
	}

	
	public List<Luggage> ofPassenger(int passengerId) {
		for (Passenger p: db.passengers){
			if(p.getId() == passengerId)
				return p.getLuggages();
		}
		return null;
				
	}

}
