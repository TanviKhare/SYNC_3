/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.generator;

/**
 *
 * @author Hyrex
 */

import java.sql.*;
import javax.swing.*;
public class db {
    
    
    
    Connection conn=null;
    public static Connection java_db(){
        String url = "jdbc:mysql://localhost:3306/cvj";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);  
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
