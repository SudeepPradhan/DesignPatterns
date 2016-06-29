package facade_pattern;

import java.sql.SQLException;

public class JDBCdemo {
	public static void main(String[] arg) {
		String sqlStatement = "SELECT * FROM <table> WHERE <column name> = ?";
		try {
			int result = Facade.JDBCConnectionTest(sqlStatement);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
