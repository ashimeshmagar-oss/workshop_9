package week9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends vehicle
{
    double engineCapacity;
    
    public Bike(int vehicleID, String brand, double basePrice,double engineCapacity)
    {
        super(vehicleID, brand, basePrice);
        this.engineCapacity = engineCapacity;
        
    }
    double afterTax = basePrice + calculateTax();
    
    double calculateFinalPrice()
    {
        return(basePrice+calculateTax());
        
        
                        
    }
}