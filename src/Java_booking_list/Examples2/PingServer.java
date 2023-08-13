package Java_booking_list.Examples2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class PingServer {

    private final int port;
    private int count;

    private ServerSocket server;
    public PingServer(int port){
        this.port = port;
    }
    private void start() throws IOException {
        server = new ServerSocket(port);
        System.out.println("Server stated.........");
        listenAndRespond();
    }

    private void listenAndRespond() throws IOException {
        Socket client = null;
        BufferedReader request = null;
        PrintWriter respond = null;

       try {
           while (!server.isClosed()){
               client = server.accept();
               System.out.println(++count+"Client Connection");

               request = new BufferedReader(
                       new InputStreamReader(client.getInputStream())
               );

               respond = new PrintWriter(client.getOutputStream(),true);
               String inputLine;
               while ((inputLine = request.readLine())!= null){
                   System.out.println("From Client :  " + inputLine);
                   respond.println("From server : "+ inputLine.toUpperCase());
               }

           }
       }catch (SocketException se){
           releaseDisconnectionClient(client, request,respond);
           listenAndRespond();
       }


    }

    private  void releaseDisconnectionClient(Socket client, BufferedReader request, PrintWriter respond) throws IOException {
        count--;
        System.out.println("Client disconnection");
        if (request != null) request.close();
        if (respond != null) respond.close();
        if (client != null) client.close();
    }

    public static void main(String[] args) throws IOException {
        PingServer server = new PingServer(5000);
        server.start();
    }
}
