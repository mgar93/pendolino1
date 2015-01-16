package repositories.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import domain.Train;

public class TrainBuilder implements IEntityBuilder<Train> {

	public Train build(ResultSet rs) throws SQLException {
		Train train = new Train();
		plane.setId(rs.getInt("id"));
		plane.setManufacturer(rs.getString("manufacturer"));
		plane.setModel(rs.getString("model"));
		plane.setCapacity(rs.getString("capacity"));
		plane.setRegNumber(rs.getString("regNumber"));
		return train;
	}
	
}
