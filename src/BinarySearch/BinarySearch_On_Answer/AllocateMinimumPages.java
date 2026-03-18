package BinarySearch.BinarySearch_On_Answer;

import java.util.Arrays;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int n = arr.length;

        int ans = findPages(arr, k, n);
        System.out.println("Minimum pages required: " + ans);
    }

    private static int findPages(int[] arr, int k, int n) {

        // Lower bound = maximum single book (because 1 student must take at least this much)
        int low = Arrays.stream(arr).max().getAsInt();

        // Upper bound = sum of all pages (one student takes all books)
        int high = Arrays.stream(arr).sum();

        // Binary search for minimum possible maximum pages per student
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int requiredStudents = findStudent(arr, mid);

            // If we need more students than allowed → pages too small → increase mid
            if (requiredStudents > k) {
                low = mid + 1;
            }
            // If required students <= k → mid is valid → try smaller max pages
            else {
                high = mid - 1;
            }
        }
        return low;  // lowest feasible maximum pages
    }

    // Function to calculate number of students needed if max pages per student = mid
    private static int findStudent(int[] arr, int mid) {

        int student = 1; // start with first student
        int pages = 0;   // current pages assigned to this student

        for (int ele : arr) {

            // If adding this book stays within limit → assign it
            if (pages + ele <= mid) {
                pages += ele;
            }
            // Otherwise → new student needed
            else {
                student++;
                pages = ele;  // Load current book to next student
            }
        }
        return student;
    }
}