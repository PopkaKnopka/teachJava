/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson9;

import javax.swing.JOptionPane;

/**
 *
 * @author ������
 */
public class asda {

    public static void main(String[] args) {
        int i = 0;

        /* 
while (i < 100) { 
System.out.print(i + " "); 
i++; 
} 
System.out.println(); 
         */
        String in;
        in = JOptionPane.showInputDialog(null, "������� ������������� �����", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("�� ����� ������������� �����");
//JOptionPane.showMessageDialog(null, "�� ����� ������������� �����"); 
            } else {
                int summa = 1;
                i = 1;
                while (i <= n) {
                    summa *= i;
                    i++;
                }
                System.out.println("���������: " + summa);
            }

        } else {
            JOptionPane.showMessageDialog(null, "������! �� ������ �� �����!");
        }

    }
}
