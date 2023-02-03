package Razdel3;

import java.util.Scanner;

public class shest {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        System.out.println(" "); 
         
        for (int i = 0; i < 3; i++) {
            x +=2;
            System.out.print(x + " "); 
        }
            System.out.println(); 
    }
}
