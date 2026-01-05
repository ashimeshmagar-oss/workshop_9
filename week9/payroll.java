package week9;


/**
 * Write a description of class payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class payroll
{
    public static void main(String[] Args)
    {
        Permanent_employee P1 = new Permanent_employee(01,"Ashimesh",50000,6900,1500);
        P1.displayEmployee();
        double bonus = P1.calculateBonus();
        double totalSalary = P1.calculateTotalSalary();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: "+ totalSalary);
        
        Contract_employee C1= new Contract_employee(2,"prajwal",125,10);
        C1.displayEmployee();
        double totalSalary2 = C1.calculateTotalSalary();
        System.out.println("Total Slary: "+ totalSalary2);
        
    }
}