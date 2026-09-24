import java.util.*;

public class Unionarrays {

    public static void union(int[] arr1, int[] arr2) {

        // ArrayList to store the final union
        ArrayList<Integer> al = new ArrayList<>();

        // *******IMP POINT***** 
        // sometimes there me be cases where arr is not sorted so first sort it using Arrays.sort()

        // Two pointers for both sorted arrays
        int i = 0;
        int j = 0;

        // Traverse both arrays together
        while (i < arr1.length && j < arr2.length) {

            // If arr1 element is smaller
            if (arr1[i] < arr2[j]) {

                // Add only if it is not a duplicate
                // al.get(al.size() - 1) gives the last element
                if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }

                // Move arr1 pointer
                i++;
            }

            // If arr2 element is smaller
            else if (arr1[i] > arr2[j]) {

                // Add only if it is not a duplicate
                if (al.isEmpty() || al.get(al.size() - 1) != arr2[j]) {
                    al.add(arr2[j]);
                }

                // Move arr2 pointer
                j++;
            }

            // If both elements are equal
            else {

                // Add the element only once
                if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }

                // Move both pointers
                i++;
                j++;
            }
        }

        // If elements are remaining in arr1
        while (i < arr1.length) {

            // Add only if it is not a duplicate
            if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
                al.add(arr1[i]);
            }

            i++;
        }

        // If elements are remaining in arr2
        while (j < arr2.length) {

            // Add only if it is not a duplicate
            if (al.isEmpty() || al.get(al.size() - 1) != arr2[j]) {
                al.add(arr2[j]);
            }

            j++;
        }

        // Print the union
        for (int k : al) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {

        // Arrays MUST be sorted for two-pointer approach
        int[] arr1 = {1, 1, 2, 3, 6};
        int[] arr2 = {2, 8, 10, 10};

        union(arr1, arr2);
    }
}