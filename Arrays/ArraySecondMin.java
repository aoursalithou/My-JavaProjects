public class ArraySecondMin {
    public static void main(String[] args) {
        int[] arr = {7, 3, 6,16};
        int minPosition;
        int minPosition2;

        minPosition=findSecondMin(arr);
        System.out.printf("second min:%d, secondminpossition: %d" , arr[minPosition], minPosition);
    }

    public static int findSecondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int minPosition = -1;
        int minPosition2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
                minPosition2 = minPosition;
                minPosition = i;
            }
            else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
                minPosition2 = i;
            }
        }



        return minPosition2;
    }
}


