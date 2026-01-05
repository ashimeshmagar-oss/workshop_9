package week9;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount
{
    private int InterestRate;

public SavingAccount(int accountNumber,String accountholderName,double balance,int InterestRate)
{
super(accountNumber,accountholderName,balance);
this.InterestRate=InterestRate;
}

double calculateInterest()
{
return(getBalance()*InterestRate/100);
}
}