/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gasBooking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Hp
 */
public class Delivery extends Booking{
    public String delPersonName;
    int customerOtp;
    
   

    public Delivery(String Name,String street, String Area, String Pincode, String Mobile_No, int numOfCylinders) {
        super(Name,street, Area, Pincode, Mobile_No, numOfCylinders);
    }
    
    public void amountCalc(){
        long dayDiff = dt_2.getTime() - dt_1.getTime();
        long newDiff = TimeUnit.DAYS.convert(dayDiff, TimeUnit.MILLISECONDS);
         if(newDiff > 7)
          {
            refund = 41.25;
            amount = amount - refund;
          }
    }
    
    public void verfyOpt(){
        if(status.equals("8"))
        {
            System.out.println(" enter OTP :");
            customerOtp = new Scanner(System.in).nextInt();
            if(customerOtp != otp)
            {
            
               status = "C";
            }else{
              status = "D";
              
              
          }
        }else{
              System.out.println(" no booking found!!!");
              
              
          }
    }
    
    public void delPersonDetails(){
        System.out.println("\n Enter the delivery person name :");
        delPersonName = new Scanner(System.in).nextLine();
    }

    
}
