import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }

        Main object = new Main();
        System.out.println(object.jump(arr));

    }

        boolean jump (int[] arr) {
        int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > count) {
                    return false;
                }
                count = Math.max(count, i + arr[i]);
            }
            return true;

        }

}