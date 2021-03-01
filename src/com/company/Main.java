package com.company;

import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
	    int port = 1;
	    while(port <= 65535) {
	        try{
	            ServerSocket serverSocket = new ServerSocket(port);
            } catch (Exception ex) {
                System.err.println("Port " + port + " is currently occupied.");
            } finally {
	            port++;
            }
        }
    }
}
