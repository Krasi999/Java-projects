package EX3;

public class Main {
    public static void main(String[] args) {
            DebitAccount debitAccount = new DebitAccount(100, 5);
            CreaditAccount creditAccount = new CreaditAccount(100, 10, 2) ;

            System.out.printf("Debit account sum: %.2f\n", debitAccount.pay());
            System.out.printf("Credit account sum: %.2f\n", creditAccount.pay());

    }
}
