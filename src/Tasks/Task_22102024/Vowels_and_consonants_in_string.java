package Tasks.Task_22102024;

import java.util.Scanner;

public class Vowels_and_consonants_in_string {
    public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;

        System.out.println("Enter String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == 'a'|| chr == 'e' || chr == 'i' || chr == 'o' || chr =='u'){
                vCount++;
            } else if (chr >= 'a' && chr <='z') {
                 cCount++;
            }

        }
        System.out.println("Number of vowels in given string is:"+vCount+",Number of Consonants in given string is :"+cCount);
    }
}
