/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.waterbill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Edsel
 */
public class PaymentConnection {
    
     private Connection con;
    private Statement st;
    private ResultSet rs;
    private String last,first,middle,address,age,gender,meternumber;
    public PaymentConnection(){
        
                
          try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/loggingin", "root", "password");
        st=con.createStatement();
        }catch (Exception ex){
            System.out.println("Error: " + ex);
        }
    }
          
        public int getAccountNumber(String user){
          
           
          int count=1;
          int grant=0;
       
        try{
            String query ="SELECT * FROM `consumer` WHERE 1";
            rs=st.executeQuery(query);
            while (rs.next()){
            String accountnumber = rs.getString("Account_Number");
            
           if (accountnumber.equals(user)){
               last=rs.getString("Last_Name");
               first=rs.getString("First_Name");
               middle=rs.getString("Middle_Name");
               age=rs.getString("Age");
               gender=rs.getString("Gender");
               address=rs.getString("Address");
               meternumber=rs.getString("Meter No.");
            }
            
                
                
            
            
            } 
}catch(Exception ex){
    System.out.println(ex);
}
  
        return grant;
       }
        public void setInfo(String lastname, String firstname, String middlename,String ages, String homeadd, String metro, String sex){
            this.last=lastname;
            this.first=firstname;
            this.middle=middlename;
            this.age=ages;
            this.address=homeadd;
            this.meternumber=metro;
            this.gender=sex;
            
        }
        public String getLast(){
            return last;
        }
        public String getFirst(){
            return first;
        }
        public String getMiddle(){
            return middle;
        }
         public String getAge(){
            return age;
        }
          public String getGender(){
            return gender;
        }
           public String getMeterNo(){
            return meternumber;
        }
            public String getAddress(){
            return address;
        }
        
    
    
}
