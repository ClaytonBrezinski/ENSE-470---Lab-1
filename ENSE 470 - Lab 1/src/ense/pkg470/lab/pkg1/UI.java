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
public class UI
{
    
    /*
    Purpose: Main area that the user will be using
    Input: Business Customer - user that is using the interface, List<Product> - list of all the products that are available
    Output: prints to the command line
    */
    public void mainArea(BusinessCustomer customer, List<Product> inProducts)
    {
        Scanner userInput = new Scanner(System.in);
        // user login area
        
        // once user has logged in get their current order and then display their current cart + what they can purchase
        boolean exit = false;
        
        customer.viewCart();
        showItemsForPurchase(inProducts);
        while (exit == false)
        {
            String in = userInput.nextLine();
            if (in == "X" || in == "x")
            {
                exit = true; 
            }
            else if (in == "V" || in == "v")
            {
                customer.viewCart();
            }
            else if (in == "P" || in == "p")
            {
                showItemsForPurchase(inProducts);
            }
            else if (isNumber(in) == true)
            {
                int choice = Integer.parseInt(in);
                System.out.println("How many of this item would you like?");
                in = userInput.nextLine();
                while (isNumber(in) == false)
                {
                    System.out.println("Please enter a valid integer");
                    in = userInput.nextLine();
                }
                int quantity = Integer.parseInt(in);
                customer.addOrderLine(new OrderLine(quantity, inProducts.get(choice-1)));
            }
            System.out.println("What would you like to do now?");
            System.out.println("P - Make another purchase");
            printOptionsMenu();
        }
        
    }
    
    /*
    Purpose: Show in a pretty and later, more useable way, a list of all available objects for purchase
    Input: List<Product> - list of all available products
    Output: print to command line
    */
    private void showItemsForPurchase (List<Product> inProducts)
    {
        System.out.println("If you wish, plese select one of the following items to buy:");
        for (int i = 0; i < inProducts.size(); i++)
        {
           int itemNum = i + 1;
           System.out.println( itemNum + ": " + inProducts.get(i).getName() + "  $" + inProducts.get(i).getItemCost());
        }
        printOptionsMenu();
    }
    
    /*
    Purpose: Prints a small note of what the user can do
    Input: none
    Output: print to the command line
    */
    private void printOptionsMenu()
    {
        System.out.println();
        System.out.println("V - View your cart");
        System.out.println("X - Exit");
    }
    /*
    Purpose: check if the string is actually a number
    Input: String - string to check
    Output: Boolean - true or false if it is a string
    Notes: taken from stackoverflow "how to check if a string is numeric in java"
    */
    private boolean isNumber(String str)
    {
        for (char c: str.toCharArray())
        {
            if (!Character.isDigit(c))
            {
                return false;
            }
        }
        return true;
    }
}
