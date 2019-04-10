/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

//its an single server-client program

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Socket5 {
    public static void main(String []p){
        try {
            ServerSocket ss = new ServerSocket(5555);
            Socket s = ss.accept();
            InputStream in = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PrintWriter out = new PrintWriter(new OutputStreamWriter(os,"UTF-8"),true);
            Scanner sc = new Scanner(in,"UTF-8");
            out.println("Write Bye to Exit");
            out.println("Addition of two numbers ");
            out.println("Enter No 1 ;");
           while(sc.hasNextLine()){
                String line = sc.nextLine();
                out.println("Enter No 2 ;");
                String line2 = sc.nextLine();
           if(line.equalsIgnoreCase("bye")){
           s.close();
           break;
           }else
           {
            
          int no = Integer.parseInt(line);
           int no2 = Integer.parseInt(line2);
         
           out.printf("Addtion of %d and %d is %d",no,no2,no+no2);
           out.println(" ");
           out.println("Enter No 1 ;");
    System.exit(0);
           }
           }
           
        } catch (IOException ex) {
            Logger.getLogger(Socket5.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    } 
}