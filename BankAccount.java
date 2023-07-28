abstract class BankAccount {
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
}

abstract class SavingsAccount extends BankAccount implements InterestBearing{
    private double balance;

    @Override
    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.print("Widthdrawn"+ amount);
        } else{
            System.out.print("Insufficient balance");
        }
    }

     @Override
    void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.print("Deposited"+ amount);
        } else {
            System.out.print("Invalid request");
        }
    }

    @Override
    public double calculateInterest(){
        return balance *0.03;
    }

} 

interface InterestBearing{
    double calculateInterest();
}