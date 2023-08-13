package com.nasiruddin.batchnumber1.aynic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServerAsync {

    private final   int port;

    public PingServerAsync(int port){
        this.port = port;
    }



    public void start() throws IOException {
        ServerSocket server = new ServerSocket(port);
        System.out.println("Server 127.0.0.1 "+ port);
        handlerRequestAsync(server);
    }

    public void handlerRequestAsync(ServerSocket serverSocket) throws IOException {
        while (!serverSocket.isClosed()) {
            Socket socket = serverSocket.accept();
            PingThreadingAsync pingThreadingAsync = new PingThreadingAsync(socket);
            Thread t1 = new Thread(pingThreadingAsync);
            t1.start();

        }

    }

    public static void main(String[] args) throws IOException {
        PingServerAsync pingServerAsync = new PingServerAsync(6000);
        pingServerAsync.start();
    }

}
