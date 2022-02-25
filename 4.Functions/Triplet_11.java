
// Q11. Write a Function to check if a given Triplet is a Pythagoren Triplet or Not.

public class Triplet_11 {
    public static void main(String[] args) {

        int arr[] = { 3, 1, 4, 6, 5 };
        int n = arr.length;

        System.out.println(Triplet(arr, n));
    }

    static boolean Triplet(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if (x == y + z || y == x + z || z == y + x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
