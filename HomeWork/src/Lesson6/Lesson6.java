/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson6;

/**
 *
 * @author Кирилл
 */
public class Lesson6 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        System.out.println("s_a - " + s_a + "  s_b - " + s_b);
        System.out.println(s_a + " & " + s_b + " = " + s_b + Integer.toBinaryString(a & b));
        System.out.println(s_a +" | "+s_b+" = "+Integer.toBinaryString(a|b));
        System.out.println(s_a+" ^ "+s_b+" = "+Integer.toBinaryString(a^b)); 
        System.out.println("~"+Integer.toBinaryString(~a)); 
        System.out.println(s_a + ">>1"+Integer.toBinaryString(a>>1)); 
        System.out.println(s_a + "<<1"+Integer.toBinaryString(a<<1)); 
    }

}
