/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Razdel7;

import java.util.Scanner;

/**
 *
 * @author Кирилл
 */
public class z7_9 {
        public static Scanner in = new Scanner (System.in);
        public static void main(String[] args) {
            double p = in.nextInt();
            double k1 = in.nextInt();
            double k2 = in.nextInt();
            double g = in.nextInt();
            
            if ( (k1 + k2 + g)!=p) System.out.println("Треугольник не прямоугольный"); 
            else System.out.println("Треугольник прямоугольный"); 
        }
}
