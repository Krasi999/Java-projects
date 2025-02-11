package EX10;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    private List<PrintStream> clients;
    private final Object lock;

    public Server(){
        clients = new ArrayList<>();
        lock =  new Object();
    }

    public static void main(String[] args) {
        new Server().start();
    }
    private void start() {
        try {
            ServerSocket socket = new ServerSocket(2101);
            while (true) {
                Socket client = socket.accept();

                Runnable clientRunnable = () -> {
                    try {
                        Scanner in = new Scanner(client.getInputStream()); // Reads input from the client.
                        PrintStream out = new PrintStream(client.getOutputStream()); // Sends output to the client

                        synchronized (lock) {
                            clients.add(out);
                        }

                        while (true) {
                            String line = in.nextLine();
                            if (line.contains("quit")) {
                                synchronized (lock) {
                                    clients.remove(out);
                                }
                                in.close();
                                out.close();
                                return;
                            }
                            synchronized (lock) {
                                for (PrintStream e : clients) {
                                    e.println(line);
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };

                Thread clientThread = new Thread(clientRunnable);
                clientThread.start();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
