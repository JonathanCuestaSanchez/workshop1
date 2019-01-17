/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author 2112107
 */
public class Laboratorio1 {

     public static String anagrama(String first, String second) {
         String h=first.toLowerCase();
       String b=second.toLowerCase();
        char[] lista=h.toCharArray();
        ArrayList<String> comparar= new ArrayList();
        if (first.length() != second.length()) {
            return ("Not Anagrams");
        } else {
            int tamaño=first.length();
            for (char c: lista) {
                
                if(!comparar.contains(String.valueOf(c))){
                    
                    h=h.replace(String.valueOf(c),String.valueOf(""));
                    b=b.replace(String.valueOf(c),String.valueOf(""));                   
                    if (h.length()==b.length()) {
                        comparar.add(String.valueOf(c));
                    }else{
                        return("Not Anagrams");
                    }                    
                }
                

            }
            if(lista.length== tamaño){
                return ("Anagrams");
            }else{
                return("Not Anagrams");
            }
           

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();
        System.out.println(anagrama(input,input2));
    }
}
