/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 7;
        int b = 9;
        if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>=b");
        }
        String str = a < b ? "a<b" : "a>=b";
        System.out.println(str);
        System.out.println(a < b ? "a<b" : "a>=b");
        int age = 25;
        if (age > 18) {
            System.out.println("������� ����������������");

        }
        String in;
        in = JOptionPane.showInputDialog("������� �����", JOptionPane.QUESTION_MESSAGE);
        System.out.println(in);
        if (in != null && !in.equals("")) {
            double n = Double.parseDouble(in);
            if (n > 0) System.out.println("�� ����� ������������� �����");
            else if (n == 0) System.out.println("�� ����� ����");
            else System.out.println("�� ����� ������������� �����");
                
            }
            else {
                System.out.println("�� �� ����� �����");
                }
        }
    }

