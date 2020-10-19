import java.util.Arrays;
import java.util.Scanner;

public class ex_2_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Enter 1st val: ");
        arr[0] = in.nextInt();
        System.out.print("Enter 2nd val: ");
        arr[1] = in.nextInt();
        System.out.print("Enter 3rd val: ");
        arr[2] = in.nextInt();
        in.close();
        System.out.println("____________________");
        System.out.println("Sum = " + Arrays.stream(arr).sum());
        System.out.println("Average = " + (arr[0] + arr[1] + arr[2]) / Arrays.stream(arr).count());
        System.out.println("Min value = " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Max value = " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Product of values = " + arr[0] * arr[1] * arr[2]);
    }
}
