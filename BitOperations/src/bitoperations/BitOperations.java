/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitoperations;

/**
 *
 * @author Admin
 */
public class BitOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 4;
        int b = 7;
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        System.out.println("s_a= "+s_a); 
        System.out.println("s_b= "+s_b); 
        System.out.println(s_a + " & " + s_b + " = "+Integer.toBinaryString(a&b)); 
        System.out.println(s_a + " | " + s_b + " = "+Integer.toBinaryString(a|b)); 
        System.out.println(s_a + " ^ " + s_b + " = "+Integer.toBinaryString(a^b)); 
        System.out.println("~ "+s_a + " = " +Integer.toBinaryString(~a)); 
        System.out.println(s_a + ">>1 = "+Integer.toBinaryString(a>>1)); 
        System.out.println(a + ">>1 = "+(a>>1)); 
        System.out.println(s_a + "<<1 = "+Integer.toBinaryString(a<<1)); 
        System.out.println(a + "<<1 = "+(a<<1)); 
        

    }

}
