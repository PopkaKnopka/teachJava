package Lesson8;

import javax.swing.JOptionPane;

public class Lesson8 {

    public static void main(String[] args) {
        String n1;
        n1 = JOptionPane.
                showInputDialog("������� ������������� ����� �����");

        if (n1.equals("")) {
            JOptionPane.
                    showMessageDialog(null, "�� �� ����� �����");
            return;
        }

        double a = Double.parseDouble(n1);
        if (a < 0) {
            JOptionPane.
                    showMessageDialog(null, "�� ����� ������������� �����");
            return;
        }
        if (a == 0) {
            JOptionPane.
                    showMessageDialog(null, "�� ����� 0");
            return;
        }

        if (a % 1 != 0) {
            JOptionPane.
                    showMessageDialog(null, "�� ����� �� ����� �����");
            return;

        }
        double summa = 0;
        for (double i = 1; i <= a; i += 1) {
            summa += i;
        }
        System.out.println(summa);
        JOptionPane.
                showMessageDialog(null, "����� ����� �� 1 �� " + a + "  =  " + summa);
    }

}