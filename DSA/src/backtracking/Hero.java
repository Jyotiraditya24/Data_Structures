package backtracking;

public class Hero {
    static class Pair {
        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 7, 2, 8, 6};
        Pair result = findMinMax(arr, 0, arr.length - 1);
        System.out.println("Minimum: " + result.min);
        System.out.println("Maximum: " + result.max);
    }

    public static Pair findMinMax(int[] arr, int low, int high) {
        if (low == high) {
            return new Pair(arr[low], arr[low]);
        }

        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                return new Pair(arr[low], arr[high]);
            } else {
                return new Pair(arr[high], arr[low]);
            }
        }

        int mid = (low + high) / 2;
        Pair leftPair = findMinMax(arr, low, mid);
        Pair rightPair = findMinMax(arr, mid + 1, high);

        int min = Math.min(leftPair.min, rightPair.min);
        int max = Math.max(leftPair.max, rightPair.max);

        return new Pair(min, max);
    }
}
