package gom.cave.jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleDao {
	public void insert(int id, String name, int age, int weight)
			throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql = "INSERT into user(id, name, age, weight) values(? ,? ,? ,?)";
		try {
//			System.out.println( id + " " + name + " " + age + " " + weight );
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/matholic", "root", "matholic");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setInt(4, weight);
			preparedStatement.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
}
