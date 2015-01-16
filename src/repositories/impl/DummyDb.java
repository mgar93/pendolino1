package repositories.impl;

import java.util.List;
import java.util.ArrayList;

import domain.*;

public class DummyDb {

		public List<Journey> journeys;
		public List<Luggage> luggages;
		public List<Passenger> passengers;
		public List<Train> trains;
		public List<Ticket> tickets;
		
		public DummyDb() {
			journeys = new ArrayList<>();
			luggages = new ArrayList<>();
			passengers = new ArrayList<>();
			trains = new ArrayList<>();
			tickets = new ArrayList<>();
		}
}
