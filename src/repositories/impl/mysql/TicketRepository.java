package repositories.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Passenger;
import domain.Ticket;
import repositories.ITicketRepository;
import unitofwork.IUnitOfWork;

public class TicketRepository extends Repository<Ticket> implements ITicketRepository{

public TicketRepository(Connection connection, IEntityBuilder<Ticket> builder, IUnitOfWork uow) {
	super(connection, builder, uow);
}
	
	protected String getTableName() {
		return "tickets";
	}
	
	protected String getInsertQuery() {
		return "INSERT INTO tickets (price, ticketNumber, passengerId) VALUES (?,?,?)";
	}
	
	protected String getUpdateQuery() {
		return "UPDATE tickets SET price=?, ticketNumber=?, passengerId=?";
	}
	
	protected void setUpInsertQuery(Ticket entity) throws SQLException {
		insert.setString(1, entity.getPrice());
		insert.setString(2, entity.getTicketNumber());
		insert.setInt(3, entity.getPassengerId());
	}

	protected void setUpUpdateQuery(Ticket entity) throws SQLException {
		update.setString(1, entity.getPrice());
		update.setString(2, entity.getTicketNumber());
		update.setInt(3, entity.getPassengerId());
		update.setInt(4, entity.getId());
	}

	public Ticket ofPassenger(Passenger passenger) {
		return null;
	}

	public Ticket ofPassenger(String name) {
		return null;
	}

	public Ticket ofPassenger(int passengerId) {
		return null;
	}

}
