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
public class OrderLine
{
    private double totalCost;
    private int quantity;
    private Product item;
    
    OrderLine()
    {
        this.totalCost = 0.0;
        this.quantity = 0;
        this.item = null;
    }
    OrderLine(int inQuantity, Product inItem)
    {
        this.item = inItem;
        this.quantity = inQuantity; 
        this.totalCost = inItem.getItemCost() * quantity;        
    }
    
    /*
    Purpose: getter for the total cost
    Input: none
    Output: double - the total cost of the orderline
    */
    public double getTotalCost()
    {
        this.totalCost = item.getItemCost() * quantity;
        return this.totalCost;
    }
    
    /*
    Purpose: print the current orderline
    Input: String - alignment statement to make the print pretty and controlled
    Output: printout to the commandline
    */
    public void printOrderLine(String aligner)
    {
        int SPACER = 5;
        System.out.format(aligner, this.item.getName(), "$" + this.item.getItemCost(), this.quantity);    
    }
    /*
    Purpose: getter for the product name
    Input: 
    Output: String - product's name
    */
    public String getProductName()
    {
        return this.item.getName();
    }
    /*
    Purpose: getter for the quantity
    Input: 
    Output: int - quantity of product present
    */
    public int getQuantity()
    {
        return this.quantity;
    }
    /*
    Purpose: add 1 to the quantity of the product
    Input: 
    Output: quantity +=1
    */
    public void incrementQuantity()
    {
        this.quantity += 1;
    }
}
