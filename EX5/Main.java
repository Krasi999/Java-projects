package EX5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a chess move: ");
        String move = scanner.nextLine();

        Pattern pattern = Pattern.compile("([KQRBN]?)([a-h][1-8])?(x?)([a-h][1-8])(=?[QRBN]?)?(\\+|#)?");
        Matcher matcher = pattern.matcher(move);

        if (matcher.matches()) {
            System.out.println(move + " is a valid move.");
        } else {
            throw new InvalidChessMoveException("THIS IS NOT A CHESS MOVE!");
        }
    }
}