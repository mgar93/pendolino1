package repositories.impl;

import java.util.List;

import domain.*;
import repositories.*;

public class DummyTicketRepository implements ITicketRepository{


	private DummyDb db;
	
	public DummyTicketRepository(DummyDb db){
		super();
		this.db = db;
	}
	
	public void add(Ticket entity) {
		db.tickets.add(entity);
	}

	
	public void update(Ticket entity) {
	}

	
	public void delete(Ticket entity) {
		db.tickets.remove(entity);
	}

	
	public Ticket get(int id) {
		for (Ticket t: db.tickets){
			if(t.getId() == id)
				return t;
		}
		return null;
	}

	
	public List<Ticket> getAll() {
		return db.tickets;
	}

	
	public Ticket ofPassenger(Passenger passenger) {
		for (Ticket t: db.tickets){
			if(t.getPassenger() == passenger)
				return t;
		}
		return null;
	}

	
	public Ticket ofPassenger(String name) {
		for (Ticket t: db.tickets){
			if(t.getPassenger().getSurname() == name)
				return t;
		}
		return null;
	}

	
	public Ticket ofPassenger(int passengerId) {
		for (Ticket t: db.tickets){
			if(t.getPassenger().getId() == passengerId)
				return t;
		}
		return null;
	}

}
