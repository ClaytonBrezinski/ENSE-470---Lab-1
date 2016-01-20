/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dolan
 */
public class Product 
{
    String name;
    double itemCost;
    
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
}
