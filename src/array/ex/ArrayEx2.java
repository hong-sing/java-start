package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요:");

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i+1 != arr.length) {
                System.out.print(", ");
            }
        }
    }
}
