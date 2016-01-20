/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dolan
 */
public class PersonalCustomer 
{
    String contaceName;
    int creditRating;
    double bill;
   
    /*
    Purpose:
    Input: 
    Output: 
    */
    PersonalCustomer()
    {
        this.contaceName = "";
        this.creditRating = 0;
        this.bill = 0.0;
    }   
    PersonalCustomer( String inContactName, int inCreditRating, double inBill)
    {
        this.contaceName = inContactName;
        this.creditRating = inCreditRating;
        this.bill = inBill;
    }
    void remind()
    {
        
    }
    double billForMonth(double addToCost)
    {
        this.bill += addToCost;
        return bill;
    }
}
