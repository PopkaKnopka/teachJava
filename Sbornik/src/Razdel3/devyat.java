package Razdel3;

import java.util.Scanner;

public class devyat {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int b1 = 10;
        int b2 = 100;
        int b3 = 1000;

        int bv;
        int x1;
        int x2;
        int x3;
        
        x1 = in.nextInt();
        x2 = in.nextInt();
        x3 = in.nextInt();
        System.out.println(" "); 
        bv = x1 * (b1) + x2 * b2 + x3 * b3;
        System.out.println("Всего баллов: " + bv);
        

    }

}
