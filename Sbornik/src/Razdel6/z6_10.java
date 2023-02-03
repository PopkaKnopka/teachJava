package Razdel6;

import java.util.Scanner;

public class z6_10 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int x1 = x/10;
        int x2 = x%10;
        int y = x1*x2;
        if ( x > y) System.out.println("Произведение цифр х меньше чем само число х"); 
        if ( x < y) System.out.println("Произведение цифр х больше чем само число х"); 
        
    }
}
