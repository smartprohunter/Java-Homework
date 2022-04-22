import java.util.Scanner;

public class TriangleOperations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter three lines.");
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();


        if ((a + b) < c || (a + c) < b || (c + b) < a) {
            System.out.println("Wrong data");
        } else if (a == b && b == c)
            System.out.println("Ravnostranen");
        else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
            System.out.println("Provougulen");
        else if (a == b || c == a || c == b)
            System.out.println("Ravnobedren");
        else {
            System.out.println("Raznostranen");
        }

    }


}

