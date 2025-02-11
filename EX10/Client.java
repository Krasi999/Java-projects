package EX10;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        new Client().start();
    }
    private void start(){
        try{
            Socket socket = new Socket("localhost", 2101);

            System.out.print("Enter your name: ");
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();

            Scanner in = new Scanner(socket.getInputStream()); // Reads messages from the server.
            PrintStream out = new PrintStream(socket.getOutputStream()); // Sends messages to the server.

            Runnable writer = () -> {
                while(true){
                    String line = console.nextLine();
                    out.println(name + ": " + line);
                    if(line.contains("quit")) {
                        in.close();
                        out.close();
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return;
                    }
                }
            };

            Runnable reader = () -> {
                while(true){
                    if(in.hasNext()){
                        String line = in.nextLine();
                        System.out.println(line);
                    }
                }
            };

            Thread writerThread = new Thread(writer);
            Thread readerThread =  new Thread(reader);

            writerThread.start();
            readerThread.start();

            try {
                writerThread.join();
                readerThread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
