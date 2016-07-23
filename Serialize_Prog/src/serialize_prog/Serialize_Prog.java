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
public class Serialize_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.name = "Suji";
        e1.num = 100;
        Employee e2 = new Employee();
        e2.name = "Suji2";
        e2.num = 1000;
        try(
            FileOutputStream fo = new FileOutputStream("./saved_employee.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);)
        {
            oo.writeObject(e1);
            oo.writeObject(e2);
            System.out.printf("Serialized data is saved in ./saved_employee.txt file");
        }
        catch(IOException ie)
        {
          ie.printStackTrace();
        }
     }
    }