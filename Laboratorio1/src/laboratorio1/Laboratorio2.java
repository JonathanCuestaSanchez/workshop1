/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 2112107
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        reader();
    }
    
    public static void reader() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num=1;
            while ((!input.equals(""))) {
                System.out.println(linea(num,input));
                input = br.readLine();
                num+=1;
            }
    }
     public static String linea(int a,String linea){
         return (a+" "+linea );
     }
    
}
