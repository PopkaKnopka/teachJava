package Razdel4;

import java.util.Scanner;

public class z4_13 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x1;
        int x2;
        int y=0;
        int x = in.nextInt();
        x1 = x/10;
        x2 = x%10;
        if ( x1%2==0)
            y++;
        if (x2%2==0)
            y++;
        System.out.println(y); 
    }

}
