package EX9;

//Да направим задача, в която едната нишка записва във файл,
// а другата да чете от него и да го принтира на конзолата.
// Нека двете нишки да бъдат синхронизирани и да се изчакват

import java.io.*;
import java.util.Scanner;

public class Main {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Runnable writer = () -> {
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src/EX9/myFile"))) {
                Scanner sc = new Scanner(System.in);
                while (true) {
                    String input = sc.nextLine();

                    synchronized (lock) {
                        fileWriter.write(input);
                        fileWriter.newLine();
                        fileWriter.flush();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Runnable reader = () -> {
            while (true) {
                try {
                    Thread.sleep(5000);

                    synchronized (lock) {
                        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/EX9/myFile"))) {
                            String line;
                            while ((line = fileReader.readLine()) != null) {
                                System.out.println(line);
                            }
                            System.out.println();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}