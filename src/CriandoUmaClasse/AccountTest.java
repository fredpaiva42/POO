package CriandoUmaClasse;

public class AccountTest {
    public static void main(String[] args){
        CheckingAccount account01 = new CheckingAccount();
        account01.name = "Fred";
        account01.deposit(1000);
        account01.displayCustomer();
        account01.withdraw(700);
        account01.displayCustomer();
        account01.balance += account01.calcInterested();
    }
}
