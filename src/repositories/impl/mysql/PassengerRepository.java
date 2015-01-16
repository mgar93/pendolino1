package repositories.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Journey;
import domain.Luggage;
import domain.Passenger;
import domain.Ticket;
import repositories.IPassengerRepository;
import unitofwork.IUnitOfWork;

public class PassengerRepository extends Repository<Passenger> implements IPassengerRepository{

public PassengerRepository(Connection connection, IEntityBuilder<Passenger> builder, IUnitOfWork uow) {
	super(connection, builder, uow);
}
	
	protected String getTableName() {
		return "passengers";
	}
	
	protected String getInsertQuery() {
		return "INSERT INTO passengers (firstName, surname, age, sex, idNumber, ticketId, journeyId) VALUES (?,?,?,?,?,?,?)";
	}
	
	protected String getUpdateQuery() {
		return "UPDATE flights SET firstName=?, surname=?, age=?, sex=?, idNumber=?, ticketId=?, journeyId=?";
	}
	
	protected void setUpInsertQuery(Passenger entity) throws SQLException {
		insert.setString(1, entity.getFirstName());
		insert.setString(2, entity.getSurname());
		insert.setString(3, entity.getAge());
		insert.setString(4, entity.getSex());
		insert.setString(5, entity.getIdNumber());
		insert.setInt(6, entity.getTicketId());
		insert.setInt(7, entity.getJourneyId());
	}

	protected void setUpUpdateQuery(Passenger entity) throws SQLException {
		update.setString(1, entity.getFirstName());
		update.setString(2, entity.getSurname());
		update.setString(3, entity.getAge());
		update.setString(4, entity.getSex());
		update.setString(5, entity.getIdNumber());
		update.setInt(6, entity.getTicketId());
		update.setInt(7, entity.getJourneyId());
		update.setInt(8, entity.getId());
	}

	public Passenger withTicket(Ticket ticket) {
		return null;
	}


	public Passenger withTicket(String ticketNumber) {
		return null;
	}

	public Passenger withTicket(int ticketId) {
		return null;
	}


	public Passenger withLuggage(Luggage luggage) {
		return null;
	}

	public Passenger withLuggage(String luggageType) {
		return null;
	}


	public Passenger withLuggage(int luggageId) {
		return null;
	}

	public List<Passenger> ofFlight(Journey journey) {
		return null;
	}


	public List<Passenger> ofFlight(String destination) {
		return null;
	}


	public List<Passenger> ofJourney(int journeyId) {
		return null;
	}
}
