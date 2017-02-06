
package server_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sibi
 */
public class Server_Socket {

    public static void main(String[] args) {
       try{
           ServerSocket serv=new ServerSocket(8000);
           
           Socket soc=serv.accept();
           
           BufferedReader bea=new BufferedReader(new InputStreamReader(soc.getInputStream()));
           
           String recv=bea.readLine();
           System.out.println("Received: "+recv);
       }
       catch(Exception e){
           
       }
    }
    
}
