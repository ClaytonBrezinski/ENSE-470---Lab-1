/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;
/**
 *
 * @author Dolan
 */
public class BusinessCustomer implements Customer
{
    String name;
    String address;
    int creditRating; 
    
    public String getCreditRating()
    {
          return Integer.toString(creditRating);  
    }
}
