package Lesson8;

import javax.swing.JOptionPane;

public class Lesson8 {

    public static void main(String[] args) {
        String n1;
        n1 = JOptionPane.
                showInputDialog("Введите положительное целое число");

        if (n1.equals("")) {
            JOptionPane.
                    showMessageDialog(null, "Вы не ввели число");
            return;
        }

        double a = Double.parseDouble(n1);
        if (a < 0) {
            JOptionPane.
                    showMessageDialog(null, "Вы ввели отрицательное число");
            return;
        }
        if (a == 0) {
            JOptionPane.
                    showMessageDialog(null, "Вы ввели 0");
            return;
        }

        if (a % 1 != 0) {
            JOptionPane.
                    showMessageDialog(null, "Вы ввели не целое число");
            return;

        }
        double summa = 0;
        for (double i = 1; i <= a; i += 1) {
            summa += i;
        }
        System.out.println(summa);
        JOptionPane.
                showMessageDialog(null, "Сумма чисел от 1 до " + a + "  =  " + summa);
    }

}