/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 *
 * @author Admin
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Сумма: " + result);
        result = a - b;
        System.out.println("Разность: " + result);
        result = a * b;
        System.out.println("Произведение: " + result);
        result = a / b;
        System.out.println("Деление: " + result);
        double d = (double) a / b;
        System.out.println("Деление: " + d);
        result = 7 % 3;
        System.out.println("Остаток от деления: " + result);
        a++; // a = a+1; a+=1;
        System.out.println("Инкремент: " + a);
        b--;
        System.out.println("Декремент: " + b);
        a = a + b;
        System.out.println("a:"+a); 
        a+=b;
        System.out.println("a:"+a); 
        

    }
}
