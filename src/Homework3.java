import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요?: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.print("수를 입력하세요: ");
        for(int i=0; i<count; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);

        sc.close();
    }
}
