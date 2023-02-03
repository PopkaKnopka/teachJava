package Razdel4;

import java.util.Scanner;

public class z4_11 {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int x = in.nextInt();
        System.out.println("Длинна двухзначного числа = " + (((x/10)) - (x%10))); 
    }
}
