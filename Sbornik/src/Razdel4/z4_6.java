package Razdel4;

import java.util.Scanner;

public class z4_6 {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int x = in.nextInt();
        System.out.println((x/100)*100 + " + " + ((x/10)%10)*10 + " + " + x%10); 
    }
    
}
