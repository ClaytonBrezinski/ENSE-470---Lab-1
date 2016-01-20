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
public class Product 
{
    private String name;
    private double itemCost;
    
    Product()
    {
        this.name = "";
        this.itemCost = 0.0;
    }
    Product(String inName, double inItemCost)
    {
        this.name = inName;
        this.itemCost = inItemCost;
    }
    public String getName()
    {
        return this.name;
    }
    public double getItemCost()
    {
        return this.itemCost;
    }
            
}
