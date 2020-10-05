import java.sql.*;

public class Driver {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");
			
			// 2. Prepare statement
			myStmt = myConn.prepareStatement("select * from employees where salary > ? and department=?");
			
			// 3. Set the parameters
			myStmt.setDouble(1, 80000);
			myStmt.setString(2, "Legal");
			System.out.println(myStmt);
			
			// 4. Execute SQL query
			myRs = myStmt.executeQuery();
			
			// 5. Display the result set
			//display(myRs);
			while(myRs.next()){
				System.out.println(myRs.getString("last_name")+","+myRs.getString("first_name")+","+myRs.getDouble("salary")+","+myRs.getString("department"));
				
			}
		
			//
			// Reuse the prepared statement:  salary > 25000,  department = HR
			//

			System.out.println("\n\nReuse the prepared statement:  salary > 25000,  department = HR");
			
			// 6. Set the parameters
			myStmt.setDouble(1, 25000);
			myStmt.setString(2, "HR");
			
			// 7. Execute SQL query
			myRs = myStmt.executeQuery();
			
			// 8. Display the result set
			//display(myRs);
			while(myRs.next()){
				System.out.println(myRs.getString("last_name")+","+myRs.getString("first_name")+","+myRs.getDouble("salary")+","+myRs.getString("department"));
			
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
		}
	}
}