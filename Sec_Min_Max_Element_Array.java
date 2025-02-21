
public class Sec_Min_Max_Element_Array {

    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 455, 6, 456, 8, 111, 10};
        int smallest1 = arr[0];
        int largest1 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest1) {
                smallest1 = arr[i];
            } else if (arr[i] > largest1) {
                largest1 = arr[i];
            }
        }

        int smallest2 = largest1;
        int largest2 = smallest1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest2 && arr[i] != smallest1) {
                smallest2 = arr[i];
            }
            if (arr[i] > largest2 && arr[i] != largest1) {
                largest2 = arr[i];
            }
        }

        System.out.println("Second Smallest: " + smallest2 + "\nSecond Largest: " + largest2);
    }
}
