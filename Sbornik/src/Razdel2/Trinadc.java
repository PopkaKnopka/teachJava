package Razdel2;


public class Trinadc {

    public static void main(String[] args) {
        O4 dz4 = new O4();
        int xO4 = O4.x;
        int yO4 = O4.y;
        dz4.addO4(xO4, yO4);
        int resultO4= O4.z;
        System.out.println("Сумма переменных из задания 1.4 равна: " + resultO4+"\n");
        
        
        
        O5 dz5 = new O5();
        double xO5 = O5.x;
        dz5.addO5(xO5);
        double result1O5 = O5.a;
        double result2O5 = O5.b;
        System.out.println("Результат удвоения из задания 1.5 числа a равно: "+result1O5); 
        System.out.println("Результат утроения из задания 1.5 числа b равно: "+result1O5+"\n");
        
        O6 dz6 = new O6();
        int aO6 = O6.a;
        int bO6 = O6.b;
        dz6.add06(aO6,bO6);
        String resultO6 = O6.c;
        System.out.println("Присвоение целочисленных значений переменных a и b из задачи 1.6 строковой переменной с: "+ resultO6 + "\n");
        
        O7 dz7 = new O7();
        int xO7 = O7.x;
        dz7.addO7(xO7);
        int resultO7 = O7.y;
        System.out.println("Значение числа y из задачи 1.7 равна: " +resultO7); 
        
        
        
        
        
        
    }
}

class O4 {

    static int x;
    static int y;
    static int z;

    void addO4(int x, int y) {
        x = 5;
        y = 9;
        z = x + y;
    }
}
    class O5 {

        static double x;
        static double a;
        static double b;

        void addO5(double x) {
            x = 7.5;
            a = 2 * x;
            b = 3 * x;
        }
    }

    class O6 {

        static int a;
        static int b;
        static String c;
        void add06(int a, int b){
        a = 4;
        b = 7;
        c = String.valueOf(a) + String.valueOf(b);
    }

    }

    class O7 {

        static int x;
        static int y; 
        void addO7(int x){
            x = 12;
            y = x / 3;
            
        }
    }

