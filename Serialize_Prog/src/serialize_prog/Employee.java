/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize_prog;

import java.io.Serializable;

/**
 *
 * @author Suji
 */
public class Employee implements Serializable{
    public String name;
    public int num;
    private static final long serialVersionUID = 50000000;
}
