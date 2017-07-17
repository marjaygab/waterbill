/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.waterbill;

import java.sql.*;

/**
 *
 * @author Edsel
 */
public class Login {
    
       private Connection con;
    private Statement st;
    private ResultSet rs;
  
    public Login() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/loggingin", "root", "password");
        st=con.createStatement();
        }catch (Exception ex){
            System.out.println("Error: " + ex);
        }
        }
     public int getData(String user, String pass){
          
           
          int count=1;
          int grant=0;
       
        try{
            String query ="SELECT * FROM `adminusers` WHERE 1";
            rs=st.executeQuery(query);
            while (rs.next()){
            String username = rs.getString("Username");
            String password = rs.getString("Password");
           if (user.equals(username) && pass.equals(password) && count==1){
                count++;
                grant++;
               
            }
            else if(user!=username && pass!=password && count==1){
                
                
            }
            
            } 
}catch(Exception ex){
    System.out.println(ex);
}
  
        return grant;
       }
}
