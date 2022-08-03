package firstJava;

import java.util.Scanner;

public class grettings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Name :");
        String name = in.nextLine();
        grettingfun(name);

    }

    public static void grettingfun(String name){
        String massage  = "Have a Great Day";
        System.out.println( name + " " + massage);
    }
}
