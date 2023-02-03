package Razdel8;

import java.util.Scanner;

public class z8_7 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) System.out.println(x-y);
        if (x < y) System.out.println(y-x);
        if (x==y) System.out.println(x*y);
        
            
    }
}
