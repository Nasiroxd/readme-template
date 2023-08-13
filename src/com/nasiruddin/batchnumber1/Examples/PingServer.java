package com.nasiruddin.batchnumber1.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class PingServer {
    private final int port;
    private Socket serverSocket;

    public PingServer(int port){
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket server = new ServerSocket(port);
        System.out.println("Server 127.0.0.1 "+ port);
        listenAndDisConnection(server);
    }

    public void listenAndRespond(ServerSocket serverSocket)throws IOException{
        Socket clientSocket = null;
        BufferedReader request = null;
        PrintWriter respond = null;

        try {
            clientSocket = serverSocket.accept();
            System.out.println("Client connection");
            request = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            respond = new PrintWriter(clientSocket.getOutputStream(),true);

            String line;
            while ((line = request.readLine())!=null){
                System.out.println("Respond Server : " + line.toUpperCase());
                respond.println("Respond : " + line.toUpperCase());
            }



        } catch (SocketException e) {
            relseningRequest(clientSocket,request,respond);
            listenAndRespond(serverSocket);


        }

    }

    private void relseningRequest(Socket clientSocket, BufferedReader request, PrintWriter respond) throws IOException {

        if (request !=null)request.close();
        if (respond != null)respond.close();
        if (clientSocket != null)clientSocket.close();
    }

    public void listenAndDisConnection(ServerSocket serverSocket) throws IOException {
       while (!serverSocket.isClosed()) {
           try(Socket socket = serverSocket.accept()){
               BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
               PrintWriter respond = new PrintWriter(socket.getOutputStream(),true);

               String line;
               while ((line = request.readLine())!=null){
                   System.out.println("Respond Server : " + line.toUpperCase());
                   respond.println("Respond : " + line.toUpperCase());
               }

           }catch (IOException e){
               System.out.println("Client Disconnection");
           }
       }

    }

    public void sends(String msg) throws IOException {
        PrintWriter request = new PrintWriter(serverSocket.getOutputStream(), true);
        request.println(msg);
        BufferedReader respond = new BufferedReader(
                new InputStreamReader(serverSocket.getInputStream())
        );
        String line = respond.readLine();
        System.out.println(line);


    }

    public static void main(String[] args) throws IOException {
        PingServer pingServer = new PingServer(6000);
        pingServer.start();

        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if (input.equals("bye"))
                break;;
            pingServer.sends(input);

        }
    }
}
