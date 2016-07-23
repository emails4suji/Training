/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_prog;

import java.sql.*;
import java.time.Clock;

public class Singleton {
    private static Singleton Singleton_con  = null;
    private static String db_url;
    private static String db_pwd;
    private static String db_usr;
    private static Statement Con_st;
    private Singleton()
    {
    //Private constructor to prevent object creation from other classes
      
    }
    public static Singleton getInstance()
    {
      if (Singleton_con == null )  
      {
         Singleton_con = new Singleton();
      }
      return Singleton_con;
    }
    public static Statement getStatement()
    {
        try
        {
           Connection con = DriverManager.getConnection(db_url,db_usr,db_pwd);
           Statement st = con.createStatement();
           return st;
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
        return null;
    }
}
