public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1000.0);
        account.printTransactionHistory();

        System.out.println("Current balance: " + account.getBalance());
    }
}
