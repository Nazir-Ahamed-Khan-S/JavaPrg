package BankApp;

public class BankAccountApplication {

    public static void main(String[] args) {

        BankAccount rbsAccount1 = new BankAccount(101,10000.00);
        //rbsAccount1.accountNumber = 101;
        //rbsAccount1.balance = 10000.00;

        System.out.println(rbsAccount1.getBalance());   

        rbsAccount1.deposit_amount(15000.00);
        rbsAccount1.withdraw_amount(10000.00);          
        rbsAccount1.check_balance();

        BankAccount rbsAccount2 = new BankAccount(201,5000.00);
        // rbsAccount2.accountNumber = 201;
        // rbsAccount2.balance = 50000.00;

        rbsAccount2.withdraw_amount(5000);             
    }
}