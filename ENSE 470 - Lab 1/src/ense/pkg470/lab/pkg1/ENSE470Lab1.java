/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;

import java.util.*;
/**
 *
 * @author Dolan
 */
public class ENSE470Lab1 
{
    public static void main(String args) 
    {
        PersonalCustomer a = new PersonalCustomer("Clay", "HotTown", 9000);
        PersonalCustomer b = new PersonalCustomer("Colin", "GayTown", 9001);
        Product A1 = new Product("Pencil", 5);
        Product A2 = new Product("Lined Paper", 2);
        Product A3 = new Product("Grid Paper", 3);        
        CorporateCustomer c = new CorporateCustomer("Chow", "WorkTown", 12, 0);
        c.addOrder(Order());
        
    }
    
}
