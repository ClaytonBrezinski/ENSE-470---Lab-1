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
public class CorporateCustomer extends BusinessCustomer 
{
    private String contactName; 
    private double bill;
    
    public CorporateCustomer()
    {
        this.contactName = "";
        this.bill = 0.0;
    }
    public CorporateCustomer(String inName, double inBill)
    {
        this.contactName = inName;
        this.bill = inBill;
    }
    public String getCreditRating()
    {
        return "hi";
    }
    public String getName()
    {
        return this.contactName;
    }
    public String getAddress()
    {
        return this.address;
    }
    public double getBill()
    {
        return this.bill;
    }
}
