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
        System.out.println("�����: " + result);
        result = a - b;
        System.out.println("��������: " + result);
        result = a * b;
        System.out.println("������������: " + result);
        result = a / b;
        System.out.println("�������: " + result);
        double d = (double) a / b;
        System.out.println("�������: " + d);
        result = 7 % 3;
        System.out.println("������� �� �������: " + result);
        a++; // a = a+1; a+=1;
        System.out.println("���������: " + a);
        b--;
        System.out.println("���������: " + b);
        a = a + b;
        System.out.println("a:"+a); 
        a+=b;
        System.out.println("a:"+a); 
        

    }
}
