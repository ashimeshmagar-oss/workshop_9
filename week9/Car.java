package week9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends vehicle
{
    int numberofDoors;
    String FuelType;
    
    public Car (int vehicleID, String brand, double basePrice,int numberofDoors,String FuelType)
    {
        super(vehicleID,brand,basePrice);
        this.numberofDoors = numberofDoors;
        this.FuelType = FuelType;
    }
    double basePriceAfterTax = basePrice + calculateTax();
    
    double calculateFinalPrice()
    {
        double FinalPrice = basePriceAfterTax + (basePriceAfterTax * 0.05);
        
        return FinalPrice;
    }
}