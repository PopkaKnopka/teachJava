package variables;

public class Variables {

    public static void main(String[] args) {
        byte b = 10;
        short s = 2000;
        int i = 2999999;
        long n = -939393930;
        float f =5.7f;
        double d = 35.39;
        boolean bool = true; // false
        char c ='D';
        String str = "My string";
        
        b = 20;
        String result = "";
        result += "Byte b =  "+ b + "\n";
        result += "Short s = " + s + "\n";
        result += "int i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "float f = " + f + "\n";
        result += "float f = " + f + "\n";
        result += "double d = " + d + "\n";
        result += "boolean bool = " + bool + "\n";
        result += "char c = " + c + "\n";
        result += "String str = " + str + "\n";
        System.out.println(result);
        
        String str_n = "53";
        int summa = Integer.parseInt(str_n) + 20;
        System.out.println(summa);
                
    }
}
