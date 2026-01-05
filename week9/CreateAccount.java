package week9;


/**
 * Write a description of class CreateAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateAccount extends BankAccount
{
    private double overdraftLimit;

public CreateAccount(int accountNumber,String accountholderName,double balance,double overdraftLimit)
{
super(accountNumber,accountholderName,balance);
this.overdraftLimit=overdraftLimit;
}

boolean withdraw(double amount)
{
if(amount<=balance+overdraftLimit)
{
balance=balance-amount;
return true;
}
else
{
return false;
}
}
}