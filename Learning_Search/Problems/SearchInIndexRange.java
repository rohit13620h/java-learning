package idea.src.Learning_Search.Problems;

public class SearchInIndexRange {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 6, 5, 5, 1, 8, 5, 6};
        int target = 5, start = 3, end = 6;
        System.out.println(check(arr, target, start, end));

    }

    static boolean check(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < start) {
                continue;
            }
            if (arr[i] == target) {
                return true;
            }
            if (i >= end) {
                break;
            }
        }
        return false;
    }
}
