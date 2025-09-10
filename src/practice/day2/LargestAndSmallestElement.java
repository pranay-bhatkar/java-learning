package practice.day2;


public class LargestAndSmallestElement {
    // with sorted array -> Arrays.sort() changes the original array (not always desirable).
//    public static void  findLargestAndSmallestElement(int arr[] ){
//        Arrays.sort(arr);
//        System.out.println("smallest element :" + arr[0]);
//        System.out.println("largest element :" + arr[arr.length-1]);
//    }

    public static void findLargestAndSmallestElement(int arr[]) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}