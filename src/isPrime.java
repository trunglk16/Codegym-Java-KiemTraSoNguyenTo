//import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Nhap so can kiem tra");
        int number = input.nextInt();
        boolean flag = true;

        if (number < 2){
            flag = false;
        }
        else if (number == 2){
            flag = true;
        }else if (number % 2 == 0){
            flag = false;
        }
        else{
            for ( int i = 3; i < Math.sqrt(number); i+=2  ){
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(number + " la so nguyen to");
        }else {
            System.out.println(number + " khong phai la so nguyen to");
        }

    }
}
