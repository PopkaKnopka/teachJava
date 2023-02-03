package Razdel4;

import java.util.Scanner;

public class z4_24 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, x1, y, y1;
        x = in.nextInt();
        y = in.nextInt();
        x1 = x%10;
        x = x/10;
        y1 = y%10;
        y = y/10;
        x = x*10+y1;
        y= y*10+x1;
        
        System.out.println(x + " " + y); 
    }
}
