package repositories.impl;

import repositories.*;

public class DummyRepositoryCatalog implements IRepositoryCatalog {

	DummyDb db = new DummyDb();
	
	public IJourneyRepository getFlights() {
		return new DummyJourneyRepository(db);
	}

	public ILuggageRepository getLuggages() {
		return new DummyLuggageRepository(db);
	}

	public IPassengerRepository getPassengers() {
		return new DummyPassengerRepository(db);
	}

	public ITicketRepository getTickets() {
		return new DummyTicketRepository(db);
	}

	public ITrainRepository getPlanes() {
		return new DummyTrainRepository(db);
	}
	
	

}
