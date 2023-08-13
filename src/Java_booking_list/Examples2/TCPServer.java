package Java_booking_list.Examples2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    private final int  port;
    public TCPServer(int port){
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket server = new ServerSocket(this.port);
        System.out.println("Server Started.......");

        Socket clientSocket = server.accept();
        System.out.println("Client connection.....");

        //Client request...

        BufferedReader request = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
        );

        String line = request.readLine();
        while (!line.isEmpty()){
            System.out.println("Form client " + line);
            line = request.readLine();
        }


    }

    public static void main(String[] args) throws IOException {
        TCPServer tcpServer = new TCPServer(5000);
        tcpServer.start();

    }
}
