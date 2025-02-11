package EX2;

public class Main {
    public static void main(String[] args) {
        Firm_ET firm1 = new Firm_ET("NASA","23.09.2024", "123456789", "Krasimir", 1200, 4500);
        System.out.println("The firm's earning are: " + firm1.earnings());
    }
}
