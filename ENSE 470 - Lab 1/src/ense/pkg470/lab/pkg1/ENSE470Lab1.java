/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dolan
 */
public class ENSE470Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	PersonalCustomer a = new PersonalCustomer("Clay", "RTown", 9000);
        PersonalCustomer b = new PersonalCustomer("Colin", "GTown", 9001);
        Product A1 = new Product("Pencil", 5.00);
        Product A2 = new Product("Lined Paper", 2.25);
        Product A3 = new Product("Grid Paper", 3.25);  
        OrderLine B1 = new OrderLine(1, A1);
        //B1.add(new OrderLine(1, A2));
        //B1.add(new OrderLine(2, A3));
        a.addOrderLine(new OrderLine(3,A3));
        a.addOrderLine(new OrderLine (1, A1));
        
        CorporateCustomer c = new CorporateCustomer("Chow", "WorkTown", 12, 0);
        c.addOrderLine(B1);
        c.viewCart();
        c.addOrderLine(new OrderLine(4, A2));
        c.viewCart();
        c.addOrderLine(new OrderLine(1, A1));
        c.viewCart();
        
        List<Product> prods = new ArrayList<Product>();
        prods.add(A1);
        prods.add(A2);
        prods.add(A3);
        
        UI ui = new UI(); 
        ui.mainArea(c,prods);
    }
    
}
