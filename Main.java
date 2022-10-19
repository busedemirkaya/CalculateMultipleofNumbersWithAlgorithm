import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        // multiple 4
        System.out.println("The numbers that are less than the number you entered and a multiple of 4:");
        for (int i=1;i<=n;i*=4) {
            System.out.println(i);

        }
        // multiple 5
        System.out.println("The numbers that are less than the number you entered and a multiple of 5:");
        for (int i = 1; i <= n ; i*=5) {
            System.out.println(i);
        }


    }
}