package Java_booking_list.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {
    private final  int port;

    public TCPServer(int p){
       port = p;

    }

    public void start() throws IOException {
       try {
           ServerSocket server = new ServerSocket(port);
           System.out.println("Server started........");

           Socket clientSocket = server.accept();
           System.out.println("Client connection.......");

           //client request......

           BufferedReader request = new BufferedReader(
                   new InputStreamReader(clientSocket.getInputStream())
           );

           PrintWriter respond = new PrintWriter(clientSocket.getOutputStream(),true);
           String line = request.readLine();
           while (!line.isEmpty()){
               System.out.println("From  client : " + line);
               respond.println("From server : " + line);
               line = request.readLine();
           }

       }catch (SocketException se){
           se.printStackTrace();

       }
    }

    public static void main(String[] args) throws IOException {
        TCPServer tcpServer = new TCPServer(5003);
        tcpServer.start();
    }
}
