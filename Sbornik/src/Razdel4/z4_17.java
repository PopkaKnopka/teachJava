package Razdel4;

import java.util.Scanner;

public class z4_17 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, x2, x3, x4;
        int x = in.nextInt();
        x1 = (x / 1000);
        x2 = (x / 100) % 10;
        x3 = (x % 100) / 10;
        x4 = x % 10;
        System.out.println(x4 + " " + x3 + " " + x2 + " " + x1); 
    }

}
