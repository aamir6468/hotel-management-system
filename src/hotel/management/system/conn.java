/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ABU HARISH
 */
public class conn {
     Connection con;
    Statement s;
    
    {
       
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver successfully loaded");
            con=DriverManager.getConnection("jdbc:oracle:thin:@//AAMIR:1521/xe","hotelmanagement","aamir786");
            System.out.println("connection opened!");
            s=con.createStatement();//to create statement
    }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception in connecting to database"+e);
        }
    
}
}

