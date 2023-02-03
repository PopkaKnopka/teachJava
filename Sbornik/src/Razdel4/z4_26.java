package Razdel4;

import java.util.Scanner;

public class z4_26 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, x1, y, y1;
        x = in.nextInt();
        y = in.nextInt();
        x1 = (x / 100) * 100;
        x = x % 100;
        y1 = (y / 100) * 100;
        y = y % 100;
        x = x + y1;
        y = y +x1;
        System.out.println(x+ " " + y); 

    }

}
