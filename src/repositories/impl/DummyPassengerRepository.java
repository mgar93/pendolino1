package repositories.impl;

import java.util.List;

import domain.*;
import repositories.*;

public class DummyPassengerRepository implements IPassengerRepository {

	
	private DummyDb db;
	
	public DummyPassengerRepository(DummyDb db){
		super();
		this.db = db;
	}
	
	public void add(Passenger entity) {
		db.passengers.add(entity);
	}

	public void update(Passenger entity) {
		
	}

	public void delete(Passenger entity) {
		db.passengers.remove(entity);
	}

	public Passenger get(int id) {
		for (Passenger p: db.passengers){
			if(p.getId() == id)
				return p;
		}
		return null;
	}

	public List<Passenger> getAll() {
		return db.passengers;
	}

	
	public Passenger withTicket(Ticket ticket) {
		for (Passenger p: db.passengers){
			if(p.getTicket() == ticket)
			return p;
		}
		return null;
	}

	public Passenger withTicket(String ticketNumber) {
		for (Passenger p: db.passengers){
			if(p.getTicket().getTicketNumber() == ticketNumber)
				return p;
		}
		return null;
	}

	
	public Passenger withTicket(int ticketId) {
		for (Passenger p: db.passengers){
			if(p.getTicket().getId() == ticketId)
				return p;
		}
		return null;
	}

	
	public Passenger withLuggage(Luggage luggage) {
		for (Passenger p: db.passengers){
			if(p.getLuggages().contains(luggage))
				return p;
		}
		return null;
	}

	
	public Passenger withLuggage(String luggageType) {
		for (Luggage l: db.luggages){
			if(l.getType() == luggageType)
				return l.getPassenger();
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
	
	public Passenger withLuggage(int luggageId) {
		for (Passenger p: db.passengers){
			for (Luggage l: p.getLuggages())
				if(l.getId() == luggageId);
					return p;
		}
		return null;
	}

	
	public List<Passenger> ofJourney(Journey flight) {
		return ofFlight(journey.getId());
	}

	
	public List<Passenger> ofJourney(String destination) {
		for (Journey f: db.journeys){
			if(f.getDestination() == destination)
				return f.getPassengers();
		}
		return null;
	}

	
	public List<Passenger> ofJourney(int journeyId) {
		for (Journey f: db.journeys){
			if(f.getId() == journeyId)
				return f.getPassengers();
		}
		return null;
	}
	

}
