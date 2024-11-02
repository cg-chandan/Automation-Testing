package Tasks.Task_23102024;
import java.util.Scanner;
public class operations_through_Functions {
    public static void main(String[] args) {
        System.out.println("Enter value a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter value b: ");
        int b = sc.nextInt();
        int addition = sum(a,b);
        System.out.println("Addition of a and b is:"+ addition);
      int subtraction = sub(a,b);
        System.out.println("subtraction of a and b is:"+ subtraction);
        int multiplication = mul(a,b);
        System.out.println("Multiplication of a and b is: "+ multiplication);

        int division = div(a,b);
        System.out.println("Division of a and b is: "+ division);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
}
