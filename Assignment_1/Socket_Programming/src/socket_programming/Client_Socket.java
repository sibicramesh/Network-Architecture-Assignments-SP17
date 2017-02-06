
package socket_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author sibi
 */
public class Client_Socket {

    public static void main(String[] args) {
       try
       {
           Socket soc=new Socket("localhost",8000);
           
           PrintStream pri=new PrintStream(soc.getOutputStream());
           
           System.out.println("Enter Something: ");
           
           InputStreamReader rea=new InputStreamReader(System.in);
           
           BufferedReader bea=new BufferedReader(rea);
           
           String snd=bea.readLine();
           pri.println(snd);
       }
       catch(Exception e){
           
       }
    }
    
}
