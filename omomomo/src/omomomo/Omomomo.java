/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package omomomo;
import javax.swing.JOptionPane;
public class Omomomo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String n1="";
        do {
            n1 = JOptionPane.showInputDialog("������� ������������� ����� �����");
            double n = Double.parseDouble(n1);
            if (n <= 0 || n % 1 != 0) {
                JOptionPane.
                        showMessageDialog(null, "�� ����� ������������� ��� ������� �����");
                continue;
            }break;
            
        } while (true);
            JOptionPane.showMessageDialog(null, "�������!");
    }
}
