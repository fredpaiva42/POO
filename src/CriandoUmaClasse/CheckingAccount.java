package CriandoUmaClasse;

public class CheckingAccount {
    public String name;
    public double balance, interestRate = 0.8;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if (balance < amount)
            System.out.println("The balance is too low to make the withdraw");
        else if (amount < 0) {
            System.out.println("Amount negative is invalid");
        }else{
            balance -= amount;
        }
    }

    public double calcInterested(){
        double interest = balance * interestRate / 12;
        return interest;
    }

    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: "+ interestRate);
    }
}
