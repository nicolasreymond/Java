/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsurcharge;

import java.util.Scanner;

/**
 *
 * @author loic
 */
public class Testsurcharge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 8;
        int val2 = 5;
        String ch1 = "Hello ";
        String ch2 = "World";
        String val3 = "Hello ";

        System.out.println(ask(ch1));
        System.out.println(ask(val1));


    }
    
    public static String ask(String question){
        System.out.println("Entrer un string: ");
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        
        return result;
    }
    
    public static int ask(int nombre){
        System.out.println("Entrer un int: ");
        Scanner scan = new Scanner(System.in);
        int result = Integer.parseInt(scan.nextLine());
        
        return result;
    }
/*    public static double ask(String question){
        double value;
        try{
            value = Double.parseDouble(ask(question));
        }
        catch(Exception e){
            value = ask("Entrer un nombre!");
        }
        return value;
    }
    

    
    public static Byte ask(String question){
        Byte monByte = (byte) askIntBetween(question, 0, 127);
        return monByte;
    }
    
    public static int askIntBetween(String question, int min, int max){
        int monInt = ask(question); 
        if (monInt <= max && monInt >= min) {
            return monInt;
        } else {
            return askIntBetween("On a dit entre "+min+" et "+max+"!!!", min, max);
        }
    }*/
}