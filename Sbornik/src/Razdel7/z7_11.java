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
public class z7_11 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            System.out.print(y + " " + x);
            System.out.print(x + " " + y);
        }
            if (x < y) {
                System.out.println(x + " " + y);
                System.out.println(y + " " + x);
            } 

    }
}
