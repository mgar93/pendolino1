package repositories.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Journey;
import domain.Passenger;

public class PassengerBuilder implements IEntityBuilder<Passenger> {

	public Passenger build(ResultSet rs) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt("id"));
		passenger.setFirstName(rs.getString("firstName"));
		passenger.setSurname(rs.getString("surname"));
		passenger.setAge(rs.getString("age"));
		passenger.setSex(rs.getString("sex"));
		passenger.setIdNumber(rs.getString("idNumber"));
		passenger.setTicketId(rs.getInt("ticketId"));
		passenger.setJourneyId(rs.getInt("journeyId"));
		return passenger;
	}
	
}
