package Lesson10;

import javax.swing.JOptionPane;

public class Lesson10 {

    public static void main(String[] args) {
        String n1;
        while (true) {
            n1 = JOptionPane.showInputDialog("������� ������������� ����� �����");
            Double n = Double.parseDouble(n1);
            if (n <= 0 || n % 1 != 0) {
                JOptionPane.
                        showMessageDialog(null, "�� ����� ������������� ��� ������� �����");
                continue;
            }
            JOptionPane.showMessageDialog(null, "�������!");
            break;
        }
    }
}
