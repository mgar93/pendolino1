package repositories.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import domain.Journey;

public class JourneyBuilder implements IEntityBuilder<Journey> {

	public Journey build(ResultSet rs) throws SQLException {
		Journey journey = new Journey();
		flight.setId(rs.getInt("id"));
		flight.setDepartureDate(rs.getString("departureDate"));
		flight.setDeparturePlace(rs.getString("departurePlace"));
		flight.setDestination(rs.getString("destination"));
		flight.setDistance(rs.getString("distance"));
		flight.setTrainline(rs.getString("trainline"));
		flight.setTrainId(rs.getInt("trainId"));
		return journey;
	}
	
}
