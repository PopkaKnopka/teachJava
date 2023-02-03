package Razdel4;

import java.util.Scanner;

public class z4_2 {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        System.out.println(x/100 + " " + (x%100)/10 + " " + x%10); 
    }
    
}
