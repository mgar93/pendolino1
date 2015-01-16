package repositories.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import domain.Ticket;

public class TicketBuilder implements IEntityBuilder<Ticket> {

	public Ticket build(ResultSet rs) throws SQLException {
		Ticket ticket = new Ticket();
		ticket.setId(rs.getInt("id"));
		ticket.setPrice(rs.getString("price"));
		ticket.setTicketNumber(rs.getString("ticketNumber"));
		ticket.setPassengerId(rs.getInt("passengerId"));
		return ticket;
	}
	
}
