/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.waterbill;

import java.sql.*;

/**
 *
 * @author KennO
 */
public class A1Single_Bulk_Input {
    
    private String _LastName;
    private String _FirtName;
    private String _MiddleName;
    private String _Age;
    private String _Gender;
    private String _HomeAdd;
    private String _MeterNo;
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    
    
    public A1Single_Bulk_Input(){
        try{
                
                Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/loggingin", "root", "password");
               st=con.createStatement(); 
        
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        } 
    
    }




public void getAccNum (String AccNum){
    int info;;
    
    try{
     String query = "SELECT * FROM `consumer` WHERE 1";
        rs=st.executeQuery(query);
        
        while(rs.next()){
            String an = rs.getString("Account_Number");
                if(an.equals(AccNum)){
                    _LastName = rs.getString("Last_Name");
                    _FirtName = rs.getString("First_Name");
                    _MiddleName = rs.getString("Middle_Name");
                    _Age = rs.getString("Age");
                    _Gender= rs.getString("Gender");
                    _HomeAdd = rs.getString("Address");
                    _MeterNo = rs.getString("Meter No.");
                   
                }
            
           
            }
        
        
    }catch(Exception e){
               System.out.println(e);  
           }  
  

   
}
public void setinfor(String _lastname , String _firstname , String _middlename , String _age, String _homeadd, String _meterno , String _gender){
    this._Age = _age;
    this._FirtName = _firstname;
    this._Gender= _gender;
    this._HomeAdd = _homeadd;
    this._LastName = _lastname;
    this._MeterNo = _meterno;
    this._MiddleName = _middlename;
}
public String getlast_ (){
    return _LastName;
}
public String getfirst_ (){
    return _FirtName;
}
public String getmiddle_ (){
    return _MiddleName;
}
public String getage_ (){
    return _Age;
}
public String getgender_ (){
    return _Gender;
}
public String getmeterno(){
    return _MeterNo;
}
public String gethomeadd(){
    return _HomeAdd;
}





}