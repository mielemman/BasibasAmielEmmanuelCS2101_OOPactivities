import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] num_array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            num_array[i] = input.nextInt();
        }

        double mean = getArrayMean(num_array, n);
        System.out.printf("Mean of array is: %.2f%n", mean);
    }
}