package Lesson9;

import javax.swing.JOptionPane;

public class Lesson9 {

    public static void main(String[] args) {
        String a;
        a = JOptionPane.
                showInputDialog("������� �� ������������� ����� �����", JOptionPane.QUESTION_MESSAGE);

        if (a.equals("")) {
            JOptionPane.
                showMessageDialog(null, "�� �� ����� �����");
            return;

        }
        Double a1 = Double.parseDouble(a);
        if (a1 < 0) {
            JOptionPane.
                showMessageDialog(null, "�� ����� ������������� �����");
            return;
        }
        if (a1 % 1 != 0) {
            JOptionPane.
                showMessageDialog(null, "�� ����� �� ����� �����");
            return;
            
        }
        double x=1;
        double i=1;
       while (i<=a1){
           x*=i;
           i++;
     }
       JOptionPane
               .showMessageDialog(null, "���������� ���������� ����� = "+x);
     System.out.println(x); 
    }
}
