package Tasks.Task_22102024;
import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        int num=12345,reverse = 0;
        for(;num!=0;num = num/10){
           int remainder = num % 10;
            reverse =  reverse*10 +remainder;
        }
        System.out.println("Reverse of given number is:"+reverse);

    }
}
