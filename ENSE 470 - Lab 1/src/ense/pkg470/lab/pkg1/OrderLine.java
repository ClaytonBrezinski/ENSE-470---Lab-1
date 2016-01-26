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
        this.totalCost = inItem.getItemCost() * quantity;
        this.quantity = inQuantity; 
        this.item = inItem;
    }
    public double getTotalCost()
    {
        return this.totalCost;
    }
    public void printOrderLine()
    {
        int SPACER = 5;
        System.out.format("%-10s:%10s:%5s\n", this.item.getName(), this.item.getItemCost(), this.quantity);    
    }
}
