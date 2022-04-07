/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Suci Awalia Gardara
 */


// BankDatabase.java
// Represents the bank account information database 

public class BankDatabase
{
    private Account[] accounts;
   
    public BankDatabase()
    {
        accounts = new Account[ 2 ];
       
        accounts[ 0 ] = new Account( 12345, 54321, 1000.0, 1200.0 );
        accounts[ 1 ] = new Account( 98765, 56789, 200.0, 200.0 );
    }
   
    private Account getAccount( int accountNumber )
    {
        for ( Account currentAccount : accounts )
        {
            if ( currentAccount.getAccountNumber() == accountNumber ) return currentAccount;
        }
       
        return null;
    }
   
    public boolean authenticateUser( int userAccountNumber, int userPIN )
    {
        Account userAccount = getAccount( userAccountNumber );
       
        if ( userAccount != null )
            return userAccount.validatePIN( userPIN );
        else
            return false;
    }
   
    public double getAvailableBalance( int userAccountNumber )
    {
        return getAccount( userAccountNumber ).getAvailableBalance();
    }
   
    public double getTotalBalance( int userAccountNumber )
    {
        return getAccount( userAccountNumber ).getTotalBalance();
    }
   
    public void credit( int userAccountNumber, double amount )
    {
        getAccount( userAccountNumber ).credit( amount );
    }
   
    public void debit( int userAccountNumber, double amount )
    {
        getAccount( userAccountNumber ).debit( amount );
    }
}