import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * n) - (2*i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
