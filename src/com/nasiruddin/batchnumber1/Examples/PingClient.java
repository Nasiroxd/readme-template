package com.nasiruddin.batchnumber1.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class PingClient {

    private Socket clientSocket;

    public void connection(String ip, int port) throws IOException {
        this.clientSocket = new Socket(ip,port);
    }

    public void send(String msg) throws IOException {
        PrintWriter request = new PrintWriter(clientSocket.getOutputStream(), true);
        request.println(msg);
        BufferedReader respond = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
        );
        String line = respond.readLine();
        System.out.println(line);


    }

    public static void main(String[] args) throws IOException {
        PingClient pingClient =   new PingClient();
        pingClient.connection("127.0.0.1",6000);

        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if (input.equals("bye"))
                break;;
                pingClient.send(input);

        }
    }







    }

