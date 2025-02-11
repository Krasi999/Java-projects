package EX6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    public static void task1() {
        try(BufferedReader br = new BufferedReader(new FileReader("src/EX6/File1"))){
            String line = br.readLine();
            Pattern pattern = Pattern.compile("old");
            Matcher match = pattern.matcher(line);
            match.replaceAll("new");
            System.out.println(match.replaceAll("new"));
        }
        catch (IOException e){
            System.out.println("File is not found: " + e.getMessage());
        }
    }

    public static void task2() {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader("src/EX6/File2"))){
            String line;
            while ((line = br.readLine()) != null) {
                Matcher match = pattern.matcher(line);
                if (match.matches()) {
                    System.out.println(line + " - Valid");
                } else {
                    System.out.println(line + " - Invalid");
                }
            }
        } catch (IOException e) {
            System.out.println("File is not found: " + e.getMessage());
        }
    }

    public static void task3() {
        String regex = "^([a-zA-Z_][a-zA-Z0-9_]*)=(.*)$";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader("src/EX6/File3"))) {
            String line;
            while((line = br.readLine()) != null){
                Matcher match = pattern.matcher(line);
                if (match.matches()) {
                    String key = match.group(1);
                    String value = match.group(2);
                    System.out.println(key + ": " + value);
                }
            }
        }
        catch (IOException e){
            System.out.println("File is not found: " + e.getMessage());
        }
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input prefix: ");
        String prefix = scanner.nextLine();

        String regex = "\\b" + Pattern.quote(prefix) + "\\w*\\b";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader("src/EX6/File4"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher match = pattern.matcher(line);
                while (match.find()) {
                    System.out.println(match.group());
                }
            }
        } catch (IOException e) {
            System.out.println("File is not found: " + e.getMessage());
        }
    }
}
