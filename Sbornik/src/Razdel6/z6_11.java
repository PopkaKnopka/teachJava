package Razdel6;

import java.util.Scanner;

public class z6_11 {
     public static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {
         int x = in.nextInt();
         int y = in.nextInt();
         if ( x > 0 && y >0) System.out.println("Один и тот же знак"); 
         if ( x < 0 && y > 0) System.out.println("Разные знаки"); 
         if ( x > 0 && y < 0) System.out.println("Разные знаки"); 
         if ( x == 0 || y == 0) System.out.println("Некорректно"); 
         
     }
}
