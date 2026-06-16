import java.util.ArrayList;

public class generate {

    static void subsets(int[] arr, int index, ArrayList<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Exclude current element
        subsets(arr, index + 1, current);

        // Include current element
        current.add(arr[index]);
        subsets(arr, index + 1, current);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2};

        subsets(arr, 0, new ArrayList<>());
    }
}