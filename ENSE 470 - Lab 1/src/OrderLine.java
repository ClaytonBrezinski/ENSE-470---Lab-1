/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dolan
 */
public class OrderLine
{
    double totalCost;
    int quantity;
    Product item;
    
    OrderLine()
    {
        this.totalCost = 0.0;
        this.quantity = 0;
        this.item = null;
    }
    OrderLine(int inQuantity, Product inItem)
    {
        this.totalCost = inItem.itemCost * quantity;
        this.quantity = inQuantity; 
        this.item = inItem;
    }
}
