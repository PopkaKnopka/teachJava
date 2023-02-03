package Razdel4;

import java.util.Scanner;

public class z4_9 {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int x = in.nextInt();
        System.out.println("Вес предмета = " + ((x/10) + (x%10))); 
        
    }
    
}
