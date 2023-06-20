/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gasSupplier;

/**
 *
 * @author Hp
 */
public interface gasAgency {
    
    public String AgencyName = "Bharat Gas";
    public int AgencyCode = 1234;
    public int PhNumber = 79055754;
    
    default void showAgency(){
        System.out.println("The Agency Name is"+AgencyName);
        System.out.println("The Agency Code is"+AgencyCode);
        System.out.println("The Agency Phone Number is"+PhNumber);
    }
    
}
