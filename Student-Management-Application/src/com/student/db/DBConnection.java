package com.student.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection createConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mngt", "root", "root");
   
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return con;
    }

}
