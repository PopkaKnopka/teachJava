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
public class z6_7 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        if ( x > 0 && x>100){
            x--;
            System.out.println(x); 
        }
    }
}
