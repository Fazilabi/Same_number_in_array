import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list1 = { 9, 0, 2, 11, 6, 0, 21, 11, 2, 9, 4, 5, 3, 6, 4,  3, 12};
        Arrays.sort(list1);
        int[] duplicate = new int[list1.length];
        int counter = 0;
        for (int i = 0; i < list1.length; i++) {
            for (int k = 0; k < list1.length; k++) {
                if ((i != k) && (list1[i] == list1[k])) {
                    if (!isFind(duplicate, list1[i])) {

                        duplicate[counter++] = list1[i];
                        break;
                    }
                }
            }
        }
        for (int value : duplicate) {
            if ((value != 0)&& value%2==0) {
                System.out.println(value);
            }
        }


    }
}