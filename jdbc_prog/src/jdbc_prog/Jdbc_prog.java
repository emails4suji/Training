/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_prog;

import java.sql.*;

public class Jdbc_prog {
    public static Connection con = null;
    public static void main(String[] args) {
        try
        {
        String url = "jdbc:sqlserver://pittu\\SQLEXPRESS;databaseName=student;integratedSecurity=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(url);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while (rs.next())
        {
            System.out.println(rs.getInt(0));
            System.out.println(rs.getString(1));
            System.out.println(rs.getInt(2));
        }
        }
        catch(SQLException se)
        {
            System.out.println("SQL Exception" + se);
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("Class not found Exception"+ ce);
        }
        finally
        {
        }
        
    }
    
}
