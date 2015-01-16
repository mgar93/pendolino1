package repositories.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Luggage;
import domain.Passenger;
import repositories.ILuggageRepository;
import unitofwork.IUnitOfWork;

public class LuggageRepository extends Repository<Luggage> implements ILuggageRepository{

public LuggageRepository(Connection connection, IEntityBuilder<Luggage> builder, IUnitOfWork uow) {
	super(connection, builder, uow);
}
	
	protected String getTableName() {
		return "luggages";
	}
	
	protected String getInsertQuery() {
		return "INSERT INTO luggages (size, weight, type, passengerId) VALUES (?,?,?,?)";
	}
	
	protected String getUpdateQuery() {
		return "UPDATE luggages SET size=?, weight=?, type=?, passengerId=?";
	}
	
	protected void setUpInsertQuery(Luggage entity) throws SQLException {
		insert.setString(1, entity.getSize());
		insert.setString(2, entity.getWeight());
		insert.setString(3, entity.getType());
		insert.setInt(4, entity.getPassengerId());
	}

	protected void setUpUpdateQuery(Luggage entity) throws SQLException {
		update.setString(1, entity.getSize());
		update.setString(2, entity.getWeight());
		update.setString(3, entity.getType());
		update.setInt(4, entity.getPassengerId());
		update.setInt(5, entity.getId());
	}

	public List<Luggage> ofPassenger(Passenger passenger) {
		return null;
	}

	public List<Luggage> ofPassenger(String name) {
		return null;
	}
	
	public List<Luggage> ofPassenger(int passengerId) {
		return null;
	}

}
