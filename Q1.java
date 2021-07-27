/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABNO9;

/**
 *
 * @author rakesh
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    double myBalance = 1000000;
    double bankBalance = 1000000;
    double creditRating = 0.1;
    final int P = 1234;
    boolean access = false;
    Scanner s = new Scanner(System.in);

    public void  Bank() 
    {
        
        int pin = 0;
        String ch;
        double amt,am;
        System.out.print("Please enter your 4 digit pin code: ");
        try 
        {
            pin = s.nextInt();
        } catch (InputMismatchException e) 
        {
            System.out.print("Invalid code entered");
        }

        if (pin == P) {
          access = true; 
        }
        System.out.println("Welcome to ICIC Bank ");
        System.out.println("Start ur transaction");
        System.out.println("Enter y to deposit (y/n)");
        ch=s.next();
        if(ch.equals('y'))
        {
        System.out.println("Enter amount to be to deposited");
        amt=s.nextDouble();
        deposit(amt);
        }        
        System.out.println("Enter y to withdraw (y/n)"); 
        ch=s.next();
        if(ch.equals('y'))
        {       
        System.out.println("Enter amount to be to withdraw");
        am=s.nextDouble();      
        withdraw( am);
        }
        System.out.println("Your account balance is £" + myBalance);
        System.out.println("Enter y to take a loan (y/n)"); 
        ch=s.next();
         if(ch.equals('y'))
        {
        System.out.println("  credit check is being done");
                try {
                    checkCreditRating();
                } catch (InterruptedException e) {
                    System.out.println("The server is unavailable Try again");
                }
        }
    }
    public void deposit(double amount) {
        myBalance += amount;
    }

    public void withdraw(double amount) {
        if (myBalance > amount) {
            System.out.println("Your transaction have been successfully withdrawn.");
        } else {
            System.out.println("You can't complete this transaction");
        }
      myBalance -= amount;  
    }
    class InterruptedException extends Exception
    {
    public InterruptedException (String s)
    {
        
        super(s);
    }
    }
public  class credit
{
    public  void checkCreditRating(double creditRating) throws InterruptedException 
    {
        
        if (creditRating <= 5.0) {
            throw new InterruptedException ("Can't provide loan");
            
        }
        else
        {
        System.out.print("Please enter your loan amount: ");
        double amount = s.nextDouble();
        if (amount > bankBalance) 
        {
             throw new InterruptedException ("Can't provide loan");
        }
      }
    }
    public  void main(String args[])
    {
    	credit obj = new credit();
        
        try
        {
            obj.checkCreditRating(6.0);
        }
        catch (InterruptedException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}
    public double checkAccountBalance() {
        return myBalance;
    }
}
    

