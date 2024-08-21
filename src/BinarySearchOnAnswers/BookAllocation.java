package BinarySearchOnAnswers;

import java.util.Collections;

public class BookAllocation {
    //brute force appraoch TC O(N * (sum(arr[])-max(arr[])+1)) SC O(1)
//    public static int bookAllocation(int arr[], int students){
//        int n = arr.length,low = Integer.MIN_VALUE, high = 0;
//        if (students > n) return -1;
//        for (int i=0;i<n;i++){
//            low = Math.max(low,arr[i]);
//            high += arr[i];
//        }
//        for (int pages=low;pages<=high;pages++){
//            if (countStudents(arr,pages) == students){
//                return pages;
//            }
//        }
//        return low;
//    }
    public static int countStudents(int arr[], int pages){
        int n = arr.length, students = 1, pageStudents = 0;
        for (int i=0;i<n;i++){
            if ((pageStudents + arr[i]) <= pages){
                pageStudents += arr[i];
            }else {
                students++;
                pageStudents = arr[i];
            }
        }
        return students;
    }

    //optimal approach TC O(N * log(sum(arr[])-max(arr[])+1)) SC O(1)
    public static int bookAllocation(int arr[], int students){
        int n = arr.length,low = Integer.MIN_VALUE, high = 0;
        if (students > n) return -1;
        for (int i=0;i<n;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        while (low <= high){
            int mid = (low+high)/2;
            int noOfStudents = countStudents(arr,mid);
            if (noOfStudents > students) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {25,46,28,49,24};
        int students = 4;
        System.out.print(bookAllocation(arr,students));
    }
}
