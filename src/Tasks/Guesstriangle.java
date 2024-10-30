package Tasks;
import java.util.Scanner;

public class Guesstriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double side1, side2, side3;
        System.out.println("Enter the lengths of the three sides of the triangle:");
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();
        side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }

    }
    }

