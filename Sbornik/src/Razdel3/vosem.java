package Razdel3;

import java.util.Scanner;

public class vosem {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double dO = in.nextDouble();
        double vT = in.nextDouble();
        double pl = (dO*vT)/2;
        double per = dO + 2 * (Math.sqrt((Math.pow(dO/2,2))+ Math.pow(vT, 2)));
        System.out.println("Площадь равнобедренного треугольника = " + pl); 
        System.out.println("Перимитр равнобедренного треугольника = " +per); 
    }
    
}
