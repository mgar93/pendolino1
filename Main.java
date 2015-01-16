import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.*;
import repositories.IJourneyRepository;
import repositories.ILuggageRepository;
import repositories.IPassengerRepository;
import repositories.IRepositoryCatalog;
import repositories.IRepository;
import repositories.ITrainRepository;
import repositories.ITicketRepository;
import repositories.impl.DummyRepositoryCatalog;
import repositories.impl.mysql.JourneyBuilder;
import repositories.impl.mysql.JourneyRepository;
import repositories.impl.mysql.PassengerBuilder;
import repositories.impl.mysql.PassengerRepository;
import repositories.impl.mysql.IEntityBuilder;
import repositories.impl.mysql.LuggageBuilder;
import repositories.impl.mysql.LuggageRepository;
import repositories.impl.mysql.TrainBuilder;
import repositories.impl.mysql.TrainRepository;
import repositories.impl.mysql.TicketBuilder;
import repositories.impl.mysql.TicketRepository;
import unitofwork.IUnitOfWork;
import unitofwork.UnitOfWork;


public class Main {

	public static void main(String[] args) {
		
		String user = "mg12";
		String password = "qwerty";
		String url = "jdbc:mysql://localhost/mg1";
		
		
		Journey lot = new Journey();
		lot.setDepartureDate("12-12-2014 10:35");
		lot.setDeparturePlace("Gdansk");
		lot.setDestination("Warszawa");
		lot.setDistance("324 km");
		lot.setTrainline("PKP");
		lot.setTrainId(1);
		
		Train pociag = new Train();
		pociag.setManufacturer("Alstom");
		pociag.setModel("Pendolino");
		pociag.setCapacity("400");
		pociag.setRegNumber("PE-NDO");
		
		Luggage torba = new Luggage();
		torba.setSize("34x20x50");
		torba.setWeight("10 kg");
		torba.setType("podreczny");
		torba.setPassengerId(1);
		
		Passenger pasazer = new Passenger();
		pasazer.setFirstName("Piotr");
		pasazer.setSurname("Garski");
		pasazer.setAge("21");
		pasazer.setSex("M");
		pasazer.setIdNumber("AUK 768068");
		pasazer.setTicketId(1);
		pasazer.setJourneyId(1);
		
		Ticket bilet = new Ticket();
		bilet.setPrice("48.00 zl");
		bilet.setTicketNumber("086989");
		bilet.setPassengerId(1);
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			UnitOfWork uow = new UnitOfWork(connection);
			
			String createTablejourney = 
							"CREATE TABLE journey("
							+ "id int AUTO_INCREMENT PRIMARY KEY,"
							+ "departureDate VARCHAR(20),"
							+ "departurePlace VARCHAR(20),"
							+ "destination VARCHAR(20),"
							+ "distance VARCHAR(20),"
							+ "train VARCHAR(20),"
							+ "trainId INT"
							+ ")";
			
			String createTableTraines =
							"CREATE TABLE trains("
							+ "id int AUTO_INCREMENT PRIMARY KEY,"
							+ "manufacturer VARCHAR(20),"
							+ "model VARCHAR(20),"
							+ "capacity VARCHAR(20),"
							+ "regNumber VARCHAR(20)"
							+ ")";
			
			String createTableLuggages = 
							"CREATE TABLE luggages("
							+ "id int AUTO_INCREMENT PRIMARY KEY,"
							+ "size VARCHAR(20),"
							+ "weight VARCHAR(20),"
							+ "type VARCHAR(20),"
							+ "passengerId INT"
							+ ")";
			
			String createTablePassengers =
							"CREATE TABLE passengers("
							+ "id int AUTO_INCREMENT PRIMARY KEY,"
							+ "firstName VARCHAR(20),"
							+ "surname VARCHAR(20),"
							+ "age VARCHAR(20),"
							+ "sex VARCHAR(20),"
							+ "idNumber VARCHAR(20),"
							+ "ticketId Int,"
							+ "jouneyId INT"
							+ ")";
			
			String createTableTickets =
							"CREATE TABLE tickets("
							+ "id int AUTO_INCREMENT PRIMARY KEY,"
							+ "price VARCHAR(20),"
							+ "ticketNumber VARCHAR(20),"
							+ "passengerId INT"
							+ ")";
			
			Statement statement = connection.createStatement();
			statement.executeUpdate(createTableJourneys);
			statement.executeUpdate(createTableTrains);
			statement.executeUpdate(createTableLuggages);
			statement.executeUpdate(createTablePassengers);
			statement.executeUpdate(createTableTickets);
			
			
			IFJourneyRepository journeys = new JourneyRepository(connection, new JourneyBuilder(), uow);
			ILuggageRepository luggages = new LuggageRepository(connection, new LuggageBuilder(), uow);
			ITrainRepository trains = new TrainRepository(connection, new TrainBuilder(), uow);
			IPassengerRepository passengers = new PassengerRepository(connection, new PassengerBuilder(), uow);
			ITicketRepository tickets = new TicketRepository(connection, new TicketBuilder(), uow);
			
			journeys.add(podroz);
			luggages.add(torba);
			train.add(pociag);
			passengers.add(pasazer);
			tickets.add(bilet);
			
			uow.commit();
			
			String dropTableJourneys =
					"DROP TABLE journeys";
			
			String dropTableLuggages =
					"DROP TABLE luggages";
			
			String dropTableTraines =
					"DROP TABLE trains";
			
			String dropTablePassengers =
					"DROP TABLE passengers";
			
			String dropTableTickets = 
					"DROP TABLE tickets";
			
			
			
//			statement.executeUpdate(dropTableJournes);
//			statement.executeUpdate(dropTableLuggages);
//			statement.executeUpdate(dropTableTrains);
//			statement.executeUpdate(dropTablePassengers);
//			statement.executeUpdate(dropTableTickets);
		}
		 catch (SQLException e) {
			 e.printStackTrace();
		 }
	}

}
