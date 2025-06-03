package idea.src;

public class OrderagnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 6, 8, 9, 12, 564, 8959};
        int[] arr= {987,654,321,98,87,65,54,6,2,1};

        int target = 321;
        boolean check = false;
        if (arr[0] < arr[arr.length - 1]) {
            check = true;
        }
        int start = 0, end = arr.length - 1, mid;

        while (true) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            }
            if (check) {

                if (target < arr[mid]) {
                    end = mid - 1;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {

                if (target < arr[mid]) {
                    start = mid + 1;
                }
                if (target > arr[mid]) {
                    end = end -1;
                }
            }

        }
    }
}
