/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson7;

import javax.swing.JOptionPane;

/**
 *
 * @author Кирилл
 */
public class Lesson7 {

    public static void main(String[] args) {
      String in;
        String in2;
        in = JOptionPane
                .showInputDialog("Введите первое первое положительное число");
        if (in.equals("")) {
            JOptionPane
                    .showMessageDialog(null, "Вы не ввели число");
            return;

        }
        in2 = JOptionPane
                .showInputDialog("Введите второе число отличное от0");
        if (in2.equals("")) {
            JOptionPane.
                    showMessageDialog(null, "Вы не ввели число");
            System.exit(0);
        }
        int a = Integer.parseInt(in);
        int b = Integer.parseInt(in2);

        if (b == 0) {
            JOptionPane.
                    showMessageDialog(null, "Результат: бесконечность");
            return;
        }
        {
            if (!in.equals("") && !in2.equals("")) {

                JOptionPane.showMessageDialog(null, "Первое число " + in + " Второе число " + in2 + " Результат деления  " + (a / b));

            }else {
            }
        }
    }
   
}
