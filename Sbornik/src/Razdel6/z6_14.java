 package Razdel6;

import java.util.Scanner;

public class z6_14 {
        public static Scanner in = new Scanner (System.in);
        public static void main(String[] args) {
            int a = in.nextInt();
            int b = in.nextInt();
            
            if ( a*b > 0) System.out.println("Дробь положительная"); 
            else {
                System.out.println("Дробь отрицательная"); 
            }
            
        }
    
}
