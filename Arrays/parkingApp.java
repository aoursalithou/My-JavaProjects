
import java.util.Arrays;

public class parkingApp {


        public static void main(String[] args) {
            int[][] arr = {{1012, 1}, {1136, 0}, {1317, 1}, {1417, 0}, {1015, 1}, {1020, 0}};

            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); // Ταξινόμηση με βάση την ώρα άφιξης/αναχώρησης

            int maxCars = maxCarsParked(arr);
            System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα ταυτόχρονα είναι: " + maxCars);
        }

        public static int maxCarsParked(int[][] arr) {
            int maxCars = 0;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i][1] == 1) { // Άφιξη
                    count++;
                    maxCars = Math.max(maxCars, count);
                } else { // Αναχώρηση
                    count--;
                }
            }

            return maxCars;
        }
    }


