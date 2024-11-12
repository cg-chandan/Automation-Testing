package Tasks.Task_24102024;

//written using online compiler
import java.util.Scanner;
class Operations_without_ide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the variable a:");
        int a = sc.nextInt();
        System.out.print("Enter the variable b:");
        int b = sc.nextInt();
        int sum_result = sum(a,b);
        int sub_result = sub(a,b);
        int mul_result = mul(a,b);
        int div_result = div(a,b);
        System.out.println("Sum of a and b is:"+sum_result);
        System.out.println("Subtract of a and b is:"+sub_result);
        System.out.println("Multiplication of a and b is:"+mul_result);
        System.out.println("Division of a and b is:"+div_result);




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