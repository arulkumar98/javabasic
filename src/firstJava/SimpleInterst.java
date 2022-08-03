package firstJava;

import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // input the PTR
        System.out.print("Enter the amount :");
        int p = in.nextInt();
        System.out.print("Enter the Time in years :");
        int t = in.nextInt();
        System.out.print("Enter the Rate of interest without % :");
        int r = in.nextInt();

        int simpleInterest = (p*t*r)/100;
        System.out.println("You're simple interest is : " + simpleInterest);
    }
}
