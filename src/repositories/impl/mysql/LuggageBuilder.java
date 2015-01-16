package repositories.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import domain.Luggage;

public class LuggageBuilder implements IEntityBuilder<Luggage> {

	public Luggage build(ResultSet rs) throws SQLException {
		Luggage luggage = new Luggage();
		luggage.setId(rs.getInt("id"));
		luggage.setSize(rs.getString("size"));
		luggage.setWeight(rs.getString("weight"));
		luggage.setType(rs.getString("type"));
		luggage.setPassengerId(rs.getInt("passengerId"));
		return luggage;
	}	
}