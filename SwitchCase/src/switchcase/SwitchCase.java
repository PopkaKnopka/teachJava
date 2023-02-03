/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase;

/**
 *
 * @author Кирилл
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 4;
        String s;
        if (a == 1) {
            s = "odin";
        } else if (a == 2) {
            s = "dva";
        } else if (a == 3) {
            s = "tri";
        } else {
            s = "drygoe chislo";
        }
        System.out.println(s);
        a = 1;
        while (true) {
            switch (a) {
                case 1:
                    s = "odin";
                    break;
                case 2:
                    s = "Dva";
                    break;
                case 3:
                    s = "tri";
                    break;
                default:
                    s = "drygoe chislo";
            }

            System.out.println(a + "  -  " + s);
            a++;
            if (a > 4) {
                break;
            }
        }
    }

}
