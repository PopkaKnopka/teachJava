package Razdel3;

import java.util.Scanner;

public class pyat {
    public static Scanner in = new Scanner (System. in);
    public static void main(String[] args) {
        double k1,k2,g,pl,per;
        k1 = in.nextDouble();
        k2 = in.nextDouble();
        g = in.nextDouble();
       
        pl = (k1*k2)/2;
        per = k1+k1+g;
        System.out.println("Площадь треугольника = "+pl + "\n" + "Перимитр треугольника = " + per); 
        
        
        
    }
    
}
