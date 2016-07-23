/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize_prog;
import java.io.*;
/**
 *
 * @author Suji
 */
public class Deserialize_prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Employee Recieved_e = new Employee();
         Employee Recieved_e2 = new Employee();
        try(
            FileInputStream fi = new FileInputStream("C:/Users/Suji/Documents/NetBeansProjects/Serialize_Prog/saved_employee.txt");
            ObjectInputStream oi = new ObjectInputStream(fi)
            ){
             Recieved_e = (Employee) oi.readObject();
              Recieved_e2 = (Employee) oi.readObject();
             System.out.println("The Object is recieved from the file..!");
             }
        catch (Exception ie)
        {
            ie.printStackTrace();
        }
        System.out.println("Name: " + Recieved_e.name);
        System.out.println("Num: " + Recieved_e.num);
        System.out.println("Name2: " + Recieved_e2.name);
        System.out.println("Num2: " + Recieved_e2.num);
}
}
