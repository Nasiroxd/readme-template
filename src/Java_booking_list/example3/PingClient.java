package Java_booking_list.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class PingClient {
    private Socket clientSocket;
    private PrintWriter request;
    private BufferedReader respond;

    public void Connection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip,port);
        respond = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        request = new PrintWriter(clientSocket.getOutputStream(),true);
    }

    public  String sendMessage(String msg) throws IOException {
        request.println(msg);
        String ReavieseSend = respond.readLine();
        return ReavieseSend;
    }

    public static void main(String[] args) throws IOException {
        PingClient pingClient = new PingClient();
        pingClient.Connection("127.0.0.1",6000);

        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (scanner.equals("bye"))
                break;
            System.out.println(pingClient.sendMessage(input));
        }
    }

}
