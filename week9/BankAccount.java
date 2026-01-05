package week9;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    protected int accountNumber;
protected String accountholderName;
protected double balance;

public BankAccount(int accountNumber,String accountholderName,double balance)
{
this.accountNumber=accountNumber;
this.accountholderName=accountholderName;
this.balance=balance;
}

void deposit(double amount)
{
balance=balance+amount;
}

double getBalance()
{
return(balance);
}
    
}