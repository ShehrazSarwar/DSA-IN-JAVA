public class Min_Max_Eelement_Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 55, 6, 7, 8, 11, 10};
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest + "\nLargest: " + largest);
    }
}
