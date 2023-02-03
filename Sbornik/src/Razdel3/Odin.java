package Razdel3;

import javax.swing.JOptionPane;

public class Odin {
    public static void main(String[] args) {
        String f;
        double c;
        f = JOptionPane.showInputDialog("Введите температуру по Фарингейту: ",+ JOptionPane.QUESTION_MESSAGE);
        double f1 = Double.parseDouble(f);
        c = (5.0*(f1-32))/9;
        System.out.println("Температура в цельсиях: "+ c); 
        
        
    }
    
}
