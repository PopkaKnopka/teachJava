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
public class z7_10 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        if (x < 0) {
            x = x * (-1);
            System.out.println(x);
        }
        else {
                    x = 0;
                    System.out.println(x); 
            }
        }
    }

