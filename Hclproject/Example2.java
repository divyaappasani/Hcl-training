package com.jdbcexample;
import java.sql.*; 



class Example2 { 

public static void main(String args[]) { 

try { 

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");
PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?)"); 

stmt.setInt(1, 101); 

stmt.setString(2, "Ram"); 

 

int i = stmt.executeUpdate(); 

System.out.println(i + " records inserted"); 

 

con.close(); 

 

} catch (Exception e) { 

System.out.println(e); 

} 

 

} 

} 
