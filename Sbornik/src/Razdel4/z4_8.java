package Razdel4;

import java.util.Scanner;

public class z4_8 {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int x = in.nextInt();
        System.out.println(((((x%20)*100)+((x%5)*10)+x/100))-20);
    }
}
