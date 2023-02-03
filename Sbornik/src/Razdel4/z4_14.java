package Razdel4;

import java.util.Scanner;

public class z4_14 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x1,x2,x3;
        int x = in.nextInt();
        int y =0;
        x1 = x/100;
        x2 = (x%100)/10;
        x3 = x%10;
        if (x1%2==0)
            y++;
        if (x2%2==0)
            y++;
        if (x3%2==0)
            y++;
        System.out.println(x2); 
    }
    
}
