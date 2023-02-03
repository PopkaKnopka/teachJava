package Razdel4;

import java.util.Scanner;

public class z4_10 {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int x = in.nextInt();
        System.out.println("Вес предмета = :" + ((x/100 + (x%100)/10 + x%10))); 
    }
}
