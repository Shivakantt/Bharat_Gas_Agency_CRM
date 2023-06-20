/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */

import Customers.*;
import gasBooking.*;
import gasSupplier.*;
import static gasSupplier.gasAgency.AgencyCode;
import static gasSupplier.gasAgency.AgencyName;
import static gasSupplier.gasAgency.PhNumber;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

public class Main {
     
    static int count;
    static int bcount = 0 , ccount = 0, dcount = 0, pcount = 0;
    static String dpname;
    
    public static void cylinderCount(Delivery[] obj){
        String[] months = new String[]{"January", "february", "March", "April", "May", "June", "July", 
            "August", "September", "October", "November", "December"};
        for(Delivery delivery: obj){
            count = 0;
             System.out.println(" In the month of " + ( months [delivery.dt_2.getMonth()]) + " : ");
             System.out.println(" *In  " + delivery.Area );
             if(delivery.Status.equals("D"))
             {
                 count += delivery.numOfCylinders;
             }
              System.out.println(" - " + count+ "cylinders delivered");  
        }
         System.out.println("\n"); 
    }
    
    public static void checkLateDel(Delivery[] obj){
         String[] months = new String[]{"January", "february", "March", "April", "May", "June", "July", 
            "August", "September", "October", "November", "December"};
         int[] month = new int[12];
         
          for(Delivery delivery: obj)
           {           
            if(delivery.status.equals("D")&& delivery.amount == 783.75){
                 month[delivery.dt_2.getMonth()] += 1;
             }
               
           }
         System.out.println("------------last delivery------------"); 
         for(int i=0; i<12; i++){
             if(month[i] != 0){
                 System.out.println(" * In " + months[i] + "there are " + month[i]);
             }
    }
    }
    public static void numOfSingleCylinder(Delivery[] obj){
        System.out.println("---------Single Cylinder Holders----------");
        for(int i=0; i<obj.length; i++){
         if(obj[i].numOfCylinders == 1){
           System.out.println("* Customer Name: + obj[i].name");
           System.out.println("* Mobile No.: "+ obj[i].Mobile_No);
           System.out.println("* Gas Connection No.:" + (i+100));
          }
        }
      System.out.println("\n");   
    }
    public static void DeliveryDetails(Delivery[] obj){
        
        System.out.println("---------Delivery Details----------");
        System.out.println("enter the name of delivery persons: ");
        dpname = new Scanner(System.in).next();
        for(Delivery delivery : obj){
           if(delivery.Status.equals("D") && delivery.delPersonName.equals(dpname)){
              System.out.println("* Customer Name: + delivery.name");
              System.out.println(" - " + delivery.Street + ","+ delivery.Area+","+delivery.Pincode);
            }
        }
        System.out.println("\n");
    }
     public static void printReport(Delivery[] obj){
         System.out.println("--------------Delivery Report-------------");
         for(int i=0; i<obj.length; i++){
           if (obj[i].status.equals("D")){
              dcount++;
             }
           else if (obj[i].status.equals("B")){
              bcount++;
             }
            else if (obj[i].status.equals("C")){
              ccount++;
             }
            else if (obj[i].status.equals("P")){
              pcount++;
             }
            else{
              System.out.println("Status invalid");  
             }
        }
        System.out.println("* Booked");
        System.out.println(" - "+ bcount+ "booked");
        System.out.println("* Delivery");
        System.out.println(" - "+ dcount + "delivered");
        System.out.println("* Cancelled");
        System.out.println(" - "+ ccount+ "cancelled");
        System.out.println("* panding");
        System.out.println(" - "+ pcount+ "pending");
        System.out.println("\n");
    }
    public static void printInvoice(Delivery[] obj){
      Date d = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("dd//MM//yyyy");
      String invoiceDate = sdf.format(d);
      for(int i=0; i< obj.length; i++){
          if (obj[i].status.equals("D"))
          {
           System.out.println("-----------------------------------------------");
           System.out.println("-------------------INVOICE---------------------");
           System.out.println("-----------------------------------------------");
           System.out.println("Gas Agency Code:" + AgencyCode +"\t\t\t" + "Date of Invoice:" + invoiceDate );
           System.out.println("Gas Agency Name:" + AgencyName +"\t\t" + "Agency Phone No.:" + PhNumber );
           System.out.println("Gas Connection No.:" + (i+101) +"\t\t\t" + "Customer Name:" + obj[i].Name );
           System.out.println("Booking Date:" + sdf.format(obj[i].dt_1) +"\t\t" + "Customer Mobile No:" + obj[i].Mobile_No );
           System.out.println("-----------------------------------------------");
           System.out.println("Amount:" + obj[i].amount);
           System.out.println("Refund:" + obj[i].refund);
           System.out.println("Amount:" + (obj[i].amount-obj[i].refund));
           System.out.println("-----------------------------------------------");
           System.out.println("Delivery Person Nmae:" + obj[i].delPersonName +"\t\t" + "Delivery Person Nmae:" + obj[i].DelMobileNo );
           System.out.println("Delivery Date:" + sdf.format(obj[i].dt_2));
           System.out.println("-----------------------------------------------");
           System.out.println("\n\n");
          
          
          
          
          }
      }
    
    }
    
    
    
    
    
   
     public static void main(String[] args)
    {
        System.out.println("**************************************************");
        System.out.println("               Bharat Gas Agency CRM              ");
        System.out.println("**************************************************");
        Delivery[] deliveryObject = new Delivery[5];
        deliveryObject[0] = new Delivery( Name: "Parvati", street: "4th Avenue", Area: "Alpha - 1", Pincode: "201308", Mobile_No: "9999923322", numOfCylinders: 1);
        deliveryObject[1] = new Delivery( Name: "Parakash", street: "4th Avenue", Area: "Alpha - 1", Pincode: "201308", Mobile_No: "9988823322", numOfCylinders: 2);
        deliveryObject[2] = new Delivery( Name: "Ram", street: "3th Avenue", Area: "Alpha - 1", Pincode: "201308", Mobile_No: "9998883322", numOfCylinders: 2);
        deliveryObject[3] = new Delivery( Name: "Vikash", street: "2th Avenue", Area: "Alpha - 1", Pincode: "201308", Mobile_No: "9999923322", numOfCylinders: 2);
        deliveryObject[4] = new Delivery( Name: "Rajesh", street: "1th Avenue", Area: "Alpha - 1", Pincode: "201308", Mobile_No: "9999923322", numOfCylinders: 1);
    
        
        for(Delivery delivery : deliveryObject) {
            delivery.delPersonDetails();
            delivery.getLastDate();
            delivery.getDates();
            delivery.validate();
            delivery.amountCalc();
            delivery.verfyOpt();
           
        }
        System.out.println();
        cylinderCount(deliveryObject);
        checkLateDel(deliveryObject);
        numOfSingleCylinder(deliveryObject);
        DeliveryDetails(deliveryObject);
        printReport(deliveryObject);
        printInvoice(deliveryObject);
        
      }
    
    }
    
    
    
    }

   
    

