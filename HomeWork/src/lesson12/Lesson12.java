package lesson12;

public class Lesson12 {

    public static void main(String[] args) {
        double[] arr = {2.2, 1.3, 2.7, 5.8, 7.4};
        double summ = 0;
        double umn = 1;
        int i = 0;
        while (i < arr.length) {
            summ = summ+arr[i];
            //summ = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
            i++;

        }
        System.out.println(summ);
        for (i =0; i<arr.length; i++){
            umn = umn*arr[i];
        }
            System.out.println(umn); 
    }

}
