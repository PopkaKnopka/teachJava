package Lesson2;

import com.sun.jdi.IntegerType;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Кирилл
 */
public class Lesson2 {

    public static void main(String[] args) {

        String a = "53.5";
        double a1 = Double.parseDouble(a);
        System.out.println(a1);
        char b = 'K';
        System.out.println("b");
        int age = 29;
        System.out.println(age);
        String n = "28";
        int n1 = Integer.parseInt(n);
        System.out.println(n1);
        String d = "55.6";
        double d1 = Double.parseDouble(d);
        System.out.println(d1); 
        JOptionPane.showMessageDialog(null,"Потихоньку движемся");
        JOptionPane.showMessageDialog(null, "Закрепляем");
        JOptionPane.showMessageDialog(null, "Не останаливаемся");
        JOptionPane.showMessageDialog(null, "Терпение и труд всё перетрут");
        JOptionPane.showMessageDialog(null, "Главное работать и учить, искать и стараться понимать");
        JOptionPane.showMessageDialog(null, "Не останавливайся");

    }

}
