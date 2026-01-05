package week9;


/**
 * Write a description of class VehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main (String [] args)
    {
        Car c1= new Car(01,"Kia",6057000.00,4,"Petrol");
        c1.displayVehicleInfo();
        double tax = c1.calculateTax();
        double FinalPrice = c1.calculateFinalPrice();
        System.out.println("Tax: "+ tax);
        System.out.println("Final Price: "+ FinalPrice);
        
        
        Bike b1 = new Bike(01,"RoyalEnfield",601000.00,398.00);
        b1.displayVehicleInfo();
        double Final2Price = b1.calculateFinalPrice();
        System.out.println("Final Price: "+ FinalPrice);
        
        
    }
}