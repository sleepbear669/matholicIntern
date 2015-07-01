package gom.cave.jdbc.simple;

import java.sql.SQLException;

public class UserInsertRunnable implements Runnable {

	int startId;
	int insertNumber;
	SimpleDao simpleDao;

	public UserInsertRunnable(int startId, int insertNumber) {
		this.startId = startId;
		this.insertNumber = insertNumber;
		simpleDao = new SimpleDao();
	}

	public void run() {
		for (int i = startId; i <= (startId + insertNumber -1 ); i++) {
			String name = App.randomString(5);
			int age = App.randomInt(1, 100);
			int weight = App.randomInt(20, 200);
			try {
				simpleDao.insert(i, name, age, weight);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
