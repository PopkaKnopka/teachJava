package Lesson11;

import javax.swing.JOptionPane;


public class Lesson11 {
    public static void main(String[] args) {
    String n1;
    String n2;
    String n3;
    n1 = JOptionPane.
                showInputDialog("������� ������ �����");
    n2 = JOptionPane.
                showInputDialog("������� ������ �����");
    n3 = JOptionPane.showInputDialog("������� ���� �� �������� + - * /");
    
    int a = Integer.parseInt(n1);
    int b = Integer.parseInt(n2);
   // int c = Integer.parseInt(n3);
    int d=0;
    
   
       
        switch(n3){
            case "+":
              d =a+b;
              break;
            case "-":
              d=a-b;
              break;
            case "*":
              d=a*b;
              break;
            case "/":
              d=a/b;
              break;
            default:
              n3 = JOptionPane.showInputDialog("������� ���� �� �������� + - * /");
              break;
              
              
        }
        JOptionPane.showMessageDialog(null,"��������� �������� = "+ d );
    }
    }
    
    
    

