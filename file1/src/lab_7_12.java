import java.sql.Struct;
import java.util.*;

public class lab_7_12 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number>");
            arr[i] = in.nextInt();
        }
        in.close();

        for (int i = 0, count = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == j && i != 4 && j != 4) {
                    continue;
                } else if (arr[i] == arr[j] && i != 4 && j != 4) {
                    //flag = false;
                    break;
                } else if (j == arr.length - 1 && arr[i] != arr[j]) {
                    //System.out.print(arr[i] + " ");
                    flag = true;
                }
            }
            if (flag) {
                System.out.println(arr[i] + " ");
            }
        }


    }
}
