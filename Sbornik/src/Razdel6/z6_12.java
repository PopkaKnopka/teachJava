package Razdel6;

import java.util.Scanner;

public class z6_12 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double x1;
        double x2;
        System.out.println(" "); 
        double  D = Math.pow(b, 2) - 4*a*c;
        System.out.println("Дискриминант равен " + D + "\n"); 
        if ( D > 0 ){
            x1 = (-b + (Math.sqrt(D)))/(2*a);
            x2 = (-b - (Math.sqrt(D)))/(2*a);
            System.out.println("x1 = " +x1 + "  x2= " + x2 + "  " ); 
        }
        if ( D == 0) {
            x1 = -b/(2*a);
            System.out.println("Единственный корень уровнения равен " +x1); 
        }
        if ( D < 0) System.out.println("Решений нет"); 
        }
            
        }
    


