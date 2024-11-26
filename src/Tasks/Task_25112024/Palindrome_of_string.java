package Tasks.Task_25112024;

import java.util.Scanner;

public class Palindrome_of_string {
    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner sc = new Scanner(System.in);
        String p =sc.next();
        if(isPalindrome(p)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end =  str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }

        }
        return true;
    }
}
