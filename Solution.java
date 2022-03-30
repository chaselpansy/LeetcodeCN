import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findKthNumber(int n, int k) {
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return String.valueOf(o1).compareTo(String.valueOf(o2));
            }
        });

       // fixme

        return 0;
    }

    public static void main(String[] args) {

    }
}