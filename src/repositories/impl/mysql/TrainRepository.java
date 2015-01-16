package repositories.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Journey;
import domain.Train;
import repositories.ITrainRepository;
import unitofwork.IUnitOfWork;

public class TrainRepository extends Repository<Train> implements ITrainRepository{

public TrainRepository(Connection connection, IEntityBuilder<Train> builder, IUnitOfWork uow) {
	super(connection, builder, uow);
}
	
	protected String getTableName() {
		return "trains";
	}
	
	protected String getInsertQuery() {
		return "INSERT INTO trains (manufacturer, model, capacity, regNumber) VALUES (?,?,?,?)";
	}
	
	protected String getUpdateQuery() {
		return "UPDATE trains SET manufacturer=?, model=?, capacity=?, regNumber=?";
	}
	
	protected void setUpInsertQuery(Train entity) throws SQLException {
		insert.setString(1, entity.getManufacturer());
		insert.setString(2, entity.getModel());
		insert.setString(3, entity.getCapacity());
		insert.setString(4, entity.getRegNumber());
	}

	protected void setUpUpdateQuery(Train entity) throws SQLException {
		update.setString(1, entity.getManufacturer());
		update.setString(2, entity.getModel());
		update.setString(3, entity.getCapacity());
		update.setString(4, entity.getRegNumber());
		update.setInt(5, entity.getId());
	}

	public Train ofJourney(Journey journey) {
		return null;
	}

	public Train ofJourney(String journeyTo) {
		return null;
	}

	public Train ofJourney(int journeyId) {
		return null;
	}
	
}
