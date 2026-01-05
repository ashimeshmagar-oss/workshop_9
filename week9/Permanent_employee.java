package week9;


/**
 * Write a description of class Permanent_employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Permanent_employee extends employee
{
    private double HRA;
    private double DA;
    
    public Permanent_employee(int employeeId, String Name, double basicSalary,double HRA, double DA)
    {
        super(employeeId, Name, basicSalary);
        this.HRA=HRA;
        this.DA=DA;
    }
    
    double calculateTotalSalary()
    {
        double total = basicSalary + HRA + DA + calculateBonus();
        return total;
    }
}