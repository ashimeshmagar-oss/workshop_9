package week9;


/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    protected int vehicleID;
    protected String brand;
    protected double basePrice;
    
    public vehicle (int vehicleID, String brand, double basePrice)
    {
        this.vehicleID=vehicleID;
        this.brand=brand;
        this.basePrice=basePrice;
        
    }
    void displayVehicleInfo()
    {
        System.out.println("Vehicle ID = "+ vehicleID);
        System.out.println("Brand of the vehicle = "+ brand);
        System.out.println("BasePrice of the vehicle = "+ basePrice);  
    }
    double calculateTax()
    {
        double Price = basePrice + (0.1 * basePrice);
        return Price;
        
    }
}