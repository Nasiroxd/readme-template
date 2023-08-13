package Java_booking_list.Examples2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class PingClient2 {
    private Socket clientSocket;
    private PrintWriter request;
    private BufferedReader respond;

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip,port);
        request = new PrintWriter(clientSocket.getOutputStream(),true);
        respond = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    }

    public String sendMessage(String msg) throws IOException {
        request.println(msg);
        String serverRespond = respond.readLine();
        return serverRespond;

    }

    public static void main(String[] args) throws IOException {
        PingClient2 pingClient2 = new PingClient2();
        pingClient2.startConnection("127.0.01",5000);


        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if (input.equals("bye"))break;
            System.out.println(pingClient2.sendMessage(input));
        }
    }


}
