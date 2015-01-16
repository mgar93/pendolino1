package repositories.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Journey;
import domain.Passenger;
import domain.Train;
import repositories.IJourneyRepository;
import unitofwork.IUnitOfWork;
import unitofwork.UnitOfWork;

public class JourneyRepository extends Repository<Journey> implements IJourneyRepository{

public JourneyRepository(Connection connection, IEntityBuilder<Journey> builder, IUnitOfWork uow) {
	super(connection, builder, uow);
}
	

	protected String getTableName() {
		return "journeys";
	}
	
	protected String getInsertQuery() {
		return "INSERT INTO journeys (departureDate, departurePlace, destination, distance, trainline, trainId) VALUES (?,?,?,?,?,?)";
	}
	
	protected String getUpdateQuery() {
		return "UPDATE journeys SET departureDate=?, departurePlace=?, destination=?, distance=?, trainline=?, trainId=?";
	}
	
	protected void setUpInsertQuery(Journey entity) throws SQLException {
		insert.setString(1, entity.getDepartureDate());
		insert.setString(2, entity.getDeparturePlace());
		insert.setString(3, entity.getDestination());
		insert.setString(4, entity.getDistance());
		insert.setString(5, entity.getTrainline());
		insert.setInt(6, entity.getTrainId());
	}

	protected void setUpUpdateQuery(Journey entity) throws SQLException {
		update.setString(1, entity.getDepartureDate());
		update.setString(2, entity.getDeparturePlace());
		update.setString(3, entity.getDestination());
		update.setString(4, entity.getDistance());
		update.setString(5, entity.getTrainline());
		update.setInt(6, entity.getTrainId());
		update.setInt(7, entity.getId());
	}

	
	public List<Journey> byTrain(Train train) {
		return null;
	}

	public List<Journey> byTrain(String model) {
		return null;
	}

	public List<Journey> byTrain(int trainId) {
		return null;
	}

	public Journey withPassenger(Passenger passenger) {
		return null;
	}

	public Journey withPassenger(String passengerSurname) {
		return null;
	}

	public Journey withPassenger(int passengerId) {
		return null;
	}
	
}
