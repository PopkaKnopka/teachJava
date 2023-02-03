package Lesson10;

import javax.swing.JOptionPane;

public class Lesson10 {

    public static void main(String[] args) {
        String n1;
        while (true) {
            n1 = JOptionPane.showInputDialog("Введите положительное целое число");
            Double n = Double.parseDouble(n1);
            if (n <= 0 || n % 1 != 0) {
                JOptionPane.
                        showMessageDialog(null, "Вы ввели отрицательное или дробное число");
                continue;
            }
            JOptionPane.showMessageDialog(null, "Спасибо!");
            break;
        }
    }
}
