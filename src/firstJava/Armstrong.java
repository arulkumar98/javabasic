package firstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number one:");
        int low = in.nextInt();
        System.out.print("enter number two:");
        int high = in.nextInt();

        for (int i = low; i <high ; i++) {
            int check , rem,sum = 0;
            check = i;
            while (check !=0){
                rem = check%10;
                sum = sum +(int)(Math.pow(rem,3));
                check = check/10;
            }
            if (sum == i){
                System.out.println(" "+ i+ " ");
            }
        }


    }
}
