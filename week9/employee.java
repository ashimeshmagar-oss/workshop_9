package week9;


/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employee
{
    protected int employeeId;
    protected String Name;
    protected double basicSalary;
    
    public employee(int employeeId, String Name, double basicSalary)
    {
        this.employeeId=employeeId;
        this.Name=Name;
        this.basicSalary=basicSalary;
        
    }
    
    double calculateBonus()
    {
        double bonus = basicSalary + (0.1 * basicSalary);
        return bonus;
    }
    
    void displayEmployee()
    {
        System.out.println("Employee Id:" + employeeId);
        System.out.println("Employee name:" + Name);
        System.out.println("Employee basicSalary:" + basicSalary);
    }
}