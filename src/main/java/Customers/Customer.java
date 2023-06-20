/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customers;
import gasSupplier.gasAgency;
/**
 *
 * @author Hp
 */
public class Customer implements gasAgency
{
    public String Name;
    public String street;
    public String Area;
    public String Pincode;
    public String Mobile_No;
    
    public Customer(String Name,String street, String Area,String Pincode,String Mobile_No)
    {
        this.Name = Name;
        this.street = street;
        this.Area = Area;
        this.Pincode = Pincode;
        this.Mobile_No = Mobile_No;
        
    }
}
