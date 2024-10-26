package Tasks.Task_18102024;

public class Simple_Calculator {
    public static void main(String args[]){
        Scanner sc= new scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        addition(a,b);
        System.out.println("Addition is:");
        subtraction(a,b);


}
}
