import java.util.Scanner;
public class BubbleSort {
    public void bs(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Take array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Printing array elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        BubbleSort obj = new BubbleSort();
        obj.bs(arr);
        System.out.println("Sorted array");
        obj.print(arr);
    }
}