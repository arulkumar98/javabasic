package firstJava;

import java.util.Scanner;

public class addOReven {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
    int num = in.nextInt();

    if (num%2 == 0){
        System.out.println(num + " It's a even number");
    }else
        System.out.println(num +" It's a odd number");

}

}
