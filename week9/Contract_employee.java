package week9;


/**
 * Write a description of class Contract_employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contract_employee extends employee
{
    private int workingDays;
    
    public Contract_employee(int employeeId, String Name, double basicSalary, int workingDays)
    {
        super(employeeId, Name, basicSalary);
        this.workingDays=workingDays;
        
    }
    
    double calculateTotalSalary()
    {
        double total = basicSalary + workingDays;
        return total;
    }
}