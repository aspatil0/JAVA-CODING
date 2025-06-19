import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array Size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input: Array Elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Display the array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // 2. Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 3. Find maximum and minimum
        int max = arr[n - 1];
        int min = arr[0];
        System.out.println("Max: " + max + ", Min: " + min);

        // 4. Calculate average
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / n;
        System.out.println("Average: " + average);

        // 5. Search for an element (Linear Search)
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }

        // 6. Reverse the array
        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
