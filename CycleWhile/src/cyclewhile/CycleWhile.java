package cyclewhile;

import javax.swing.JOptionPane;

public class CycleWhile {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(""); 
        String in;
        in = JOptionPane.showInputDialog("������� ������������� �����", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("�� ����� ������������� �����");

            } else {
                int summa = 0;
                i = 1;
                while (i <= n) {
                    summa += 1;
                    i++;
                }
                System.out.println("����� ����� �� 0 ��  " + n + "  =  " + summa);
            }
        } else {
            System.out.println("�� �� ����� �����");
        }
    }

}
