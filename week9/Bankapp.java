package week9;


/**
 * Write a description of class Bankapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bankapp
{
    public static void main(String[] args)
{
SavingAccount sa1= new SavingAccount(001,"Aabash",50000,7);
sa1.deposit(5000);

CreateAccount ca1=new CreateAccount(002,"Aabash2",30000,10000);
ca1.withdraw(1000);
System.out.println("The current balance is "+ca1.balance);

}

}