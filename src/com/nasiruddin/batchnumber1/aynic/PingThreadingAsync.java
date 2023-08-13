package com.nasiruddin.batchnumber1.aynic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class PingThreadingAsync implements Runnable{
    private Socket clientSocket;
    private BufferedReader request;

    public PingThreadingAsync(Socket clientSocket){
        this.clientSocket = clientSocket;
    }
        @Override
        public void run() {
            try{
                request = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter respond = new PrintWriter(clientSocket.getOutputStream(),true);

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

