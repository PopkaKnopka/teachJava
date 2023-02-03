package Razdel6;

import java.util.Scanner;

public class z6_9 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int x1 = (x / 100) % 10;
        int x2 = (x % 100) / 10;
        int x3 = x % 10;
        if (x1 % 2 == 0 && x2 % 2 == 0 && x3 % 2 == 0) {
            System.out.println("Число чётно-красивое"); 
        }
    }
}
