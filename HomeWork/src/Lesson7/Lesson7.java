/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson7;

import javax.swing.JOptionPane;

/**
 *
 * @author ������
 */
public class Lesson7 {

    public static void main(String[] args) {
      String in;
        String in2;
        in = JOptionPane
                .showInputDialog("������� ������ ������ ������������� �����");
        if (in.equals("")) {
            JOptionPane
                    .showMessageDialog(null, "�� �� ����� �����");
            return;

        }
        in2 = JOptionPane
                .showInputDialog("������� ������ ����� �������� ��0");
        if (in2.equals("")) {
            JOptionPane.
                    showMessageDialog(null, "�� �� ����� �����");
            System.exit(0);
        }
        int a = Integer.parseInt(in);
        int b = Integer.parseInt(in2);

        if (b == 0) {
            JOptionPane.
                    showMessageDialog(null, "���������: �������������");
            return;
        }
        {
            if (!in.equals("") && !in2.equals("")) {

                JOptionPane.showMessageDialog(null, "������ ����� " + in + " ������ ����� " + in2 + " ��������� �������  " + (a / b));

            }else {
            }
        }
    }
   
}
