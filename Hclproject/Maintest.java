
import java.sql.*;
import java.util.ArrayList;
public class Maintest {
	public static void main(String[] args) throws SQLException{
		Connection myConn=null;
		Statement myStmt=null;
		ResultSet myRs=null;
		ArrayList<Info> list=new ArrayList<Info>(); 
		
		try{
			myConn =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
			System.out.println("Database connection succesfull for user APPASANI DIVYA TEJASREE!\n");
			myStmt=myConn.createStatement();
			System.out.println("Id Acc_num Trans_type Trans_amt Trans_date Accbalance");
			myRs=myStmt.executeQuery("select*from bank");
			while(myRs.next()){
				Info info=new Info();
				info.setId(myRs.getInt("id"));
				info.setAccnum(myRs.getInt("accnum"));
				info.setTranstype(myRs.getString("transtype"));
				info.setTransamt(myRs.getInt("transamt"));
				info.setTransdate(myRs.getDate("transdate"));
				info.setAccbalance(myRs.getInt("accbalance"));
				list.add(info);
				}
			for(int i=0;i < list.size();i++){
				System.out.println(list.get(i).getId()+"    "+list.get(i).getAccnum()+"    "+list.get(i).getTranstype()+"    "+list.get(i).getTransamt()+"    "+list.get(i).getTransdate()+"    "+list.get(i).getAccbalance());	
				}
			/*System.out.println("\n");
			System.out.println("Total number of males and females infected in a state");
			System.out.println("state  totalmale  totalfemale");
			myRs=myStmt.executeQuery("select state,sum(male) as totalmale,sum(female) as totalfemale from coronatracker group by state");
			while(myRs.next()){
				Info info=new Info();
				info.setState(myRs.getString("state"));
				info.setTotalmale(myRs.getInt("totalmale"));
				info.setTotalfemale(myRs.getInt("totalfemale"));
				list.add(info);
			}
			for(int i=6;i < list.size();i++){
				System.out.println(list.get(i).getState()+"  "+list.get(i).getTotalmale()+"  "+list.get(i).getTotalfemale());	
				}
			System.out.println("\n");
			System.out.println("Total Number of Corona Infected people Statewide ");
			System.out.println("state  statecount");
			myRs=myStmt.executeQuery("select state,sum(male)+sum(female) as statecount from coronatracker group by state");
			while(myRs.next()){
				Info info=new Info();
				info.setState(myRs.getString("state"));
				info.setStatecount(myRs.getInt("statecount"));
				list.add(info);
				}
			for(int i=9;i < list.size();i++){
				System.out.println(list.get(i).getState()+"  "+list.get(i).getStatecount());	
				}
			System.out.println("\n");
			System.out.println("Total Number of Corona Infected patients in all states...");
			System.out.println("TotalCount");
			myRs=myStmt.executeQuery("select sum(male+female)as totalcount from coronatracker");
			while(myRs.next()){
				Info info=new Info();
				info.setTotalcount(myRs.getInt("totalcount"));
				list.add(info);
				}
			for(int i=12;i < list.size();i++){
				System.out.println(list.get(i).getTotalcount());	
				}	*/
		}
		
			catch(Exception exc){
				exc.printStackTrace();
			}
			finally{
				if (myRs !=null){
					myRs.close();
				}
				if(myStmt !=null){
					myStmt.close();
				}
				if(myConn !=null){
					myConn.close();
				}
			}
			
		}
}
