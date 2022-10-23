import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 1, b = 1;
        
        System.out.println("Lütfen sayıyı giriniz:");
        int n = sc.nextInt();

        for(int a = n ; a >= 0 ; a--){
            d = d * 4;
            System.out.println(d);
        }
        for(int a = n ; a >= 0 ; a--){
            b = b * 5;
            System.out.println(b);
        }
    }
}
