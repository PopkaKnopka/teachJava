/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Admin
 */
public class Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b_1 = true;  //1
        boolean b_2 = false; //0
        System.out.println(b_1 + " && " + b_2 + " == " + (b_1 && b_2)); //1 * 0
        System.out.println(b_1 + " || " + b_2 + " == " + (b_1 || b_2)); //1 + 0
        System.out.println(b_1 + " ^ " + b_2 + " == " + (b_1 ^ b_2)); // значения различны
        System.out.println("!"+b_1 + "="+!b_1);  // инвертирование

    }
}
