/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Razdel6;

import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class z6_8 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int y = in.nextInt();
        if ( x > y)System.out.println("Сумма x и y равна : " + (x+y));
        if ( x < y )System.out.println("Произведение x и y равно:" +(x*y));
        if (x == y) System.out.println("Числа равны"); 
        
       
    }

}
