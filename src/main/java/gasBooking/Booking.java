/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gasBooking;

/**
 *
 * @author Hp
 */
import Customers.*;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;


public class Booking extends Gas_connection{
    
    public double otp = 5678, amount = 825.0, refund = 0;
    
    public String dt, delDate,  Status, DelMobileNo = "2345333435", status;
    public Date dt_1, dt_2;
    public Booking(String Name,String street, String Area, String Pincode, String Mobile_No, int numOfCylinders) {
        super(Name,street, Area, Pincode, Mobile_No, numOfCylinders);
    }
    
    public void getDates(){
        System.out.println("Enter booking date:");
        dt = new Scanner(System.in).nextLine();
        dt_1 = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd/mm/yyyy");
        try{
            dt_1 = dateFormat.parse(dt);
        }catch(ParseException e){
            System.out.println("the error is in getDates Function:"+ e);
        }
        
        //delivery details
        System.out.println("Enter Delivery Date:");
        delDate  = new Scanner(System.in).nextLine();
        try{
            dt_2 = dateFormat.parse(delDate);
            
        }catch(ParseException exp){
            System.out.println(" Error parsing date dt_2:"+ exp);
        }
        
        try{
            long difference = dt_2.getTime() - dt_1.getTime();
            
            long newDifference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            if(newDifference > 7){
                status = "P";
            }
        }catch(Exception e){
            System.out.println(" Error while finding difference: " +e);
        }
        
    }
    public void validate(){
        
        long elapsedms = dt_1.getTime() - lastDate.getTime();
        long diff = TimeUnit.DAYS.convert(elapsedms, TimeUnit.MILLISECONDS);
        
        System.out.println("Difference between two dates is : " + diff);
        if( numOfCylinders == 1)
        {
         if(diff < 30)
          {
            System.out.println("booking cannot be done");
            status = "C";
          }else{
              status = "B";
              lastDate = dt_1;
              
          }
        }
        else if (numOfCylinders == 2){
           if(diff < 50)
          {
            System.out.println("booking cannot be done");
            status = "C";
          }else{
              status = "B";
              lastDate = dt_1;
              
          }
        }
        
        
    }
}
