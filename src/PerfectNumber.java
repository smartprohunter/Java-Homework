import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
    public boolean isPerfectNumber(int num) {
        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }

        return sum == num && num != 1;
    }

    public static void main(String[] args) {
        PerfectNumber instance = new PerfectNumber();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a value: 0-end, 1-find perfect number, 2- find average.");
        int command = reader.nextInt();
        if (command == 0) {
            System.out.println("Exiting...");
            System.exit(0);


        }
        System.out.println("Enter an interval.");
        int start = reader.nextInt();
        int end = reader.nextInt();

        if (command == 1) {
            ArrayList<Integer> perfectNumbers = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                if (instance.isPerfectNumber(i)) {
                    perfectNumbers.add(i);

                }
            }
            System.out.println(perfectNumbers);
        } else {
            int intervalLength = start - end;
            int sum = intervalLength * (start + end) / 2;
            double average = (double) sum / intervalLength;


        }
    }
}
