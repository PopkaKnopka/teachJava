package Razdel8;

import java.util.Scanner;

public class z8_11 {
        public static Scanner in = new Scanner (System.in);
        public static void main(String[] args) {
            int x = in.nextInt();
            int y = in.nextInt();
            if ( x < y) System.out.println((y-x) + " лишних стульев"); 
            if ( x == y) System.out.println("Стульев достаточно"); 
            if  (x > y) System.out.println((x-y) + " недостаток стульев"); 
            
            
        }
}
