package firstJava;

import java.util.Scanner;

public class palandrome {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter any  String below");
                String input = in.nextLine().replace(" ","");
// Strings are immutable we can't change the value, so I create a new String to store the value.
                String reverse = "";
                for (int i = input.length()-1; i >= 0; i--) {
                       reverse +=  input.charAt(i);
                }
                Palandrom(input,reverse);
                boolean palandrome = true;
                if (palandrome == true){
                        System.out.println("IT'S A PALINDROME ");
                }else
                        System.out.println("not a palindrome");

        }

        public static Boolean Palandrom(String orginal , String reverse){
                for (int i = 0; i < reverse.length(); i++) {
                      if (orginal.charAt(i) == reverse.charAt(i)){
                              return true;
                      }
                }
                return false;
        }

}
