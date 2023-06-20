/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customers;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Hp
 */
public class Gas_connection extends Customer {
    
    public int numOfCylinders;
    String date;
    static int connection_no = 100;
    {
        connection_no +=1;
    }
    
    public Date lastDate = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy"); 

    public Gas_connection(String Name, String street,String Area, String Pincode, String Mobile_No, int numOfCylinders) {
        super(Name,street, Area, Pincode, Mobile_No);
        this.numOfCylinders=numOfCylinders;


    }
    
    public void getLastDate(){
      System.out.println("Enter the last Date");
      date = new Scanner(System.in).nextLine();
      
      try{
         lastDate = dateFormat.parse(date);
      }catch(Exception e){
          System.out.println("error in getLastDate" + e);
      
      }
    
    }
 
}
