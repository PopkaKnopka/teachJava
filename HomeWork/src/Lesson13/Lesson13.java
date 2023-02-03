package Lesson13;

public class Lesson13 {

    public static void main(String[] args) {
     // int arr[][]= new int [2][3];                                                  //         0  1  2
        int arr[][] = {{2, 4, 7},                                                     //     0   2  4  7   
                       {1, 3, 6}};                                                    //     1   1  3  6   
                                                                                      //
        int summ1 = 0;
        int summ2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                summ1 = summ1 + arr[i][j];
            }
        }
        System.out.println("сумма чисел в массиве: " + summ1);
        System.out.println(" ");
        int Str1 = 0;
        for (int i = 0; i < arr[0].length; i++){
            Str1 += arr[0][i];
        }
            System.out.println("Сумма первой строки: "+Str1); 
            System.out.println(" ");
        int Str2=0;
        for (int i = 0; i < arr[1].length; i++){
            Str2 += arr[1][i];
        }
            System.out.println("Сумма второй строки: "+Str2); 
            System.out.println(" "); 
            System.out.println("Новый массив: "); 
        int arr_1[]= {Str1, Str2};
        for (int i = 0; i < arr_1.length; i++){
        System.out.println( + arr_1[i]);
        
    }
        
        
         
        
        
        
    }
        
}
