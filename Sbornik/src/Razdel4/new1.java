package Razdel4;

import java.util.Scanner;

public class new1 {

    public static Scanner in = new Scanner(System.in);
   

    public static void main(String[] args) {
        int x, xfirst, xlast, xmiddle, y;
        x = in.nextInt();
        xfirst = x / 1000;
        xlast = x % 10;
        xmiddle = (x / 10) % 100;
        y = xlast * 1000 + xmiddle*10 + xfirst;
        System.out.println(y);
        
    }
    }



